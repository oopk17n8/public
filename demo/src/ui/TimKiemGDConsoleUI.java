package ui;
import java.util.Scanner;

import Entity.GiaoDich;
import controller.TimKiemGDController;
public class TimKiemGDConsoleUI {
    private TimKiemGDController SGDController = null;
    private Scanner sc = null;

    public TimKiemGDConsoleUI(){
        SGDController = new TimKiemGDController();
        sc = new Scanner(System.in);
    }
    public void searchGD(){
        
        System.out.print("Nhap ma giao dich can tim: ");
        String ma = sc.nextLine();
        GiaoDich gd = SGDController.timGiaoDich(ma);

        if (gd != null) {
            System.out.println("Da tim thay giao dich, " + gd);
        } else {
            System.out.println("Khong tim thay giao dich.");
        }
    }
}
