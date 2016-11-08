import java.util.HashSet;
import java.util.Set;

/**
 * @author anobis
 */
public class Problem299 {
    public static void main(String[] args) {
        System.out.println(getHint("0123456789", "0000000000"));
    }

    public static String getHint(String secret, String guess) {
        Set<Integer> cowies = new HashSet<>();
        int[] vals = new int[10];
        int bulls = 0, cows = 0;


        secret.chars().forEach(val -> {
            vals[val - 48]++;
        });

        for (int i = 0; i < guess.length(); ++i) {
            int ind = guess.charAt(i);

            if (secret.charAt(i) == guess.charAt(i) && vals[ind - 48] > 0) {
                vals[ind - 48]--;
                bulls++;
            } else if (vals[ind - 48] > 0) {
                cowies.add(i);
            }
        }

        for (int moo : cowies) {
            int ind = guess.charAt(moo);

            if (vals[ind - 48] > 0) {
                vals[ind - 48]--;
                cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
