package Entity;

import java.util.Date;

public class GiaoDich {
    protected long maGD;
    protected Date ngayGD;
    protected double donGia;
    protected double dienTich;
    protected GiaoDich(long maGD, Date ngayGD, double donGia, double dienTich){
        super();
        this.maGD = maGD;
        this.ngayGD=ngayGD;
        this.donGia=donGia;
        this.dienTich=dienTich;
    }
    public double getdonGia(){
        return donGia;
    }
}
