public class ParaBozma {

    public static void main(String[] args) {

        int tutar = 278;
        int orijinalTutar = tutar;



        int[] paralar = {100, 50, 20, 5, 2, 1};


        StringBuilder sonuc = new StringBuilder();


        for (int para : paralar) {



            int adet = tutar / para;


            if (adet > 0) {

                sonuc.append(adet).append("x").append(para).append(", ");



                tutar = tutar % para;
            }
        }


        String finalSonuc = sonuc.toString();
        if (finalSonuc.endsWith(", ")) {
            finalSonuc = finalSonuc.substring(0, finalSonuc.length() - 2);
        }


        System.out.println(orijinalTutar + " TL = " + finalSonuc);




        int tutar2 = 196;
        int orijinalTutar2 = tutar2;
        StringBuilder sonuc2 = new StringBuilder();

        for (int para : paralar) {
            int adet = tutar2 / para;
            if (adet > 0) {
                sonuc2.append(adet).append("x").append(para).append(", ");
                tutar2 = tutar2 % para;
            }
        }

        String finalSonuc2 = sonuc2.substring(0, sonuc2.length() - 2);
        System.out.println(orijinalTutar2 + " TL = " + finalSonuc2);
    }
}
