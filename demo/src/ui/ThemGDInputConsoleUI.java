package ui;

import java.sql.Date;
import java.util.Scanner;

import controller.ThemGDController;

import java.io.PrintWriter;

public class ThemGDInputConsoleUI {
    private Scanner keyBoardInput = null;
    private PrintWriter screenPrompt = null;
    private String loaiDatPrompt, loaiNhaPrompt, loaiGDPrompt, maGDPropmt, 
    ngayGDPrompt, donGiaPrompt, dienTichPrompt, diaChiPrompt,loaiGD;
    
    private ThemGDController themGDController = null;

    public ThemGDInputConsoleUI(){
        screenPrompt = new PrintWriter(System.out, true);
        keyBoardInput = new Scanner(System.in);
        themGDController = new ThemGDController();
        
        maGDPropmt = "MA GIAO DICH: ";
        ngayGDPrompt = "NGAY GIAO DICH [yyyy-mm-dd]: ";
        donGiaPrompt = "DON GIA: ";
        dienTichPrompt = "DIEN TICH: ";

        loaiGDPrompt = "LOAI GIAO DICH [Dat/Nha]: ";
        loaiDatPrompt = "LOAI DAT [A/B/C]: ";
        loaiNhaPrompt = "LOAI NHA [Cao cap/Thuong]: ";
        diaChiPrompt = "DIA CHI: ";
    }

    public void nhapThongTinGD(){
        screenPrompt.print(maGDPropmt);screenPrompt.flush();
        int maGD = keyBoardInput.nextInt();keyBoardInput.nextLine();

        screenPrompt.print(ngayGDPrompt);screenPrompt.flush();
        Date ngayGD = Date.valueOf((String)keyBoardInput.nextLine());

        screenPrompt.print(donGiaPrompt);screenPrompt.flush();
        double donGia = keyBoardInput.nextDouble();

        screenPrompt.print(dienTichPrompt);screenPrompt.flush();
        double dienTich = keyBoardInput.nextDouble();

        screenPrompt.print(loaiGDPrompt);screenPrompt.flush();
        loaiGD = keyBoardInput.nextLine();loaiGD.trim();
        
        if("dat".equalsIgnoreCase(loaiGD)){
            screenPrompt.print(loaiDatPrompt);screenPrompt.flush();
            String loaiDat = keyBoardInput.nextLine();

            themGDController.themGD(maGD, ngayGD, donGia, dienTich, loaiDat);
        }
        if("nha".equalsIgnoreCase(loaiGD)) {
            screenPrompt.print(diaChiPrompt);screenPrompt.flush();
            String diaChi = keyBoardInput.nextLine();
            screenPrompt.print(loaiNhaPrompt);screenPrompt.flush();
            String loaiNha = keyBoardInput.nextLine();

            themGDController.themGD(maGD, ngayGD, donGia, dienTich, diaChi, loaiNha);
        }
    }

    
    public void setThemGDController(ThemGDController themGDController){
        this.themGDController = themGDController;
    }

}

