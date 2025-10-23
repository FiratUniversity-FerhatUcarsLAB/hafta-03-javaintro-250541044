public class AsciiArtlsim4 {    

    public static void main(String[] args) {

        String[] E = {
                "EEEEEEE",
                "E      ",
                "E      ",
                "EEEEEEE",
                "E      ",
                "E      ",
                "EEEEEEE"
        };


        String[] R = {
                "RRRRRR ",
                "R     R",
                "R     R",
                "RRRRRR ",
                "R   R  ",
                "R    R ",
                "R     R"
        };


        String[] N = {
                "N     N",
                "NN    N",
                "N N   N",
                "N  N  N",
                "N   N N",
                "N    NN",
                "N     N"
        };


        String separator = "  ";


        int height = E.length;

        System.out.println("Java ile 'EREN' (Kendi Harfleriyle ASCII Art):");
        System.out.println("--------------------------------------------------");


        for (int i = 0; i < height; i++) {



            String line = E[i] + separator + R[i] + separator + E[i] + separator + N[i];


            System.out.println(line);
        }

        System.out.println("--------------------------------------------------");
    }
}
