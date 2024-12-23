package ui;
import java.util.Scanner;

import controller.InDSGDController;
import controller.TBThanhTienGDDatController;

import java.io.PrintWriter;

public class GDMenuConsoleUI {
    private Scanner keyBoardInput = null;
    private String prompt = null;
    private PrintWriter screenPrompt = null;
    private ThemGDInputConsoleUI themGDCUI = null;
    private TimKiemGDConsoleUI timGDCUI = null;
    private XoaGDInputConsoleUI xoaGDCUI = null;
    private InDSGDController inDSGD = null;
    private TBThanhTienGDDatController tbDat = null;

    public GDMenuConsoleUI(){
        prompt = "-> ";
        keyBoardInput = new Scanner(System.in);
        screenPrompt = new PrintWriter(System.out, true);
        themGDCUI = new ThemGDInputConsoleUI();
        timGDCUI = new TimKiemGDConsoleUI();
        xoaGDCUI = new XoaGDInputConsoleUI();
        inDSGD = new InDSGDController();
        tbDat = new TBThanhTienGDDatController();
    }

    public void controlloop(){
        String command  = " ";
        screenPrompt.println("go lenh \"help\" de duoc ho tro");

        while(true){
            screenPrompt.print(prompt);
            screenPrompt.flush();
            command = keyBoardInput.nextLine();
            command = command.trim();
            if (command.equalsIgnoreCase("help")){
                help();
                continue;
            }
            if (command.equalsIgnoreCase("add")){
                themGD();
                continue;
            }

            if (command.equalsIgnoreCase("in")) {
                inDSGD();
                continue;
            }
            if(command.equalsIgnoreCase("tim")){
                timGD();
                continue;
            }
            if (command.equalsIgnoreCase("tbdat")) {
                tinhTBDat();
                continue;
            }
            if(command.equalsIgnoreCase("xoa")){
                xoaGD();
                continue;
            }
            if (command.equalsIgnoreCase("quit")){
                break;
            }
        }

    }

    private void help(){
        screenPrompt.println("~~~~~Console Help Menu~~~~~");
		screenPrompt.println("[HELP] Ho tro su dung phan mem");
		screenPrompt.println("[ADD] Them giao dich moi");
        screenPrompt.println("[TIM] Tim giao dich");
        screenPrompt.println("[IN] Tim giao dich");
        screenPrompt.println("[TBDAT] Tinh trung binh thanh tien giao dich dat");
        screenPrompt.println("[XOA] Xoa giao dich");
		screenPrompt.println("[QUIT] Dong phan mem");
    }

    private void themGD()   {
        themGDCUI.nhapThongTinGD();
    }

    private void timGD(){
        timGDCUI.searchGD();
    }
    private void xoaGD(){
        xoaGDCUI.xoaGD();
    }
    private void inDSGD(){
        inDSGD.getDSGD();
    }
    private void tinhTBDat(){
        tbDat.tinhTBDat();
    }
}
