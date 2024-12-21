package ui;
import java.util.Date;
import java.util.Scanner;
import controller.ThemGDController;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ThemGDInputConsoleUI {
    private Scanner keyBoardInput = null;
    private PrintWriter screenPrompt = null;
    private String loaiDatPrompt, loaiNhaPrompt, maGDPropmt, ngayGDPrompt, donGiaPrompt, dienTichPrompt, diaChiPrompt,loaiGD;
    private ThemGDController themGDController = null;
    
    public ThemGDInputConsoleUI(){
        screenPrompt = new PrintWriter(System.out, true);
        keyBoardInput = new Scanner(System.in);
        themGDController = new ThemGDController();
        
        maGDPropmt = "MA GIAO DICH: ";
        ngayGDPrompt = "NGAY GIAO DICH [dd/mm/yyyy]: ";
        donGiaPrompt = "DON GIA: ";
        dienTichPrompt = "DIEN TICH: ";

        loaiGD = "LOAI GIAO DICH [\"Dat\" / \"Nha\"]: ";
        loaiDatPrompt = "LOAI DAT [A/B/C]: ";
        loaiNhaPrompt = "LOAI NHA [Cao cap/Thuong]: ";
        diaChiPrompt = "DIA CHI: ";
    }
    
    public void nhapThongTinGD(){
        screenPrompt.print(maGDPropmt);screenPrompt.flush();
        String maGD = keyBoardInput.nextLine();
        
        Date ngayGDJ = null;
        SimpleDateFormat spDateF = new SimpleDateFormat("dd/mm/yyyy");
        boolean validInput = false;
        while(!validInput){
            screenPrompt.print(ngayGDPrompt);screenPrompt.flush();
            String ngayGD = keyBoardInput.nextLine();
            try {
                ngayGDJ = spDateF.parse(ngayGD);
                validInput = true;
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                screenPrompt.println("vui long nhap lai theo format (dd/mm/yyyy).");
            }
        }    




        screenPrompt.print(loaiGD);screenPrompt.flush();
        String loaiGD = keyBoardInput.nextLine();

        if("Dat".equalsIgnoreCase(loaiGD)){
            screenPrompt.print(loaiDatPrompt);screenPrompt.flush();
            String loaiDat = keyBoardInput.nextLine();
            screenPrompt.print(dienTichPrompt);screenPrompt.flush();
            double dienTich = keyBoardInput.nextDouble();keyBoardInput.nextLine();
            screenPrompt.print(donGiaPrompt);screenPrompt.flush();
            double donGia = keyBoardInput.nextDouble();keyBoardInput.nextLine();

            themGDController.themGD(maGD, ngayGDJ, donGia, dienTich, loaiDat);
        }

        if("Nha".equalsIgnoreCase(loaiGD)) {
            screenPrompt.print(loaiNhaPrompt);screenPrompt.flush();
            String loaiNha = keyBoardInput.nextLine();
            screenPrompt.print(dienTichPrompt);screenPrompt.flush();
            double dienTich = keyBoardInput.nextDouble();keyBoardInput.nextLine();
            screenPrompt.print(diaChiPrompt);screenPrompt.flush();
            String diaChi = keyBoardInput.nextLine();
            screenPrompt.print(donGiaPrompt);screenPrompt.flush();
            double donGia = keyBoardInput.nextDouble();keyBoardInput.nextLine();

            themGDController.themGD(maGD, ngayGDJ, donGia, dienTich, diaChi, loaiNha);
        }
    }

    public void setThemGDController(ThemGDController themGDController){
        this.themGDController = themGDController;
    }

}

