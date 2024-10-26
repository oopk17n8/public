import database.ArrayMemoryCoSoDuLieu;
import ui.GDMenuConsoleUI;

public class AppGiaoDich {
    public static ArrayMemoryCoSoDuLieu database = null;
    public static void main(String[] args) throws Exception {
        ArrayMemoryCoSoDuLieu.initDatabase();
        GDMenuConsoleUI menu = new GDMenuConsoleUI();
        menu.controlloop();
    }
}
