import java.util.HashMap;
import java.util.Map;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem405 {
   public static void main(String[] args) {
      Map<Integer, String> hexMap = new HashMap<>();
      hexMap.put(0, "0");
      hexMap.put(1, "1");
      hexMap.put(2, "2");
      hexMap.put(3, "3");
      hexMap.put(4, "4");
      hexMap.put(5, "5");
      hexMap.put(6, "6");
      hexMap.put(7, "7");
      hexMap.put(8, "8");
      hexMap.put(9, "9");
      hexMap.put(10, "a");
      hexMap.put(11, "b");
      hexMap.put(12, "c");
      hexMap.put(13, "d");
      hexMap.put(14, "e");
      hexMap.put(15, "f");

      toHex(26, hexMap);
   }

   public static String toHex(int num, Map<Integer, String> hexMap) {
      int div = 16;
      String bin = Integer.toBinaryString(num);
      String out = "";

      while (bin.length() % 4 != 0) {
         bin = "0" + bin;
      }

      for (int i = 0; i < bin.length(); i += 4) {
         out += hexMap.get(Integer.parseInt(bin.substring(i, i+4), 2));
      }
      return out;
   }
}
