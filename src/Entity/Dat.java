package Entity;

import java.util.Date;

public class Dat extends GiaoDich {
    
    private String loaiDat;
    public Dat(String maGD, Date ngayGD, double donGia, double dienTich, String loaiDat ){
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat=loaiDat;
    }
    @Override
    public String getGD() {
        // TODO Auto-generated method stub
        return "{ma gd: " + maGD + ", ngay gd: " + ngayGD + ", loai dat: " + loaiDat +", dien tich: "+ dienTich + ", don gia: " + donGia + "}";
    }
    @Override
    public double tinhThanhTien() {
        // TODO Auto-generated method stub
        if ("b".equalsIgnoreCase(loaiDat) || "c".equalsIgnoreCase(loaiDat)) {
            return dienTich*donGia;
        }
        else return dienTich*donGia*1.5;
    }
}
