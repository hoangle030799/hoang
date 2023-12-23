import javax.security.auth.callback.CallbackHandler;
import java.util.Scanner;

public class bai26_charjava {
    public static void main(String[] args) {
        char ch= 'a';
        char ch2= 66;
        char ch3;
        /*System.out.println(ch2);
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời nhập vào một ký tự: ");
        String s= sc.nextLine();
        char ch4= s.charAt(0);
        System.out.println("Ký tự vừa nhập: "+ch4);*/

        //so sánh
        System.out.println(Character.compare('b','b'));

        //kiểm tra
        char ch5='1';
        char ch6='a';
        char ch7='A';
        char ch8=' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));
    }
}
