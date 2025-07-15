public class Circle extends Shape{
    private double radius;

    public Circle(String type, double radius){
        super(type);
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    public String toString(){
        return super.toString() + ",面积:" + area();
    }
}
