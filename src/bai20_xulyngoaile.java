import java.util.Scanner;

public class bai20_xulyngoaile {
    public static void main(String[] args) {

        try {
            int a=10;
            Scanner sc=new Scanner(System.in);
            new Scanner(System.in);
            System.out.println("Nhập b: ");
            int b= sc.nextInt();
            int c=a/b;
            System.out.println("c= "+c);
        }
        catch (Exception x){
            System.out.println("chia cho 0 thì chịu!!!");
            x.printStackTrace();
        }
        System.out.println("đoạn lệnh phía sau");
    }
}
