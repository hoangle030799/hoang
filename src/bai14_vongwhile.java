import java.util.Scanner;

public class bai14_vongwhile {
    public static void main(String[] args) {
        /*int x=0;
        while (x<=5){
            System.out.println("x= " +x);
            x++;
        }*/

        //ví dụ
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên từ 1-99: ");
        int n= sc.nextInt();
        while (n<1||n>99){
            System.out.println("Mời nhập lại ");
            n=sc.nextInt();
        }
        System.out.println("Số bạn vừa nhập là: "+n);
    }
}
