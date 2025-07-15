import java.util.Scanner;

public class Main1  {
    public static void main(String[] args) {
        int a = 1;
        float b = 2.3f;            //浮点数要加f
        String s = "world";
        System.out.println("hello world");    //System是一个类,out是System里的一个东西。 println会自动换行
        System.out.println("hello" + s);      //hello 和 s 拼接
        System.out.printf("a = %d\n, b = %.2f\n",a,b);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int c = scanner.nextInt();
        System.out.println(c);
        scanner.nextLine();             // 把缓存区多余的回车读走，防止影响之后读取字符串的逻辑

//        System.out.print("请输入一个float数字：");
//        float d = scanner.nextFloat();
//        System.out.println(d);

//        System.out.print("请输入一个double数字：");
//        double e = scanner.nextDouble();
//        System.out.println(e);

        System.out.print("请输入一句话：");
        s = scanner.nextLine();
        System.out.println(s);
    }
}