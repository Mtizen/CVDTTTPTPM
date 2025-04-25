package AccountManager;

public class TaiKhoanNganHang {
    private String SoTaiKhoan;
    private double SoDu;
    private double HanMucGiaoDich;

    public TaiKhoanNganHang(String soTaiKhoan, double soDu, double hanMucGiaoDich) {
        this.SoTaiKhoan = soTaiKhoan;
        this.SoDu = soDu;
        this.HanMucGiaoDich = hanMucGiaoDich;
    }

    public boolean KiemTraHanMuc(double SoTien) {
        return SoTien <= HanMucGiaoDich;
    }

    public void GiamSoDu(double SoTien) {
        if (SoDu >= SoTien) {
            SoDu -= SoTien;
        } else {
            System.out.println("Số dư không đủ!");
        }
    }

    public void TangSoDu(double SoTien) {
        SoDu += SoTien;
    }

    public void HienThiThongTin() {
        System.out.println("Số tài khoản: " + SoTaiKhoan + ", Số dư: " + SoDu + ", Hạn mức: " + HanMucGiaoDich);
    }

    public double getSoDu() {
        return SoDu;
    }
}
