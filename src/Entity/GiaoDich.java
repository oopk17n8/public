package Entity;

import java.util.Date;

public abstract class GiaoDich {
  private static int id;
  protected String maGD;
  protected Date ngayGD;
  protected double donGia;
  protected double dienTich;

  protected GiaoDich(String maGD, Date ngayGD, double donGia, double dienTich) {
    super();
    this.maGD = maGD;
    this.ngayGD = ngayGD;
    this.donGia = donGia;
    this.dienTich = dienTich;
  }

  public double getdonGia() {
    return donGia;
  }

  public String getMaGD() {
    return maGD;
  }

  public abstract String getGD();
  public abstract double tinhThanhTien();

  public int getId() {
    return id+1;
  }
}
