package ui;

import java.io.PrintWriter;

import Entity.GiaoDich;

public class InDSGDUI {
    private PrintWriter screenPrompt = null;
    
    public InDSGDUI(){
        screenPrompt = new PrintWriter(System.out,true);
    }
    public void inDSGD(GiaoDich[] dsgd){
        for(GiaoDich gd : dsgd){
            screenPrompt.println(gd);screenPrompt.flush();
        }
    }
    public void inDSGD(GiaoDich[] dsgd, int size){
        for (int i = 0; i < size; i++) {
            GiaoDich gd = dsgd[i];
            if (dsgd[i] != null) {
                screenPrompt.println(gd.getGD());
            }
        }
    }
}
