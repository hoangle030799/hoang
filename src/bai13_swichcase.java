import java.util.Scanner;

public class bai13_swichcase {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int n=sc.nextInt();
        int div=n%2;
        switch (div){
            case 0:
                System.out.println(n+ " là số chẵn");
                break;
            default:
                System.out.println(n+" là số lẻ");
                break;*/

        //bài tập
        /*viết chương trình khung tìm kiếm(cho người dùng nhập vào lựa chọn)
        1.tìm theo tên
        2.tìm theo tác giả
        3.tìm theo nhà xuất bản
        4.tìm theo tiêu đề
        thoát nếu phím bấm không hợp lệ*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số để chọn: ");
        System.out.println("1.tìm theo tên");
        System.out.println("2.tìm theo tác giả");
        System.out.println("3.tìm theo nhà xuất bản");
        System.out.println("4.tìm theo tiêu đề");
        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("Tìm theo tên");
                break;
            case 2:
                System.out.println("Tìm theo tác giả");
                break;
            case 3:
                System.out.println("Tìm theo nhà xuất bản");
                break;
            case 4:
                System.out.println("Tìm theo tiêu đề");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
