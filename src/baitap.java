import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        //Tìm x,y khi biết tổng và hiệu của chúng
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tổng: ");
        double tong= sc.nextDouble();
        System.out.println("Nhập hiệu: ");
        double hieu= sc.nextDouble();
        double x=(tong+hieu)/2;
        double y=tong-x;
        System.out.println("x="+x);
        System.out.println("y="+y);*/


        //Viết chương trình nhập vào chiều cao, cân nặng, tính BMI và xuất ra thông báo
        /*BMI<15: Thân hình quá gầy
        BMI>=15 và BMI<16: Thân hình gầy
        BMI>=16 và BMI<18.5: Thân hình hơi gầy
        BMI>=18.5 và BMI<25: Thân hình bình thường
        BMI>=25 và BMI<30: Thân hình hơi béo
        BMI>=30 và BMI<35: Thân hình béo
        BMI>=35: Thân hình quá béo */

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Chiều cao: ");
        double cc= sc.nextDouble();
        System.out.println("Cân nặng: ");
        double cn= sc.nextDouble();
        double BMI=cn/(Math.pow(cc,2));
        if (BMI<15)
            System.out.println("Thân hình quá gầy ");
        else if (BMI>=15 && BMI<16) {
            System.out.println("Thân hình gầy");
        }
        else if (BMI>=16 && BMI<18.5) {
            System.out.println("Thân hình hơi gầy");
        }
        else if (BMI>=18.5 && BMI<25) {
            System.out.println("Thân hình bình thường");
        }
        else if (BMI>=25 && BMI<30) {
            System.out.println("Thân hình hơi béo");
        }
        else if (BMI>=30 && BMI<35) {
            System.out.println("Thân hình béo");
        }
        else
            System.out.println("Thân hình quá béo");*/


        //Viết chương trình cho người dùng nhập một tháng bất kỳ từ 1-12, xuất ra kết quả tháng đó có bao nhiêu ngày
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập tháng: ");
        double thang=sc.nextDouble();
        if ((thang==1) || (thang==3) || (thang==5) || (thang==7) || (thang==8) || (thang==10) || (thang==12)) {
            System.out.println("Có 31 ngày");
        } else if ((thang==4)||(thang==6)||(thang==9)||(thang==11)) {
            System.out.println("Có 30 ngày");
        }
        else {
            System.out.println("Nhập Năm: ");
            double nam=sc.nextDouble();
            if ((nam%4==0) && (nam%100!=0)||(nam%400==0))
                System.out.println("Có 29 ngày");
            else
                System.out.println("Có 28 ngày");
        }*/

        //Viết chương trình giải phuơng trình bậc 2
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a= sc.nextDouble();
        System.out.println("Nhập b: ");
        double b= sc.nextDouble();
        System.out.println("Nhập c: ");
        double c= sc.nextDouble();
        double delta=Math.pow(b,2)-4*a*c;
        if (delta<0)
            System.out.println("Phương trình vô nghiệm");
        else if (delta==0) {
            System.out.println("Phương trình có nghiệm kép: x1=x2= "+(-b/2*a));
        }
        else {
            System.out.println("Phương trình có 2 nghiệm phân biệt: x1="+((-b+Math.sqrt(delta))/2*a));
            System.out.println("và x2="+((-b-Math.sqrt(delta))/2*a));
        }*/
        //Viết chương trình nhập vào tháng trong năm. cho biết tháng đó thuộc quý mấy
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int thang= sc.nextInt();
        if ((thang==1)||(thang==2)||(thang==3))
            System.out.println("Quý 1");
        else if ((thang==4)||(thang==5)||(thang==6)) {
            System.out.println("Quý 2");
        } else if ((thang==7)||(thang==8)||(thang==9)) {
            System.out.println("Quý 3");
        } else if ((thang==10)||(thang==11)||(thang==12)) {
            System.out.println("Quý 4");
        }
    }
}
