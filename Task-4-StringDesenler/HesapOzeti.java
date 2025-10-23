public class HesapOzeti {
    public static void main(String[] args) {
        String[] urun = {"Avakado", "Ejderha Meyvesi", "Çay"};
        int[] miktar = {2,1,3};
        double[] fiyat = { 6.0 , 30.0,  45.0};
        System.out.println("Urun\tMiktar\tFiyat");
        for(int i = 0; i < urun.length; i++)
             {System.out.println(urun[i] + "\t" + miktar[i] + "\t" + fiyat[i]);
        }
    }
}
