import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem406 {
   public static void main(String[] args) {
      int[][] vals = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};

      reconstructQueue(vals);
   }

   public static int[][] reconstructQueue(int[][] people) {
      List<Person> bros = new ArrayList<>();
      List<Integer> availablePlaces = new ArrayList<>();

      if (people.length == 0) {
         return new int[][]{};
      }

      for (int[] person : people) {
         bros.add(new Person(person[0] , person[1]));
      }
      Collections.sort(bros);
      System.out.println(bros);

      for (int i = 0; i < people.length; ++i) {
         availablePlaces.add(i);
      }

      for (Person bro : bros) {
         insertMyBuddy(bro, people, availablePlaces);
      }

      return people;
   }

   public static void insertMyBuddy(Person bro, int[][] happyBoys, List<Integer> availablePlaces) {
      int index = availablePlaces.get(bro.getSuperiors());
      availablePlaces.remove(bro.getSuperiors());

      happyBoys[index][0] = bro.getHeight();
      happyBoys[index][1] = bro.getSuperiors();
   }

   public static class Person implements Comparable<Person> {
      private final int height;
      private final int superiors;

      public Person(int height, int superiors) {
         this.height = height;
         this.superiors = superiors;
      }

      public int getHeight() {
         return height;
      }

      public int getSuperiors() {
         return superiors;
      }

      public int compareTo(Person other) {
         if (this.height == other.getHeight()) {
            return Integer.compare(other.getSuperiors(), this.superiors);
         }
         return Integer.compare(this.height, other.getHeight());
      }

      @Override
      public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Person person = (Person) o;
         return height == person.height &&
            superiors == person.superiors;
      }

      @Override
      public int hashCode() {
         return Objects.hash(height, superiors);
      }

      @Override
      public String toString() {
         final StringBuilder sb = new StringBuilder("Person{");
         sb.append("height=").append(height);
         sb.append(", superiors=").append(superiors);
         sb.append('}');
         return sb.toString();
      }
   }
}
