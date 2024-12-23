package ui;

import java.io.PrintWriter;
import java.text.DecimalFormat;

public class TBThanhTienGDDatUI {
    private PrintWriter screenPrompt = null;
    public TBThanhTienGDDatUI(){
        screenPrompt = new PrintWriter(System.out, true);
    }

    public void inTBTTGDDat(double tb){
        DecimalFormat f = new DecimalFormat("#,###.00");
        screenPrompt.println("Trung binh thanh tien giao dinh dat: " + f.format(tb) );
    }
}
