package Entity;

import java.util.Date;

public class GiaoDich {
    protected long maGD;
    protected String ngayGD;
    protected double donGia;
    protected double dienTich;
    protected GiaoDich(long maGD, String ngayGD, double donGia, double dienTich){
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
