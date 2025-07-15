import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("请输入一个数字");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        System.out.println(isPrime(c));
    }

    //函数名字的规则：首字母小写后面大写  hasNextButton
    //类名规则:   每个单词首字母大写
    public static boolean isPrime(int num) {
        if (num < 2){
            return false;
        }
        for (int i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}