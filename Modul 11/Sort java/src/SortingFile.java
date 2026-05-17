import java.util.List;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SortingFile {
    public static void main(String[] args) throws Exception {
      int [] tbA = {168, 170, 165, 168, 172, 170, 169, 165, 171, 166};
      int [] bbA = {50, 60, 56, 55, 60, 70, 66, 56, 72, 56};
      int [] tbB = {170, 167, 165, 166, 168, 175, 172, 171, 168, 169};
      int [] bbB = {66, 60, 59, 58, 58, 71, 68, 68, 65, 60};

      ArrayList <Integer> TinggiA = new ArrayList<>();
      ArrayList <Integer> BeratA = new ArrayList<>();
      ArrayList <Integer> TinggiB = new ArrayList<>();
      ArrayList <Integer> BeratB = new ArrayList<>();

      for(int i = 0; i < tbA.length;i++ ){
        TinggiA.add(tbA[i]);
        BeratA.add(bbA[i]);
      }

      for(int i = 0; i < tbB.length; i++){
        TinggiB.add(tbB[i]);
        BeratB.add(bbB[i]);
      }

      boolean TinggiSama = Collections.disjoint(TinggiA, TinggiB);
      boolean BeratSama = Collections.disjoint(BeratA, BeratB);

      if (!TinggiSama || !BeratSama) {
        System.out.println("data ada yang sama");
      } else {
        System.out.println("Data tidak ada yang sama");
      }
    }
}
