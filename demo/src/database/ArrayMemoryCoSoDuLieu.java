package database;

import Entity.Dat;
import Entity.GiaoDich;
import Entity.Nha;

public class ArrayMemoryCoSoDuLieu {

    private static GiaoDich[] listGD = null;
    private static int countGD = 0;

    private static void initDatabase(){
        listGD = new GiaoDich[100];
    }

    public static void insertGD(GiaoDich gd){ //them danh sach giao dich
        listGD[countGD] = gd;
        countGD++;
    }

    public static GiaoDich[] queryALLGD(){
        return listGD;
    }

    public static int getCountGD(){
        return countGD;
    }
}
