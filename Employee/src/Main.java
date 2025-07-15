public class Main {
    public static void main(String[] args) {
//        FullTimeEmployee ft1 = new FullTimeEmployee("5170001","Tom",6000,2500);
//        System.out.println(ft1);
////        System.out.println("工资"+ft1.calculatePay());
////        System.out.println(ft1.getBaseSalary());;
//
//        PartTimeEmployee pt1 = new PartTimeEmployee("23124099","Mike",50,8);
//        System.out.println(pt1);
//
//        FullTimeEmployee ft2 = new FullTimeEmployee("001", "Alice", 5000, 500);
//        System.out.println(ft2);
//
//        FullTimeEmployee ft3 = new FullTimeEmployee("002", "Bob", 6000, 600);
//        System.out.println(ft3);
//
//        PartTimeEmployee pt2 = new PartTimeEmployee("003", "John", 100, 12);
//        System.out.println(pt2);
//
//        FullTimeEmployee ft4 = new FullTimeEmployee("004", "Jason", 12000, 500);
//        System.out.println(ft4);

        //父类类型可以保存子类对象
        Employee[] employees = {
            new FullTimeEmployee("5170001","Tom",6000,2500),
            new PartTimeEmployee("23124099","Mike",50,8),
            new FullTimeEmployee("001", "Alice", 5000, 500),
            new FullTimeEmployee("002", "Bob", 6000, 600),
            new PartTimeEmployee("003", "John", 100, 12),
            new FullTimeEmployee("004", "Jason", 12000, 500),
        };
        for(Employee e: employees){
            System.out.println(e.calculatePay());
        }

        //抽象类不能实例化，不能再new创建
//        Employee e = new Employee("005","test5");
//        System.out.println(e);
    }

}