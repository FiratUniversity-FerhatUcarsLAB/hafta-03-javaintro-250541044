public class DonusumTablosu {
    public static void main(String[] args) {
        double factor = 1.609;               // 1 mil = 1.609 km
        int[] miles = {1, 5, 10, 20, 50};    // dönüştürülecek mil değerleri

        System.out.println("Mil -> Kilometre (1 mil = 1.609 km)");
        for (int m : miles) {
            double km = m * factor;
            System.out.printf("%2d mil = %.3f km%n", m, km);
        }
    }
}

