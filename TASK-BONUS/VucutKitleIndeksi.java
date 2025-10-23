public class vucutkitle {

    public static void main(String[] args) {


        


        double kilo = 75.5;
        double boy = 1.80;


        double bmi = kilo / (boy * boy);


        System.out.println("Girilen Kilo: " + kilo + " kg");
        System.out.println("Girilen Boy: " + boy + " m");


        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f\n", bmi);


        double kilo2 = 68;
        double boy2 = 1.65;
        double bmi2 = kilo2 / (boy2 * boy2);
        System.out.printf("\n (Kilo: %.1f, Boy: %.2f) -> BMI: %.2f\n", kilo2, boy2, bmi2);
    }
}
