public class SaatDonusturme {

    public static void main(String[] args) {


        int toplamSaniye = 3665;


        int saat = toplamSaniye / 3600;


        int dakika = (toplamSaniye % 3600) / 60;


        int saniye = toplamSaniye % 60;




        System.out.printf("%d saniye = %d:%02d:%02d\n", toplamSaniye, saat, dakika, saniye);


        int baskaOrnek = 10000;
        int saat2 = baskaOrnek / 3600;
        int dakika2 = (baskaOrnek % 3600) / 60;
        int saniye2 = baskaOrnek % 60;
        System.out.printf("%d saniye = %d:%02d:%02d\n", baskaOrnek, saat2, dakika2, saniye2);
    }
}
