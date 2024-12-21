package ui;
import java.util.Scanner;
import java.io.PrintWriter;

public class GDMenuConsoleUI {
    private Scanner keyBoardInput = null;
    private String prompt = null;
    private PrintWriter screenPrompt = null;
    private ThemGDInputConsoleUI themGDCUI = null;
    private TimKiemGDConsoleUI timGDCUI = null;
    private XoaGDInputConsoleUI xoaGDCUI = null;

    public GDMenuConsoleUI(){
        prompt = "-> ";
        keyBoardInput = new Scanner(System.in);
        screenPrompt = new PrintWriter(System.out, true);
        themGDCUI = new ThemGDInputConsoleUI();
        timGDCUI = new TimKiemGDConsoleUI();
        xoaGDCUI = new XoaGDInputConsoleUI();
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
            if(command.equalsIgnoreCase("s")){
                timGD();
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
        screenPrompt.println("[S] Tim giao dich");
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
}
