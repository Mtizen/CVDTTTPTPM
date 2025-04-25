package AccountManager;

public class Main {
    public static void main(String[] args) {
        TaiKhoanNganHang tk = new TaiKhoanNganHang("987654321", 2000000, 1000000);
        tk.HienThiThongTin();

        GiaoDich gd1 = new GiaoDich(500000, "XT123", tk);
        gd1.ThucHienGiaoDich();
        gd1.HienThiChiTiet();
        tk.HienThiThongTin();

        GiaoDich gd2 = new GiaoDich(1500000, "XT456", tk);
        gd2.ThucHienGiaoDich();

        GiaoDich gd3 = new GiaoDich(200000, "XT789", null);
        gd3.ThucHienGiaoDich();
    }
}
