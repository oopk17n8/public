package Entity;

import java.sql.Date;

public class Nha extends GiaoDich {
    
    private String diaChi;
    private String loaiNha;
    public Nha (String maGD, Date ngayGD, double donGia, double dienTich, String diaChi, String loaiNha){
        super(maGD, ngayGD, donGia, dienTich);
        this.diaChi=diaChi;
        this.loaiNha=loaiNha;
    }
}
