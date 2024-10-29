package Entity;

import java.sql.Date;

public class Dat extends GiaoDich {
    
    private String loaiDat;
    public Dat(long maGD, Date ngayGD, double donGia, double dienTich, String loaiDat ){
        super(maGD, null, donGia, dienTich);
        this.loaiDat=loaiDat;
    }
}
