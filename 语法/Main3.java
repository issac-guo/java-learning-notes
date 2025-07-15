public class Main3  {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a == b);

        String s1 = "test";
        String s2 = "test";
        System.out.println(s1 == s2);    // ==代表判断字符串的地址是否相等，没有实际意义

        String s3 = new String("test");
        String s4 = new String("test");
        System.out.println(s3 == s4);      //输出为flase，因为不指同一块地址
        System.out.println(s3.equals(s4));   //equals判断的字符串内容是否相等
    }
}