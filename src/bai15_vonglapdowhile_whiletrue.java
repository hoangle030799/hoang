public class bai15_vonglapdowhile_whiletrue {
    public static void main(String[] args) {
        //tính tổng các số từ 1 đến 5
        /*int n=0;
        int tong=0;
        do {
            tong+=n;
            n++;
        }while (n<=5);
        System.out.println("Tổng = "+tong);*/

        //tăng n lên một đơn vị đến khi bằng 5 thì thoát
        int n=0;
        while (true){
            n++;
            System.out.println("n= "+n);
            if (n==5)
                break;
        }
    }
}
