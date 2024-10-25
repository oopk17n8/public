package ui;

import java.io.PrintWriter;

public class ThemGDOutputConsoleUI {
    private PrintWriter screenPrompt = null;

    public ThemGDOutputConsoleUI(){
        screenPrompt = new PrintWriter(System.out);
    }

    public void showResult(){
        screenPrompt.println("Da them gd thanh cong!");
    }
}
