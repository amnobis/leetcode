/**
 * @author anobis
 */
public class Problem165 {
    public static void main(String[] args) {
        System.out.println(compareVersion("0", "0.1"));
        System.out.println(compareVersion("1.1", "0.1"));
        System.out.println(compareVersion("13.1", "13.21"));
    }

    public static int compareVersion(String version1, String version2) {
        // 1. Compare numbers before the dots
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");
        int i = 0;

        while (i < ver1.length && i < ver2.length) {
            int val1 = Integer.valueOf(ver1[i]);
            int val2 = Integer.valueOf(ver2[i]);

            if (val1 > val2) {
                return 1;
            } else if (val1 < val2) {
                return -1;
            }
            ++i;
        }

        if (i < ver1.length) {
            while (i < ver1.length) {
                int val1 = Integer.valueOf(ver1[i]);

                if (val1 != 0) {
                    return 1;
                }
                ++i;
            }
        } else if (i < ver2.length) {
            while (i < ver2.length) {
                int val2 = Integer.valueOf(ver2[i]);

                if (val2 != 0) {
                    return -1;
                }
                ++i;
            }
        }
        return 0;
    }
}
