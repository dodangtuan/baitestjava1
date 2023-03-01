package Bai2;

public class KyThuat extends Nhanvien {
    private String chuyenNganh;

    public KyThuat(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public KyThuat(String maNV, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNV, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String motaCongViec() {
        return chuyenNganh;
    }

    @Override
    public String toString() {
        return "KyThuat\n" +
                "Mã nhân viên = '" + maNV + '\'' +
                ",Họ tên = :'" + hoTen + '\'' +
                ",Năm sinh = '" + namSinh + '\'' +
                ",Địa chỉ = '" + diaChi + '\'' +
                "Chuyên Ngành: " + chuyenNganh +
                "\nMô tả công việc: "+ motaCongViec();
    }
}
