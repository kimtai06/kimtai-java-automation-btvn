package btvn_java_buoi18;

import java.util.Scanner;

public class BaiTap6_TinhThueThuNhap {

    public static double tinhThue(double thuNhap) {
        double tongThue = 0;

        // Bậc 1: 0 - 5 triệu (5%)
        if (thuNhap > 5) {
            tongThue += 5 * 0.05;
        } else {
            return thuNhap * 0.05;
        }

        // Bậc 2: 5 - 10 triệu (10%)
        if (thuNhap > 10) {
            tongThue += 5 * 0.10;
        } else {
            return tongThue + ((thuNhap - 5) * 0.10);
        }

        // Bậc 3: 10 - 18 triệu (15%)
        if (thuNhap > 18) {
            tongThue += 8 * 0.15;
        } else {
            return tongThue + ((thuNhap - 10) * 0.15);
        }

        // Bậc 4: 18 - 32 triệu (20%)
        if (thuNhap > 32) {
            tongThue += 14 * 0.20;
        } else {
            return tongThue + ((thuNhap - 18) * 0.20);
        }

        // Bậc 5: 32 - 52 triệu (25%)
        if (thuNhap > 52) {
            tongThue += 20 * 0.25;
        } else {
            return tongThue + ((thuNhap - 32) * 0.25);
        }

        // Bậc 6 và 7: 52 - 80 triệu (30%) và trên 80 triệu (35%)
        if (thuNhap > 80) {
            tongThue += 28 * 0.30;
            tongThue += (thuNhap - 80) * 0.35;
        } else {
            return tongThue + ((thuNhap - 52) * 0.30);
        }

        return tongThue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double thuNhap = -1;

        while (thuNhap < 0) {
            System.out.print("Nhập vào tổng thu nhập hàng năm của bạn : ");
            thuNhap = scanner.nextDouble();

            if (thuNhap < 0) {
                System.out.println("Lỗi: Thu nhập không được là số âm! Vui lòng nhập lại.\n");
            }
        }

        double thuePhaiTra = tinhThue(thuNhap);

        // Xuất số thuế cuối cùng
        System.out.println("Số thuế bạn phải trả là: " + thuePhaiTra + " triệu đồng");

        scanner.close();
    }
}
