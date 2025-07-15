import java.util.*;

public class Main {
    //集合框架是数据结构的统称
    public static void main(String[] args) {
//        int[] a = {1,2,3};     //普通数组不能加入
        ArrayList<Integer> arrayList = new ArrayList<>();  //整型的数组类
//        arrayList.add(4);
//        arrayList.add(3);
//        arrayList.add(2);
//        arrayList.add(9);
//        arrayList.add(6);
//        arrayList.add(0,5);
//        System.out.println(arrayList)i;
//        System.out.println(arrayList.contains(2));
//        arrayList.set(3,8);      //设置下标为3的元素为8
//        System.out.println(arrayList);
//        System.out.println(arrayList.indexOf(6));  //6这个元素第一次出现的下标
//        System.out.println(arrayList.lastIndexOf(7));
//        arrayList.remove(3);
//        System.out.println(arrayList);
//        Integer i = 3;
//        arrayList.remove(i);
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());         //获取数组的元素个数
//        System.out.println(arrayList.isEmpty());      //是否为空
//        arrayList.clear();
//        System.out.println(arrayList);

        //链表
        LinkedList<Double> linkedList = new LinkedList<>();
//        linkedList.add(4.0);
//        linkedList.add(3.0);
//        linkedList.add(2.0);
//        linkedList.add(9.0);
//        linkedList.add(6.0);
//        linkedList.add(0,5.0);
//        System.out.println(linkedList);
//        System.out.println(linkedList.contains(2.0));
//        linkedList.set(3,8.0);      //设置下标为3的元素为8
//        System.out.println(linkedList);
//        System.out.println(linkedList.indexOf(6.0));  //6这个元素第一次出现的下标
//        System.out.println(linkedList.lastIndexOf(7.0));
//        linkedList.remove(3);
//        System.out.println(linkedList);
//        System.out.println(linkedList.size());         //获取数组的元素个数
//        System.out.println(linkedList.isEmpty());      //是否为空
//        linkedList.clear();
//        System.out.println(linkedList);

        //栈：先进后出        队列：先进先出
        Deque<Character> deque = new ArrayDeque<>();   //既能当栈，又能当队列，可以称为双端队列
//        deque.addFirst('c');
//        deque.addFirst('d');
//        deque.addLast('e');
//        deque.addLast('f');
//        System.out.println(deque);
//        deque.removeFirst();
//        deque.removeLast();
//        System.out.println(deque);

        //集合
//        HashSet<String> set = new HashSet<>();
//        set.add("apple");
//        set.add("banana");
//        set.add("orange");
//        set.add("apple");
//        System.out.println(set.size());   //唯一性    重复的不算在size
//        set.remove("banana");
//        System.out.println(set);   //无序性

        //哈希表
//        HashMap<String,Double> map = new HashMap<>();
//        map.put("Alice",87.0);
//        map.put("Peter",97.0);
//        map.put("Steven",94.0);
//        map.put("Mike",81.0);
//        map.put("Alice",85.0);        //后一次会覆盖前一次的值
//        System.out.println(map);    //字典元素也是无序的
//        System.out.println(map.get("Steven"));   //由键拿值
    }
}
