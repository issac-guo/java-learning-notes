import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class IdCardUtils {
    public static String maskIdCard(String id){
        return id.substring(0,6) + "********" +id.substring(14,18);  //substring左闭右开
    }

    public static String getGender(String id){
        return Character.getNumericValue(id.charAt(16)) % 2 != 0 ? "男":"女";
    }

    public static int getAge(String id){
        String s = id.substring(6,14);
        LocalDate birth = LocalDate.parse(s, DateTimeFormatter.ofPattern("yyyyMMdd"));
        //s按照这个规则解析
        LocalDate today = LocalDate.now();
        return Period.between(birth,today).getYears();  //获得年的位置
    }

    private static boolean checkSum(String id){
        int[] weight = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[] checkNumber = {'1','0','x','9','8','7','6','5','4','3','2'};    //必须定义成字符！！
        int sum = 0;
        for (int i=0;i<17;i++){
            sum += Character.getNumericValue(id.charAt(i)) * weight[i];
        }
//        int a = checkNumber[sum % 11];
//        char b = id.charAt(17);
        //注意字符转整数
        if (checkNumber[sum % 11] == Character.toLowerCase(id.charAt(17))){
            return true;
        }
        return false;
    }

    public static boolean isValidIdCard(String id){
        //正则表达式
        String regex = "^\\d{6}"      //前6位表示地区码
                + "[12][012389]\\d{2}"   //判断年份
        //(18|19|20|21|22|23)\\d{2}
                + "(([0][1-9])|(10|11|12))"   //判断月份     注意最外面要有括号
                + "(([0][1-9])|([12]\\d)|30|31)"  //判断日      ([0-2][1-9]|10|20|30|31)
                + "\\d{3}"
                + "[0-9Xx]$";             //判断倒数2-4位       (\d|x|X)
        //必须加^$,这样可以保证以正则表达式开头和结尾,可以免去长度判断
        return id.matches(regex) && checkSum(id);
    }
}
