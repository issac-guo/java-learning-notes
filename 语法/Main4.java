public class Main  {
    public static void main(String[] args) {
       String s = "today is a beautiful day";
        System.out.println(s.indexOf('i'));      //寻找i字符在字符串中首次出现的位置
        System.out.println(s.indexOf('i',7));    //从第7个下标往后找i的位置，不传第二个参数则默认为0
        System.out.println(s.lastIndexOf('a'));          //寻找a最后一次出现的下标
        System.out.println(s.lastIndexOf('a',5));  //从指定下标开始往前搜索5个字符串

        System.out.println(s.indexOf("ay"));      //寻找i字符在字符串中首次出现的位置
        System.out.println(s.indexOf("ay",7));    //从第7个下标往后找i的位置，不传第二个参数则默认为0
        System.out.println(s.lastIndexOf("ay"));          //寻找a最后一次出现的下标
        System.out.println(s.lastIndexOf("ay",5));  //从指定下标开始往前搜索5个字符串

        System.out.println(s.contains("beautiful"));
        System.out.println(s.startsWith("to"));      //字符串是否以to开始
        System.out.println(s.endsWith("hi"));
        System.out.println(s.equals("today is a beautiful day"));
        System.out.println(s.equalsIgnoreCase("Today Is A beauTifuL dAY"));   //忽略大小写比较

        System.out.println(s + "!");     //字符串用+拼接
        System.out.println(s.concat("!!"));      //字符串拼接函数

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());     //全部转大写

        String s1 = "\n  An apple a day keeps the doctor away   \t \n";
        System.out.println(s1.trim());
        System.out.println(s1);       //还是原来的s1,字符串操作不修改字符串本身

        System.out.println(s.replace('a','A'));
        System.out.println(s.replace("day","DAY"));

        System.out.println(s.substring(4));      //获取字符串从第4号位置的子串。 s[4:]
        System.out.println(s.substring(4,8));             //s[4:8]

        System.out.println(s.charAt(i));

        String[] words = s.split(" ");
        for(String word : words){
            System.out.print(word+",");
        }

    }
}