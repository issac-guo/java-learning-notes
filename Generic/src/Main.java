public class Main {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box(1);
        System.out.println(box1.getValue());

        Box<Double> box2 = new Box(3.4);
        System.out.println(box2.getValue());

        Box<Character> box3 = new Box('X');
        System.out.println(box3.getValue());

        Box<String> box4 = new Box("hello");
        System.out.println(box4.getValue());
    }
}