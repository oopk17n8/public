package Entity;

import java.sql.Date;

public abstract class GiaoDich {
    protected String maGD;
    protected Date ngayGD;
    protected double donGia;
    protected double dienTich;
    protected GiaoDich(String maGD, Date ngayGD, double donGia, double dienTich){
        super();
        this.maGD = maGD;
        this.ngayGD=ngayGD;
        this.donGia=donGia;
        this.dienTich=dienTich;
    }
    
    public double getdonGia(){
        return donGia;
    }

    public String getMaGD(){
        return maGD;
    }

    public String toString(){
        return "Giao dich ma so: " + maGD +
        "\n ngay giao dich: " + ngayGD +
        "\n gia: " +donGia+
        "\n dien tich: "+dienTich
        ;
    }

}
