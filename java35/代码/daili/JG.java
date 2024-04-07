package daili;

public class JG implements Star{
    private String name;

    public JG() {
    }

    public JG(String name) {
        this.name = name;
    }

    public String sing(String name){
        System.out.println(this.name+"正在唱"+name);
        return "谢谢";
    }
    public void dance (){
        System.out.println(this.name+"正在跳舞");
    }
    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "JG{name = " + name + "}";
    }
}
