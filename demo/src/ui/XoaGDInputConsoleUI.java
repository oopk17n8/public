package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import controller.XoaGDController;

public class XoaGDInputConsoleUI {
    private Scanner keyBoardInput = null;
    private PrintWriter screenPrompt = null;
    private XoaGDController xoaGDController = null;
    String maGD;
    public XoaGDInputConsoleUI(){
        keyBoardInput = new Scanner(System.in);
        screenPrompt = new PrintWriter(System.out,true);
        xoaGDController = new XoaGDController();
        maGD = "Nhap ma Giao Dich: ";
    }
    public void xoaGD(){
        screenPrompt.print(maGD);screenPrompt.flush();
        String maGD = keyBoardInput.nextLine();
        xoaGDController.xoaGiaoDich(maGD);
    }
}
