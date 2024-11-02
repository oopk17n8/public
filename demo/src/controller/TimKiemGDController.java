package controller;

import Entity.GiaoDich;
import database.GetGdDAO;


public class TimKiemGDController {
    private GetGdDAO SGdDAO = null;
    public TimKiemGDController(){
        SGdDAO = new GetGdDAO();
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
