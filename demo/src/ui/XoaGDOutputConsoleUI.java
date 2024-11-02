package ui;

import java.io.PrintWriter;

public class XoaGDOutputConsoleUI {
    private PrintWriter screenPrompt = null;

    public XoaGDOutputConsoleUI(){
        screenPrompt = new PrintWriter(System.out,true);
    }

    public void success(){
        screenPrompt.println("xoa gd thanh cong");
    }

    public void fail(){
        screenPrompt.println("xoa giao dich khong thanh cong");
    }
}
