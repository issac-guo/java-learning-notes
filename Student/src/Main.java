public class Main {
    public static void main(String[] args) {
        Student student = new Student("John",20,87);
        student.setAge(-1);
        System.out.println(student.getAge());
        System.out.println(student.introduce());

        student  = new Student("Alice",25);       //修改student的值
        System.out.println(student.introduce());
    }
}
