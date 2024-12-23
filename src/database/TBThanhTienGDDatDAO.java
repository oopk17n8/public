package database;

import Entity.GiaoDich;

public class TBThanhTienGDDatDAO {
    public GiaoDich[] getAllGD(){
        return ArrayMemoryCoSoDuLieu.queryALLGD();
    }
}
