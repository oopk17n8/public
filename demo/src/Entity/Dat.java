package Entity;

import java.sql.Date;

public class Dat extends GiaoDich {
    
    private String loaiDat;
    public Dat(String maGD, Date ngayGD, double donGia, double dienTich, String loaiDat ){
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat=loaiDat;
    }
}
