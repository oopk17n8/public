package database;


import Entity.GiaoDich;



public class ArrayMemoryCoSoDuLieu {

    private static GiaoDich[] listGD = null;
    private static int countGD = 0;

    public static void initDatabase(){
        listGD = new GiaoDich[100];
    }

    public static void insertGD(GiaoDich gd){ //them danh sach giao dich
        listGD[countGD] = gd;
        countGD++;
    }
    
    public static void deleteGD(int a){
        listGD[a] = null;
    }

    public static GiaoDich[] queryALLGD(){
        return listGD;
    }

    public static int getCountGD(){
        return countGD;
    }
}
