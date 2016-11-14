/**
 * @author anobis
 */
public class Problem38 {
    public String countAndSay(int n) {
        String res = "1";

        for(int i = 1; i < n; ++i) {
            res = getNext(res);
        }
        return res;
    }

    private String getNext(String target) {
        StringBuilder sb = new StringBuilder();
        char[] ss = target.toCharArray();
        int index = 0;
        int count = 1;

        while(index < ss.length) {
            while(index < ss.length - 1 && ss[index] == ss[index + 1]) {
                index++;
                count++;
            }
            sb.append(count);
            sb.append(ss[index]);
            count = 1;
            index++;
        }

        return sb.toString();
    }
}
