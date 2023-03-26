public  class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;
    public MayBay (HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("May Bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }
public String getLoaiNhienLieu()
{
    return loaiNhienLieu
}

    public void setLoaiNhienLieu(String loaiNhienLieu)
    {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() { //Lay van toc can tim//
        return 200;
    }
}

