package controller;

import Entity.Dat;
import Entity.GiaoDich;
import database.TBThanhTienGDDatDAO;
import ui.TBThanhTienGDDatUI;

public class TBThanhTienGDDatController {
    private TBThanhTienGDDatDAO tbttDAO = null;
    private TBThanhTienGDDatUI tbttui = null;

    public TBThanhTienGDDatController(){
        tbttDAO = new TBThanhTienGDDatDAO();
        tbttui = new TBThanhTienGDDatUI();
    }

    public void tinhTBDat(){
        double tong = 0, avg = 0;; int count = 0;
        GiaoDich[] dsGD = tbttDAO.getAllGD();

        for (GiaoDich gd : dsGD){
            if (gd instanceof Dat) {
                tong += gd.tinhThanhTien();
                count++;
            }
        }

        avg = tong/count;
        tbttui.inTBTTGDDat(avg);
    }
}
