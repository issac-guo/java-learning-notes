//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345612",100);
        System.out.println(account);

//        try {
//            account.deposit(-90);
//            System.out.println(account);
//        }
//        catch(Exception e){
//            System.out.println("不理会这个异常");
//        }

        account.withdraw(190);
        System.out.println(account);
    }
}