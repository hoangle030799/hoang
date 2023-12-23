import java.util.Scanner;

public class bai10_scanner {
    public static void main(String[] args) {
        //khởi tạo đối tượng scanner
     /*   Scanner sc=new Scanner(System.in);

        //cho phép nhập chuôi
        System.out.println("Mời nhập vào mk cấp 1: ");
        String mk1 = sc.nextLine();
        System.out.println("Mật khẩu cấp 1 là: "+mk1);

        //nhập số nguyên
        System.out.println("Mời nhập vào một số nguyên: ");
        int a=sc.nextInt();
        System.out.println("a="+a);

        //nhập số thực
        System.out.println("Mời nhập vào một số thực:");
        float x= sc.nextFloat();
        System.out.println("x=");

        System.out.println("Mời nhập vào mk cấp 1: ");
        String mk2 = sc.nextLine();
        System.out.println("Mật khẩu cấp 1 là: "+mk2);*/

        //nên làm theo cách này nếu phải nhập chuỗi và số lẫn nhau
        /*System.out.println("Mời cụ nhập tên: ");
        String ten=new Scanner(System.in).nextLine();
        System.out.println("Tên của cụ là: " +ten);

        System.out.println("Mời cụ nhập tuổi: ");
        int tuoi=new Scanner(System.in).nextInt();
        System.out.println("Tuổi của cụ là: " +tuoi);

        System.out.println("Mời cụ nhập giới tính: ");
        String gt=new Scanner(System.in).nextLine();
        System.out.println("Giới tính của cụ là: " +gt);*/

        //bài tập1 1
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào bán kính r: ");
        double r=sc.nextDouble();
        double cv= 2*r*Math.PI;
        double dt= Math.PI*Math.pow(r,2);
        System.out.println("Chu vi hình tròn là: " +cv);
        System.out.println("Diện tích hình tròn là: "+dt);*/

        //bài tập 2
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào chiều dài:");
        float cd=sc.nextFloat();
        System.out.println("Mời nhập vào chiều rộng:");
        float cr=sc.nextFloat();
        float cv=(cd+cr)*2;
        float dt=cd*cr;
        System.out.println("Chu vi của hình chữ nhật là: "+cv);
        System.out.println("Diện tích của hình chữ nhật là: "+dt);
    }
}
