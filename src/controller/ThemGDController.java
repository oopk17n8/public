package controller;

import Entity.GiaoDich;
import java.util.Date;
import Entity.Dat;
import Entity.Nha;
import database.ThemGDDAO;
import ui.ThemGDOutputConsoleUI;

public class ThemGDController {
    private ThemGDOutputConsoleUI themGdOut = null;
    private ThemGDDAO themGDDAO = null;

    public ThemGDController(){
        themGdOut = new ThemGDOutputConsoleUI();
        themGDDAO = new ThemGDDAO();
    }

    public void themGD(String maGD, Date ngayGD, double donGia, double dienTich, String loaiDat){
        Dat dat = new Dat(maGD, ngayGD, donGia, dienTich, loaiDat);
        themGD(dat);
    }

    public void themGD(String maGD, Date ngayGD, double donGia, double dienTich, String diaChi, String loaiNha){
        Nha nha = new Nha(maGD, ngayGD, donGia, dienTich, diaChi, loaiNha);
        themGD(nha);
    }

    private void themGD(GiaoDich gd){
        themGDDAO.themGD(gd);
        themGdOut.showResult();
    }
}
