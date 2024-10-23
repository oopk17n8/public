package database;
import Entity.GiaoDich;
public class ThemGDDAO { //DAO: data access object
    public void themGD(GiaoDich gd){
        ArrayMemoryCoSoDuLieu.insertGD(gd);
    }
}
