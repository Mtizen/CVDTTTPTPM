package AccountManager;

public class GiaoDich {
    private double SoTien;
    private String MaXacThuc;
    private TaiKhoanNganHang TaiKhoan;

    public GiaoDich(double soTien, String maXacThuc, TaiKhoanNganHang taiKhoan) {
        this.SoTien = soTien;
        this.MaXacThuc = maXacThuc;
        this.TaiKhoan = taiKhoan;
    }

    public void ThucHienGiaoDich() {
        if (TaiKhoan == null) {
            System.out.println("Giao dịch thất bại: Tài khoản không tồn tại!");
            return;
        }
        if (MaXacThuc == null || MaXacThuc.isEmpty()) {
            System.out.println("Giao dịch thất bại: Mã xác thực không hợp lệ!");
            return;
        }
        if (!TaiKhoan.KiemTraHanMuc(SoTien)) {
            System.out.println("Giao dịch thất bại: Vượt quá hạn mức giao dịch!");
            return;
        }
        TaiKhoan.GiamSoDu(SoTien);
        System.out.println("Giao dịch thành công! Số tiền: " + SoTien + ", Mã xác thực: " + MaXacThuc);
    }

    public void HienThiChiTiet() {
        System.out.println("Chi tiết giao dịch: Số tiền: " + SoTien + ", Mã xác thực: " + MaXacThuc);
    }
}
