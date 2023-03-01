package Bai3;

public class VanBan {
    private String vanBan;

    public VanBan() {
        this.vanBan = "";
    }

    public VanBan(String st) {
        this.vanBan = st;
    }

    public int demSoTu() {
        String[] words = vanBan.split("\\s+");
        return words.length;
    }

    public String chuanHoa() {
        return vanBan.trim().replaceAll("\\s+", " ");
    }

    public String vietHoa() {
        return vanBan.toUpperCase();
    }

    public String vietThuong() {
        return vanBan.toLowerCase();
    }

}
