package Entity;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class GiaoDich {
  private static int id;
  protected String maGD;
  protected Date ngayGD;
  protected double donGia;
  protected double dienTich;
  private NumberFormat f,f1;
  protected GiaoDich(String maGD, Date ngayGD, double donGia, double dienTich) {
    super();
    this.maGD = maGD;
    this.ngayGD = ngayGD;
    this.donGia = donGia;
    this.dienTich = dienTich;
    f = new DecimalFormat("#0.00 vnd");
    f1 = new DecimalFormat("#0.0");
  }

  public double getdonGia() {
    return donGia;
  }

  public String getMaGD() {
    return maGD;
  }

  public String toString() {
    return "Giao dich ma so: " + maGD +
        "\n ngay giao dich: " + ngayGD +
        "\n gia: " + f.format(donGia) +
        "\n dien tich: " + f1.format(dienTich);
  }

  public int getId() {
    return id;
  }
}
