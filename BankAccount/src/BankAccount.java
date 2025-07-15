public class BankAccount {
    private String account;
    private double balance;

    public BankAccount(String account){
        String regex = "^[1-9]\\d{7}$";
        if (account.matches(regex)){
            this.account = account;
        }
        else{
            this.account = "";
        }
        this.balance = 0;
    }

    public BankAccount(String account, double balance) {
        String regex = "^[1-9]\\d{7}$";
        if (account.matches(regex)){
            this.account = account;
        } else{
            this.account = "";
        }
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        String regex = "^[1-9]\\d{7}$";
        if (account.matches(regex)){
            this.account = account;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("金额不能为负数");  //抛异常
        }
//        if (amount >= 0){
        this.balance += amount;
//        }
    }

    public void withdraw(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("金额不能为负数");
        }
        if (amount > balance){
            throw new IllegalArgumentException("余额不足");
        }
        this.balance -= amount;
    }
    //重写overwrite    Java自带的toString
    @Override    //覆盖已经存在的标识
    public String toString(){       //当输出一个对象时，会调用toString方法
        return String.format("账号:%s, 余额:%.2f元", account, balance);
    }
}
