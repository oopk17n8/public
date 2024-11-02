package controller;
import Entity.GiaoDich;
import database.GetGdDAO;
import ui.XoaGDOutputConsoleUI;
public class XoaGDController {
    private GetGdDAO XGdDAO = null;
    private XoaGDOutputConsoleUI XGdOut = null;
    public XoaGDController(){
        XGdDAO = new GetGdDAO();
        XGdOut = new XoaGDOutputConsoleUI();
    }
       public GiaoDich xoaGiaoDich(String maGiaoDich) {
        for (GiaoDich gd : XGdDAO.getALLGd()) {
            if (gd != null && gd.getMaGD().equals(maGiaoDich)) {
                XGdOut.success();
                return gd = null;
            }
            else XGdOut.fail();
        }
        return null;
    }
}
