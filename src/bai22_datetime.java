import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);

        //lấy thông tin
        int nam= cal.get(Calendar.YEAR);
        int thang= cal.get(Calendar.MONTH);
        int ngay= cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);

        //set ngày thang năm theo ý muốn
        cal.set(Calendar.YEAR,1999);
        cal.set(Calendar.MONTH,07);
        cal.set(Calendar.DAY_OF_MONTH,03);
        int namSinh= cal.get(Calendar.YEAR);
        int thangSinh= cal.get(Calendar.MONTH);
        int ngaySinh= cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh: "+namSinh+"/"+thangSinh+"/"+ngaySinh);

        //xuất theo định dạng
        SimpleDateFormat dinhDang= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        //tạo đối tượng date để get time trong đối tượng cal
        Date d=cal.getTime();
        String s=dinhDang.format(d);
        System.out.println(s);
    }
}
