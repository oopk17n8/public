package database;

import Entity.GiaoDich;

public class InDSGDDAO {
    public GiaoDich[] getAllGD(){
        return ArrayMemoryCoSoDuLieu.queryALLGD();
    }

    public int getCountGD(){
        return ArrayMemoryCoSoDuLieu.getCountGD();
    }
}
