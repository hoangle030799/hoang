import java.util.Scanner;

public class bai21_hamtrongjava {
    public static void main(String[] args) {
 /*   *//*    int kq=cong(1,2,3);
        System.out.println("Kết quả bằng: "+kq);
    }
    public static int cong(int x, int y, int z){
        return x+y+z;*//*
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a= sc.nextInt();
        System.out.println("Nhập b: ");
        int b= sc.nextInt();
        System.out.println("Nhập c: ");
        int c= sc.nextInt();
        String kq=giaipptb2(a,b,c);
        System.out.println(kq);
    }
    public static String giaipptb2(double a, double b, double c){
        if (a==0){
            if (b==0&&c==0){
                return "Phương trình bậc 1 vô số nghiệm";
            }
            else if (b==0&&c!=0) {
                return "Phương trình bậc 1 vô nghiệm";
            }
            else if (b!=0&&c==0)
                return "x= 0";
            else
                return "x= "+ -c/b;
        }
        else {
            double delta=(b*b)-4*a*c;
            if (delta<0)
                return "Phương trình bậc 2 vô nghiệm";
            else if (delta==0) {
                return "Phương trình bậc 2 có nghiệm kép x1=x2= "+-b/2*a;
            }
            else
                return "Phương trình bậc 2 có 2 nghiệm là x1= "+((-b+Math.sqrt(delta))/2*a)+"; x2= "+((-b-Math.sqrt(delta))/2*a);
        }*/
        //Viết chương trình nhập vào a,b và dấu, in ra kết quả
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a= sc.nextDouble();
        System.out.println("Nhập b: ");
        double b= sc.nextDouble();
        System.out.println("Nhập phép tính +,-,*,/: ");
        String c=new Scanner(System.in).nextLine();
        String kq=tt(a,b,c);
        System.out.println("Kết quả phép tính là: "+kq);
    }
    public static String tt(double a, double b, String c){
        if (c.equals("+"))
            return "Kết quả phép cộng là: "+(a+b);
        else if (c.equals("-")) {
            return "Kết quả phép trừ là: "+(a-b);
        }
        else if (c.equals("*")) {
            return "Kết quả phép nhân là: "+(a*b);
        }
        else if (c.equals("/")) {
            if (b!=0)
            return "Kết quả phép chia là: "+(a/b);
            else
                return "Chia làm sao được cho 0 ơ";
        }
        else
            return "+,-,*,/ thôi ơ";
    }
}
