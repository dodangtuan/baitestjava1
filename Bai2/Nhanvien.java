package Bai2;

public abstract class Nhanvien {
    public String maNV;
    public String hoTen;
    public String namSinh;
    public String diaChi;

    public Nhanvien() {
    }

    public Nhanvien(String maNV, String hoTen, String namSinh, String diaChi) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public abstract String motaCongViec();

    @Override
    public String toString() {
        return "Nhân Viên" +
                "Mã nhân viên = '" + maNV + '\'' +
                ",Họ tên = :'" + hoTen + '\'' +
                ",Năm sinh = '" + namSinh + '\'' +
                ",Địa chỉ = '" + diaChi + '\'' ;
    }
}
