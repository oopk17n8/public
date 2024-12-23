package controller;

import Entity.GiaoDich;
import database.InDSGDDAO;
import ui.InDSGDUI;

public class InDSGDController {
    private InDSGDDAO inDSGDDAO = null;
    private InDSGDUI inDSGDUI = null;

    public InDSGDController(){
        inDSGDDAO = new InDSGDDAO();
        inDSGDUI = new InDSGDUI();
    }

    public void getDSGD(){
        GiaoDich[] dsGD = inDSGDDAO.getAllGD();
        int size = inDSGDDAO.getCountGD();

        inDSGDUI.inDSGD(dsGD, size);
    }
}
