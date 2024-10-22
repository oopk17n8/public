package Entity;

import java.util.Date;

public class Dat extends GiaoDich {
    private boolean loaiDat;
    public Dat(long maGD, Date ngayGD, double donGia, double dienTich, boolean loaiDat){
        super(maGD, null, donGia, dienTich);
        this.loaiDat=loaiDat;
    }
}
