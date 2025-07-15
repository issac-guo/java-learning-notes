public class FullTimeEmployee extends Employee {
    //从Employee不能继承私有的属性，方法，和构造函数
    private double baseSalary;
    private double bonus;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus){
        super(id,name);    //调用父类的构造函数初始化id,name
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double calculatePay(){
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
//        return super.toString() + ",工资:" + calculatePay();
        return "";
    }

}
