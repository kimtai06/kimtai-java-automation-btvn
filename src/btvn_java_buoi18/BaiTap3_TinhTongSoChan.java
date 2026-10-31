package btvn_java_buoi18;
import java.util.Scanner;

public class BaiTap3_TinhTongSoChan {
    public static int tinhtongsochan(int n) {
        int tong = 0;
        for (int i = 0; i <= n; i+=2) {
                tong = tong + i;
            }
        return tong;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hãy nhập một số nguyên n: ");
        int n = scanner.nextInt();

        int ketqua = tinhtongsochan(n);

        System.out.println("Tổng số chẵn từ 0 đến " + n + " là: " + ketqua);

        scanner.close();
    }
}

