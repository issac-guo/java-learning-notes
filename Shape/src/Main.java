//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
//        Shape s1 = new Square("正方形",5);
//        Shape s2 = new Circle("圆形", 3);
//        System.out.println(s1);
//        System.out.println(s2);

        Shape[] shapes = {new Square("正方形",5),
                          new Circle("圆形", 3),
                          new Circle("正方形", 7)};
        for(Shape shape:shapes){
            System.out.println(shape);
        }

        //静态对象属于所有类所共有的，不能通过某一个类来获取某个属性
        System.out.println("一共创建了"+ Shape.num +"个对象");
    }
}