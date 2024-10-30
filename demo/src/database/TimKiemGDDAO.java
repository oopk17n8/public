package database;
import Entity.GiaoDich;
public class TimKiemGDDAO {
    public GiaoDich[] getALLGd(){
        return ArrayMemoryCoSoDuLieu.queryALLGD();
    }
}
