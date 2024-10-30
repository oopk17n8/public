package controller;

import Entity.GiaoDich;
import database.TimKiemGDDAO;

public class TimKiemGDController {
    private TimKiemGDDAO SGdDAO = null;
    
    public TimKiemGDController(){
        SGdDAO = new TimKiemGDDAO();
    }
       public GiaoDich timGiaoDich(String maGiaoDich) {
        for (GiaoDich gd : SGdDAO.getALLGd()) {
            if (gd != null && gd.getMaGD().equals(maGiaoDich)) {
                return gd;
            }
        }
        return null;
    }
}
