import java.util.Scanner;

public class Main2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //将键盘输入的数字保存到对象scanner中
        int[] arr = {1,2,3,4,5};    // []里不用写数，可以自动推算
        int[] arr2 = new int[5];   // 创建一个容量为5的数组，里面没有放数据，先站好空间
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int value : arr){         //每一次从arr里取一个元素
            System.out.println(value);
        }

        System.out.println("请输入数据");
        for(int i = 0; i<5; i++){
            arr2[i] = scanner.nextInt();    //读取键盘输入的数据
        }
        for(int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}