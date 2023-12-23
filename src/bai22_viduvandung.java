import java.util.Calendar;
import java.util.Scanner;

public class bai22_viduvandung {
    public static void main(String[] args) {
        //Viết chương trinh nhập vào ngày, tháng, năm sinh. Cho biết số tuổi rồi in ra màn hình.
        int day, month, year, tuoi;
        Scanner sc= new Scanner(System.in);
        System.out.println("Mời nhập vào ngày sinh: ");
        day= sc.nextInt();
        System.out.println("Mời nhập vào tháng sinh: ");
        month= sc.nextInt();
        System.out.println("Mời nhập vào năm sinh: ");
        year= sc.nextInt();

        //khởi tạo
        Calendar birthday=Calendar.getInstance();
        //sét ngày tháng năm sinh do người dùng nhập vào
        birthday.set(year, month-1, day);
        //xuất ngày tháng năm sinh
        int namSinh= birthday.get(Calendar.YEAR);
        int thangSinh= birthday.get(Calendar.MONTH);
        int ngaySinh= birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày tháng năm sinh: "+ngaySinh+"/"+(thangSinh+1)+"/"+namSinh);

        //tính tuổi
        //năm hiện tại
        Calendar now=Calendar.getInstance();
        int namHienTai= now.get(Calendar.YEAR);
        //tính
        tuoi=namHienTai-namSinh;
        System.out.println("Tuổi của bạn là: "+tuoi);
    }
}
