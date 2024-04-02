package com.itheima.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class NoteJFrame extends JFrame implements ActionListener {


    //创建三个按钮
    JButton add = new JButton("添加");
    JButton update = new JButton("修改");
    JButton delete = new JButton("删除");

    //创建表格组件
    JTable table;

    //创建菜单的导入和导出
    JMenuItem exportItem = new JMenuItem("导出");
    JMenuItem importItem = new JMenuItem("导入");
    Object[][] tabledatas = null ;
    public NoteJFrame(Object[][]tabledatas) {
        this.tabledatas = tabledatas;
        //初始化界面
        initFrame();
        //初始化菜单
        initJmenuBar();
        //初始化组件
        initView();
        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前那个组件被点击
        Object obj = e.getSource();
        if(obj == add){
            this.setVisible(false);
            new AddJFrame(tabledatas);

        }else if(obj == update){
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            int rows = table.getSelectedRow();
            if(rows==-1){
                showJDialog("未选择");
                return;
            }
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，跳转添加界面
            this.setVisible(false);
            new UpdateJFrame(rows,tabledatas);

            //获取用户选择了表格中的哪一行
            //i = 0: 表示用户选择了第一行
            //i = 1: 表示用户选择了第一行
            //i有两个作用：
            //i小于0，表示用户没有选择，此时无法修改
            //i大于等于0：通过这个行数就可以获取二维数组中对应的数据

        }else if(obj == delete){
            System.out.println("删除按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，弹框提示：是否确定删除。此时提示的弹框用showChooseJDialog方法
            int row = table.getSelectedRow();
            if(row==-1){
                showJDialog("未选择");
                return;
            }
            Object i = (row +1);
            //作用：展示一个带有确定和取消按钮的弹框
            //方法的返回值：0 表示用户点击了确定
            //             1 表示用户点击了取消
            //该弹框用于用户删除时候，询问用户是否确定删除
            System.out.println(tabledatas[row][0]);
            System.out.println(i);
            System.out.println("是否删除选中数据");
            if(showChooseJDialog()==0){
                this.tabledatas = Arrays.stream(tabledatas).filter(new Predicate<Object[]>() {
                    @Override
                    public boolean test(Object[] objects) {
                        boolean flag = (!objects[0].equals(i));
                        return  flag;
                    }
                }).toArray(Object[][]::new);
                for(int j=row;j<tabledatas.length;j++){

                    this.tabledatas[j][0] = (j+1)+"";
                }
                this.setVisible(false);
                new NoteJFrame(tabledatas);
            }

        }else if(obj == exportItem){
            /*ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("diary\\save"));
            ZipEntry ze = new ZipEntry("diary\\save"+"save.zip");
            zos.putNextEntry(ze);
            zos.write*/
            StringBuilder sb = new StringBuilder();
            for (Object[] tabledata : tabledatas) {
                sb.append(tabledata[0]+"=");
                sb.append(tabledata[1]+"=");
                sb.append(tabledata[2]+"&");
            }
            try{
                ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("diary\\save\\data.zip"));
                ZipEntry ze = new ZipEntry("data.data");
                zos.putNextEntry(ze);
                String str = sb.toString();
                for(int i=0;i<str.length();i++){
                    zos.write(str.charAt(i));
                }
                zos.closeEntry();
                zos.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else if(obj == importItem){
            String str = null;
            try {
                ZipInputStream zis = new ZipInputStream(new FileInputStream("diary\\save\\data.zip"));
                ZipEntry ze = zis.getNextEntry();
                StringBuilder sb = new StringBuilder();
                int b ;
                while((b=zis.read())!=-1){
                    sb.append((char)b);
                }
                System.out.println(sb);
                str = sb.toString();
            } catch (IOException ex) {
                ex.printStackTrace();
            };
            Object[] row = str.split("&");
            Object[][] tb = new Object[row.length][3];
            for(int i=0;i<row.length;i++){
                Object[] t =  row[i].toString().split("=");
                tb[i][0] = i+1;
                tb[i][1] = t[1];
                tb[i][2] = t[2];
            }
            this.setVisible(false);
            new NoteJFrame(tb);
        }
    }

    //初始化组件
    private void initView() {
        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);

        //定义表格的标题
        Object[] tableTitles = {"编号", "标题", "正文"};
        //定义表格的内容
        //二维数组中的每一个一维数组，是表格里面的一行数据


        //定义表格组件
        //并给表格设置标题和内容
        table = new JTable(tabledatas, tableTitles);
        table.setBounds(40, 70, 504, 380);

        //创建可滚动的组件，并把表格组件放在滚动组件中间
        //好处：如果表格中数据过多，可以进行上下滚动
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(40,70,504,380);
        this.getContentPane().add(jScrollPane);

        //给三个按钮设置宽高属性，并添加点击事件
        add.setBounds(40, 466, 140, 40);
        update.setBounds(222, 466, 140, 40);
        delete.setBounds(404, 466, 140, 40);

        add.setFont(new Font("宋体", Font.PLAIN, 24));
        update.setFont(new Font("宋体", Font.PLAIN, 24));
        delete.setFont(new Font("宋体", Font.PLAIN, 24));

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);


        this.getContentPane().add(add);
        this.getContentPane().add(update);
        this.getContentPane().add(delete);
    }

    //初始化菜单
    private void initJmenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");

        //把5个存档，添加到saveJMenu中
        functionJMenu.add(exportItem);
        functionJMenu.add(importItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);

        //绑定点击事件
        exportItem.addActionListener(this);
        importItem.addActionListener(this);

        //给菜单设置颜色
        jMenuBar.setBackground(new Color(230,230,230));

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(new Color(212,212,212));
    }

    //只创建一个弹框对象
    JDialog jDialog = new JDialog();
    //因为展示弹框的代码，会被运行多次
    //所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
    //直接调用就可以了。
    //展示弹框
    public void showJDialog(String content) {
        if(!jDialog.isVisible()){
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(200, 150);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 200, 150);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }

    /*
    *  作用：展示一个带有确定和取消按钮的弹框
    *
    *  方法的返回值：
    *       0 表示用户点击了确定
    *       1 表示用户点击了取消
    *       该弹框用于用户删除时候，询问用户是否确定删除
    * */
    public int showChooseJDialog() {
        return JOptionPane.showConfirmDialog(this, "是否删除选中数据？","删除信息确认",JOptionPane.YES_NO_OPTION);
    }
}
