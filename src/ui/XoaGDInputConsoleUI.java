package ui;

import controller.XoaGDController;
import java.io.PrintWriter;
import java.util.Scanner;

public class XoaGDInputConsoleUI {
    private Scanner keyBoardInput = null;
    private PrintWriter screenPrompt = null;
    private XoaGDController xoaGDController = null;
    private String maGD;

    public XoaGDInputConsoleUI() {
        keyBoardInput = new Scanner(System.in);
        screenPrompt = new PrintWriter(System.out, true);
        xoaGDController = new XoaGDController();
        maGD = "Nhap ma Giao Dich: ";
    }

    public void xoaGD() {
        screenPrompt.print(maGD);
        screenPrompt.flush();
        String maGD = keyBoardInput.nextLine();
        xoaGDController.xoaGiaoDich(maGD);
    }
}
