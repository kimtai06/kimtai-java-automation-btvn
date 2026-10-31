package btvn_java_buoi18;

import java.util.Scanner;

public class BaiTap4_DemSoTu {
    public static int demSoTuTrongChuoi(String chuoi) {
        if (chuoi == null || chuoi.trim().isEmpty()) {
            return 0;
        }
        chuoi = chuoi.trim();

        int soTu = 1;

        for (int i = 0; i < chuoi.length() - 1; i++) {
            if (chuoi.charAt(i) == ' ' && chuoi.charAt(i + 1) != ' ') {
                soTu++;
            }
        }

        return soTu;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một câu bất kỳ: ");
        String chuoi = scanner.nextLine();

        int ketQua = demSoTuTrongChuoi(chuoi);

        System.out.println("Số từ trong chuỗi là: " + ketQua);

        scanner.close();
    }
}
