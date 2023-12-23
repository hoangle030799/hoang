import java.util.Random;

public class bai24_ramdomjava {
    public static void main(String[] args) {
        //khởi tạo đối tượng ngẫu nhien
        Random rd= new Random();
        //lấy ngẫu nhiên 1 số nguyên
        int soNguyen= rd.nextInt(-50, 51);
        System.out.println(soNguyen);
        //lấy ngẫu nhiên số thực
        double soThuc= rd.nextDouble(50);
        System.out.println(soThuc);
    }
}
