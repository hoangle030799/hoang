import java.util.Scanner;

public class bai11_if_else {
    public static void main(String[] args) {
        //lệnh if-else
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập điểm trung bình: ");
        double dtb=sc.nextDouble();
        if (dtb>=5){
            System.out.println("Đỗ");
        }
        else {
            System.out.println("Tạch");
        }*/

        //lệnh if-else if-else
        /*Nhập dtb, in ra xếp loại của hoc sinh
                Giỏi 8<=dtb<=10
                Khá 6.5<=dtb<8
                Trung bình 4<=dtb<6.5
                Còn lại là tạch*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập điểm trung bình: ");
        double dtb=sc.nextDouble();
        if (8<=dtb && dtb<=10){
            System.out.println("Giỏi");
        }
        else if (6.5<=dtb && dtb<8) {
            System.out.println("Khá");
        }
        else if (4<=dtb && dtb<6.5) {
            System.out.println("Trung bình");
        }
        else {
            System.out.println("Học lại");
        }
    }
}
