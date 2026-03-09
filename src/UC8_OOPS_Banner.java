import java.util.HashMap;
import java.util.Map;

public class UC8_OOPS_Banner {

    static Map<Character, String[]> patterns = new HashMap<>();

    static void initializePatterns() {

        patterns.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patterns.put('P', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        });

        patterns.put('S', new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        });
    }

    static void renderBanner(String word) {

        int height = patterns.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                line.append(patterns.get(c)[i]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        renderBanner("OOPS");

    }
}
