public class UC6_OOPS_Banner {

    static String[] letterO() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        };
    }

    static String[] letterP() {
        return new String[]{
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        };
    }

    static String[] letterS() {
        return new String[]{
            "*****",
            "*",
            "*",
            "*****",
            "    *",
            "    *",
            "*****"
        };
    }

    public static void main(String[] args) {

        String[] O = letterO();
        String[] P = letterP();
        String[] S = letterS();

        for(int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}
