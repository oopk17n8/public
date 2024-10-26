package Entity;

import java.util.Date;

public class Nha extends GiaoDich {
    private String diaChi;
    private boolean loaiNha;
    public Nha (long maGD, String ngayGD, double donGia, double dienTich, String diaChi, boolean loaiNha){
        super(maGD, ngayGD, donGia, dienTich);
        this.diaChi=diaChi;
        this.loaiNha=loaiNha;
    }
}
