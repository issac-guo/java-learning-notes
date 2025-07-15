public class Square extends Shape{
    private double sideLength;

    public Square(String type, double sideLength){
        super(type);    //父类的构造函数对type进行初始化
        this.sideLength = sideLength;
    }

    public double area(){
        return sideLength * sideLength;
    }

    @Override
    public String toString(){
        return super.toString() + ",面积:" + area();
    }
}
