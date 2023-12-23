public class bai26_string {
    public static void main(String[] args) {
        String a="Không học thì chỉ có" +
                "\nĂN CỨT THÔI";
        System.out.println(a);

        //khai báo đối tượng st
        StringBuilder chuoi= new StringBuilder();
        //1. Các phương thức thường dùng
        //1.1. append: Thêm vào cuối chuỗi
        chuoi.append("Xin chào, ");
        chuoi.append("mình mới học lập trình");
        System.out.println(chuoi);

        //1.2. insert (vị trí index, chuỗi cần chèn)
        chuoi.insert(2, "nn");
        System.out.println(chuoi);

        //1.3. delete (start, end): xóa tất cả các ký tự từ start đến end-1
        chuoi.delete(2,4);
        System.out.println(chuoi);

        //1.4. chuoi.length: trả về độ dài của chuỗi (tính cả space)
        System.out.println(chuoi.length());

        //1.5. IndexOf: kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi (trả về -1 nếu không tìm thấy)
        String s7="tôi đi tìm tôi";
        System.out.println(s7.indexOf("tôi"));

        //1.6. lastIndexOf: kiểm tra vị trí xuất hiện cuối cùng của ký tự hoặc chuỗi (trả về -1 nếu không tìm thấy)
        System.out.println(s7.lastIndexOf("tôi"));

        //1.7. Contains: Kiểm tra chuỗi con
        String s9=".mp3";
        String s10="tuhoc.mp3";

        //kiểm tra s10 có chứa cụm của s9 không?
        boolean check=s10.contains(s9);
        if (check)
            System.out.println("Có .mp3 trong chuỗi");
        else
            System.out.println("không có .mp3 trong chuỗi");

        //1.8. Substring: Trích lọc chuỗi con từ chuỗi ban đầu
        //substring(int beginIndex)
        //substring(in beginIndex, int endIndex)
        String s11="abcdefgh";
        String s12= s11.substring(4,6);
        System.out.println(s11);
        System.out.println(s12);

        //1.9. replace: thay thế toàn bộ chuỗi
        String s14="Tôi đi tìm Tôi";
        String s15= s14.replace("T", "t");
        System.out.println(s14);
        System.out.println(s15);

        //1.10. replace: thay thế ký tự đầu tiên
        String s16=s15.replaceFirst("t","T");
        System.out.println(s16);

        //1.11. trim(): xóa toàn bộ khoảng trắng ở đầu và đuôi
        String s17="      Buồn ngủ quá     ";
        String s18=s17.trim();
        //dùng \\s+$ để xóa toàn bộ khoảng trắng ở cuối
        String s19=s17.replaceAll("\\s+$","");
        //dùng ^\\s+ để xóa toàn bộ khoảng trắng ở đầu
        String s20=s17.replaceFirst("^\\s+","");
        System.out.println(s17);
        System.out.println(s18);
        System.out.println(s19);
        System.out.println(s20);

        //1.12. so sánh chuỗi
        String s21="Abc123";
        String s22="abc123";
        //so sánh bình thường
        int x=s21.compareTo(s22);
        //so sánh không phân biệt chữ hoa chữ thường
        int y=s21.compareToIgnoreCase(s22);
        System.out.println(x);
        System.out.println(y);

        //1.13. đảo ngược chuỗi
        StringBuilder s23= new StringBuilder("12345");
        s23.reverse();
        System.out.println(s23);

        //1.14. tách chuỗi
        String s24= "Hello, world";
        String[] mang = s24.split(","); //tách theo dấu phẩy
        //duyệt mảng
        for (int i=0; i< mang.length; i++){
            System.out.println(mang[i]);
        }

        //1.15. chuyển sang chữ thường hoặc chữ hoa
        String s25="Tôi tự học Lập TRình";
        //chuyển sang thường
        String s26=s25.toLowerCase();
        //chuyển sang hoa
        String s27=s25.toUpperCase();
        System.out.println(s26);
        System.out.println(s27);

        //1.16. tách chuỗi thành từng ký tự, cho vào mảng
        String s28= "abcef123";
        char[] mang2= s28.toCharArray(); //tách thành từng ký tự
        //duyệt mảng
        for (int i=0; i< mang2.length; i++){
            System.out.println(mang2[i]);
        }
    }
}
