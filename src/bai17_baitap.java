import java.util.Scanner;

public class bai17_baitap {
    public static void main(String[] args) {

        //bai1: Viết chương trình nhập vào s nguyên n, in ra kết quả n!
        //4!=4*3*2*1=24
        //sử dụng for
        /*Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số nguyên n ");
        int n= sc.nextInt();
        int gt=1;
        for (int i=1;i<=n;i++){
            gt*=i;
        }
        System.out.println("Kết quả "+n+"! =" +gt);*/

        //sử dụng while
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n: ");
        int n= sc.nextInt();
        int gt=1;
        int i=1;
        while (i<=n){
            gt*=i;
            i++;
        }
        System.out.println("Kết quả "+n+"! =" +gt);*/


        //bai2: Viết chương trình tính tổng các số lẻ từ 1 đến n, n nhập từ bàn phím
        //Nhập n=7 Bỏ qua không cộng tổng với số 3 => in kết quả

        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n= sc.nextInt();
        int tong=0;
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                if (i==3){
                    continue;
                }
            tong+=i;}
        }
        System.out.println("Tổng = "+tong);*/
        //Break khi chạy đến n=3
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n= sc.nextInt();
        int tong=0;
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                if (i>3){
                    break;
                }
                tong+=i;}
        }
        System.out.println("Tổng = "+tong);*/


        //bai3: Viết chương trình tìm những số chia hết cho 3 từ 10-50
        /*int n=10;
        while (n<50){
            n++;
            if (n%3==0){
                System.out.println("n="+n);
            }
        }*/


        //bai4: Viết chương trình tính tổng S=1!+2!+...+10!
        /*int gt=1;
        int tong=0;
        for (int i=1;i<=10;i++){
            gt*=i;
            tong+=gt;
        }
        System.out.println("S="+tong);*/


        //bai5: tìm tất cả các số hoàn chỉnh từ 1-1000
        /*for (int n=1;n<=1000;n++){
            int tong=0;
            for (int i=1;i<n;i++){
                if (n%i==0)
                    tong+=i;
            }
            if (tong==n)
                System.out.println("n="+n);
        }*/


        //bai6: Viết chương trình nhập số nguyên a>0 từ bàn phím. Cho biết đó có phải số nguyên tố không
        //Kết thúc chương trình hỏi ngưi dùng: Bạn có muốn tiếp tục sử dụng không? nếu không thì thoát ctrinh
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào số nguyên a>0: ");
            int a= sc.nextInt();
            while (a<=0){
                System.out.println("Nhập lại a");
                a= sc.nextInt();
            }
            int demUoc=0;
            for (int i=1;i<=a;i++){
                if (a%i==0)
                    demUoc++;
            }
            if (demUoc==2)
                System.out.println(a+ " là số nguyên tố");
            else
                System.out.println(a+ " không phải là số nguyên tố");
            System.out.println("có dùng tiếp không? chọn 1 để thoát");
            int j= sc.nextInt();
            if (j==1)
                break;
        }
    }
}
