package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KyThuat nv1 = new KyThuat("TP1234", "Nguyen Van A", "01/01/1990", "Ha Noi", "Khoa hoc may tinh");


        KyThuat nv2 = new KyThuat("TP5678", "", "", "", "");
        nv2.setHoTen("Tran Thi B");
        nv2.setNamSinh("01/01/1995");
        nv2.setDiaChi("Ho Chi Minh");
        nv2.setChuyenNganh("An toan thong tin");


        // Tạo đối tượng NhanVien KyThuat từ dữ liệu nhập từ bàn phím
        Scanner nv = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        String maNV = nv.nextLine();
        System.out.print("Nhập họ tên: ");
        String hoTen = nv.nextLine();
        System.out.print("Nhập năm sinh: ");
        String namSinh = nv.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = nv.nextLine();
        System.out.print("Nhập chuyên ngành: ");
        String chuyenNganh = nv.nextLine();

        KyThuat nv3 = new KyThuat(maNV, hoTen, namSinh, diaChi, chuyenNganh);

        System.out.println(nv1.toString());
        System.out.println(nv1.motaCongViec());

        System.out.println(nv2.toString());
        System.out.println(nv2.motaCongViec());

        System.out.println(nv3.toString());
        System.out.println(nv3.motaCongViec());


    }
}
