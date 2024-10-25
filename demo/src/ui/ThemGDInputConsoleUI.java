package ui;

import java.util.Date;
import java.util.Scanner;

import controller.ThemGDController;

import java.io.PrintWriter;

public class ThemGDInputConsoleUI {
    private Scanner keyBoardInput = null;
    private PrintWriter screenPrompt = null;
    private String loaiDat, loaiNha, loaiGD, maGDPropmt, ngayGDPrompt, donGiaPrompt, dienTichPrompt, diaChiPrompt;
    
    private ThemGDController themGDController = null;

    public ThemGDInputConsoleUI(){
        screenPrompt = new PrintWriter(System.out, true);
        keyBoardInput = new Scanner(System.in);
        themGDController = new ThemGDController();
        
        maGDPropmt = "MA GIAO DICH: ";
        ngayGDPrompt = "NGAY GIAO DINH: ";
        donGiaPrompt = "DON GIA: ";
        dienTichPrompt = "DIEN TICH: ";

        loaiGD = "LOAI GIAO DICH [\"Dat\" / \"Nha\"]: ";
        loaiDat = "LOAI DAT [\"Loai A\" / \"Loai B\" / \"Loai C\"]: ";
        loaiNha = "LOAI NHA [\"Cao Cap\" / \"Thuong\"]: "; diaChiPrompt = "DIA CHI: ";
    }

    public void nhapThongTinGD(){
        screenPrompt.print(maGDPropmt);screenPrompt.flush();
        int maGD = keyBoardInput.nextInt();keyBoardInput.nextLine();

        //screenPrompt.print(ngayGDPrompt);screenPrompt.flush();
        Date ngayGD = null;

        screenPrompt.print(donGiaPrompt);screenPrompt.flush();
        double donGia = keyBoardInput.nextDouble();

        screenPrompt.print(dienTichPrompt);screenPrompt.flush();
        double dienTich = keyBoardInput.nextDouble();

        screenPrompt.print(loaiGD);screenPrompt.flush();
        String loaiGD = keyBoardInput.nextLine();

        if ("Dat".equalsIgnoreCase(loaiGD)){
            screenPrompt.print(loaiDat);screenPrompt.flush();
            if ("Loai A".equalsIgnoreCase(loaiDat)){
                themGDController.themGD(maGD, ngayGD, donGia, dienTich, true);
            }
            else {themGDController.themGD(maGD, ngayGD, donGia, dienTich, false);}
        }
        if ("Nha".equalsIgnoreCase(loaiGD)){
            screenPrompt.print(loaiNha);screenPrompt.flush();
            if ("Cao cap".equalsIgnoreCase(loaiNha)){
                screenPrompt.print(diaChiPrompt);screenPrompt.flush();
                String diaChi = keyBoardInput.nextLine();
                themGDController.themGD(maGD, ngayGD, donGia, dienTich, diaChi, false);
            }
            else {
                screenPrompt.print(diaChiPrompt);screenPrompt.flush();
                String diaChi = keyBoardInput.nextLine();
                themGDController.themGD(maGD, ngayGD, donGia, dienTich, diaChi, false);
            }
        }
    }
    public void setThemGDController(ThemGDController themGDController){
        this.themGDController = themGDController;
    }

}
