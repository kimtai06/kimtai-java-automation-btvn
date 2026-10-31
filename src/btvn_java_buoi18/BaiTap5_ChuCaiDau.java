package btvn_java_buoi18;

import java.util.Scanner;

public class BaiTap5_ChuCaiDau {
    public static String layChuCaiDau(String chuoi) {
        if (chuoi == null || chuoi.trim().isEmpty()) {
            return "";
        }
        chuoi = chuoi.trim();
        String ketQua = "";
        ketQua = ketQua + Character.toUpperCase(chuoi.charAt(0));

        for (int i = 1; i < chuoi.length(); i++) {
            if (chuoi.charAt(i - 1) == ' ' && chuoi.charAt(i) != ' ') {
                ketQua = ketQua + " " + Character.toUpperCase(chuoi.charAt(i));
            }
        }

        return ketQua;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một câu bất kỳ: ");
        String chuoi = scanner.nextLine();

        String output = layChuCaiDau(chuoi);

        System.out.println("Các chữ cái đầu của mỗi từ trong chuỗi: \"" + output + "\"");

        scanner.close();
    }
}
