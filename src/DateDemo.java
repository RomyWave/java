import java.util.Date;
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//获取当前时间
        System.out.println(date.getTime());//获取时间戳：从1970.01.01 00:00到现在的秒数
    }
}
