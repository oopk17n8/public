package Entity;

import java.util.Date;

public class Nha extends GiaoDich {
    
    private String diaChi;
    private String loaiNha;
    public Nha (String maGD, Date ngayGD, double donGia, double dienTich, String diaChi, String loaiNha){
        super(maGD, ngayGD, donGia, dienTich);
        this.diaChi=diaChi;
        this.loaiNha=loaiNha;
    }
    @Override
    public String getGD() {
        // TODO Auto-generated method stub
        return "{ma gd: " + maGD + ", ngay gd: " + ngayGD + ", loai nha: " + loaiNha + ", dia chi: " + diaChi + ", dien tich: "+ dienTich + ", don gia: " + donGia + "}";
    }
    @Override
    public double tinhThanhTien() {
        // TODO Auto-generated method stub
        if ("cao cap".equalsIgnoreCase(loaiNha)) {
            return dienTich*donGia;
           }
           else return dienTich*donGia*1.9;    }
}
