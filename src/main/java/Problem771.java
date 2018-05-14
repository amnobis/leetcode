/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 *
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A"
 */
public class Problem771 {
    public static void main(String[] args) {
//        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("ZdyS", "haa"));
    }

    public static int numJewelsInStones(String J, String S) {
        boolean[] stones = new boolean[26*2];
        int count = 0;

        for (int i = 0; i < J.length(); ++i) {
            stones[getCharacterIndex(J.charAt(i))] = true;
        }

        for (int i = 0; i < S.length(); ++i) {
            count += (stones[getCharacterIndex(S.charAt(i))]) ? 1 : 0;
        }
        return count;
    }

    public static int getCharacterIndex(int a) {
        if (a > 64 && a < 91) {
            return a - (65-26);
        } else if (a > 96 && a < 123) {
            return a - 97;
        }
        return -1;
    }
}
