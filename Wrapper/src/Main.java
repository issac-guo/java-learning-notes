import java.awt.datatransfer.FlavorEvent;

public class Main {
    public static void main(String[] args) {
//        int a = 1;
//        int b = (int) a;
//        float c = (float) 5;
//        int d = (int) 'A';
//        System.out.println((int)'2');
        //110010是它的实际值，类型转变不会改变其固有值

        //包装类
        Integer i1 = 1;
        System.out.println(i1);
        int i2 =i1;
        System.out.println(i2);
        int i3 = Integer.parseInt("123");//pareInt为公有类
        System.out.println(i3);

        Float f1 = 3.4f;   //f代表float类型
        float f2 = Float.parseFloat("3.1415");  //将字符串转为整数
        System.out.println(f2);
        float f3 = Float.valueOf("2.717");  //valueOf与parseFloat同等
        System.out.println(f3);

        String str = "true";  //取决于想要变成的类型来用什么类
        System.out.println(Boolean.valueOf(str));

        char c = '1'; //字符较特殊，用Character类
        System.out.println(Character.getNumericValue(c));

//        Double.parseDouble("abc"); //报错
    }
}
