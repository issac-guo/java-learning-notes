public abstract class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //抽象方法,子类继承抽象父类时候必须实现父类的抽象方法！
    //calculatePay无法具体实现，故为抽象方法
    public abstract double calculatePay();

    @Override
    public String toString() {
        return "员工号:" + id + ",姓名:" + name;
    }
}
