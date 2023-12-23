import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int n= sc.nextInt();
        String traloi=(n%2==0)?"chẵn" : "lẻ";
        System.out.println("Số "+n+" là số "+traloi);*/


        //bài tập:
        /*Viết chương trình nhập vào điểm trung bình, và kết quả xếp loại của học sinh theo tiêu chuẩn sau:
        Giỏi: Nếu điểm >=8
        Khá: nếu 8>điểm>=6.5
        Trung bình nếu 6.5>điểm>=5
        Yếu: nếu điểm <5*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập điểm trung bình: ");
        float dtb= sc.nextFloat();
        String traloi = (dtb>=8)?"giỏi":
                        (dtb<8 && dtb>=6.5)?"khá":
                        (dtb<6.5&&dtb>=5)?"trung bình": "yếu";
        System.out.println("Xếp loại "+traloi);

    }
}
