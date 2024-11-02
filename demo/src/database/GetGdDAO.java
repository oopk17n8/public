package database;
import Entity.GiaoDich;
public class GetGdDAO {
    public GiaoDich[] getALLGd(){
        return ArrayMemoryCoSoDuLieu.queryALLGD();
    }
}
