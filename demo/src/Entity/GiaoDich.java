package Entity;

import java.sql.Date;

public class GiaoDich {
    protected int maGD;
    protected Date ngayGD;
    protected double donGia;
    protected double dienTich;
    protected GiaoDich(int maGD, Date ngayGD, double donGia, double dienTich){
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
