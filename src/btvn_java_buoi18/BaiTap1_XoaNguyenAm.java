package btvn_java_buoi18;

import java.util.Scanner;

public class BaiTap1_XoaNguyenAm {
    //Ham xoa nguyen am
    public static String xoaNguyenAm(String chuoiBanDau) {
        StringBuilder chuoiKetQua = new StringBuilder();
        String chuoiChuThuong = chuoiBanDau.toLowerCase();

        for (int i = 0; i < chuoiBanDau.length(); i++) {
            char kyTuHienTai = chuoiChuThuong.charAt(i);

            if (kyTuHienTai == 'a' || kyTuHienTai == 'e' || kyTuHienTai == 'i'
                    || kyTuHienTai == 'o' || kyTuHienTai == 'u') {
                continue;
            } else {
                chuoiKetQua.append(chuoiBanDau.charAt(i));
            }
        }
        return chuoiKetQua.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi ký tự bất kỳ của bạn: ");

        String chuoiNguoiDungNhap = scanner.nextLine();

        String ketQua = xoaNguyenAm(chuoiNguoiDungNhap);
        System.out.println("Kết quả sau khi xóa nguyên âm: " + ketQua);

        scanner.close();
    }
}
