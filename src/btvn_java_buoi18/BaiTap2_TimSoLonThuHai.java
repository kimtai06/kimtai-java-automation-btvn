package btvn_java_buoi18;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap2_TimSoLonThuHai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mảng của bạn có bao nhiêu số: ");
        int soPhanTu = scanner.nextInt();

        int[] mangSo = new int[soPhanTu];
        for (int i = 0; i < soPhanTu; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            mangSo[i] = scanner.nextInt();
        }

        if (soPhanTu < 2) {
            System.out.println("Output: Integer.MIN_VALUE");
        }
        else {
            // Sắp xếp mảng tăng dần
            Arrays.sort(mangSo);

            int lonNhat = mangSo[soPhanTu - 1];
            int lonThuHai = Integer.MIN_VALUE;
            boolean timThay = false;

            for (int i = soPhanTu - 2; i >= 0; i--) {
                if (mangSo[i] != lonNhat) {
                    lonThuHai = mangSo[i];
                    timThay = true;
                    break;
                }
            }

            if (!timThay) {
                System.out.println("Output: Integer.MIN_VALUE");
            } else {
                System.out.println("Output: " + lonThuHai);
            }
        }

        scanner.close();
    }
}
