package controller;

import Entity.GiaoDich;
import database.GetGdDAO;
import ui.XoaGDOutputConsoleUI;

public class XoaGDController {
    private GetGdDAO XGdDAO = null;
    private XoaGDOutputConsoleUI XGdOut = null;

    public XoaGDController() {
        XGdDAO = new GetGdDAO();
        XGdOut = new XoaGDOutputConsoleUI();
    }

    public GiaoDich xoaGiaoDich(String maGiaoDich) {
        GiaoDich[] allGd = XGdDAO.getALLGd();

        for (GiaoDich gd : allGd) {
            System.out.println("Check gd " + gd.getMaGD());
            if (gd != null && gd.getMaGD().equals(maGiaoDich)) {
                XGdDAO.removeGd(gd);
                XGdOut.success();
                return gd;
            }
        }
        XGdOut.fail();
        return null;
    }
}
