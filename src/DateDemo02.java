import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo02 {
    public static void main(String[] args) throws ParseException {
        //创建格式化器
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //把字符串格式化成date对象
        Date date = format.parse("2018-11-05 16:30:00");
        System.out.println(date);

        //把date对象格式化成字符串
        String dates = format.format(new Date());
        System.out.println(dates);

    }
}
