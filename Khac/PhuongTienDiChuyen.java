public abstract class PhuongTienDiChuyen {
    private String tenLoaiPhuongTien;
    private HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public String layTenHangSanXuat() //lay tu hangsanxuat.java chi viec goi lai
    {
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public abstract double layVanToc();  // toc do cua cac loai xe la khac nhau//
}