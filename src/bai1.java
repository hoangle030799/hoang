public class bai1 {
    public static void main(String[] args) {
        // in thông tin theo chia từng dòng
        System.out.println("xin chào");
        System.out.print("xin chào");
        // in thông tin mà không xuống dòng
        System.out.print("tôi mới học code");
        // sử dụng println trống để xuống dòng ở đây
        System.out.println("");

        //kiểm tra lưu trữ tối đa và tối thiểu trong các kiểu cơ sở
        // sử dụng wrapper class để kiểm tra giá trị
        System.out.println("min của byte"+Byte.MIN_VALUE);
        System.out.println("max của byte"+Byte.MAX_VALUE);

        // khai báo biến (biến số)
        byte tuoi;
        //khởi tạo biến
        byte tuoiCon=10;
        System.out.println(tuoiCon);
        tuoiCon=15;
        System.out.println(tuoiCon);

        //khai báo biến (hằng số)
        final byte NHIETDOSOI=100;
        System.out.println(NHIETDOSOI);
        // ép kiểu dữ liệu (viết kiểu muốn ép sang vào trong ngoặc)
        int a=6;
        int b=2;
        double kq=(double) a/b;
        System.out.println(kq);
        //phép cộng, trừ, nhân, chia
        System.out.println("a+b=" +(a+b));
        System.out.println("a-b=" +(a-b));
        System.out.println("a*b=" +(a*b));
        System.out.println("a/b=" +((double)a/b));
        //bài tập vận dụng
//        a+=3;
//        a-=5;
//        a*=2;
//        a%=5;
//        a-=(b+7);
//        System.out.println("a="+a);
    }
}
