public class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.score = 0;
    }


    //构造函数名字必须和类名一样
    public Student(String name, int age, double score){
        this.name = name;     //this.name 指的是当前类的name         第二个name符合就近原则，优先输出所在块里的变量
        this.age = age;
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0 && age < 110){
            this.age = age;
        }
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public String introduce(){
        return String.format("My name is %s, age is %d, score is %.1f", name, age, score);
    }
}
