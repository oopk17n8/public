package ui;


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

        screenPrompt.print(ngayGDPrompt);screenPrompt.flush();
        String ngayGD = keyBoardInput.nextLine();

        screenPrompt.print(donGiaPrompt);screenPrompt.flush();
        double donGia = keyBoardInput.nextDouble();

        screenPrompt.print(dienTichPrompt);screenPrompt.flush();
        double dienTich = keyBoardInput.nextDouble();

        screenPrompt.print(loaiGD);screenPrompt.flush();
        String loaiGD = keyBoardInput.nextLine();

        if (loaiGD.equalsIgnoreCase("dat")){
            screenPrompt.print(loaiDat);screenPrompt.flush();
            String loaiDat = keyBoardInput.nextLine();
            //if (loaiDat.equalsIgnoreCase("a")){
            //    themGDController.themGD(maGD, ngayGD, donGia, dienTich, true);
            //}
            //else {themGDController.themGD(maGD, ngayGD, donGia, dienTich, false);
            //}
            themGDController.themGD(maGD, ngayGD, donGia, dienTich, false);
        }

        if (loaiGD.equalsIgnoreCase("nha")){
            screenPrompt.print(diaChiPrompt);screenPrompt.flush();
            String diaChi = keyBoardInput.nextLine();
            screenPrompt.print(loaiNha);screenPrompt.flush();
            String loaiNha = keyBoardInput.nextLine();
           // if (loaiNha.equalsIgnoreCase("cao cap")){
           //     screenPrompt.print(diaChiPrompt);screenPrompt.flush();
           //     String diaChi = keyBoardInput.nextLine();
           //     themGDController.themGD(maGD, ngayGD, donGia, dienTich, diaChi, false);
           // }
           // else {
           //     screenPrompt.print(diaChiPrompt);screenPrompt.flush();
           //     String diaChi = keyBoardInput.nextLine();
           //     themGDController.themGD(maGD, ngayGD, donGia, dienTich, diaChi, false);
           // }
           themGDController.themGD(maGD, ngayGD, donGia, dienTich, diaChi, false);
        }
    }

    
    public void setThemGDController(ThemGDController themGDController){
        this.themGDController = themGDController;
    }

}

