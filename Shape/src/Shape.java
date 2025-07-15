//一个类最多继承一个类  单继承
//Object是所有类的父类
public abstract class Shape extends Object{
    private String type;
    public static int num;         //静态变量

    public Shape(String type){
        this.type = type;
        num ++;
    }

    public abstract double area();

    //Object类是所有类的父类，相当于有一个extends Object
    @Override     //覆盖Object里的toString()
    public String toString(){
        return "图形格式:" + type;
    }

}
