import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int total = in.nextInt();
    int[] vals = new int[total];
    
    for (int i = 0; i < total; i++) {
      vals[i] = in.nextInt();
    }

    HashMap<Integer, Integer> valDictionary = new HashMap();
    for (int i = 0; i < total; i++) {
      if (valDictionary.containsKey(vals[i])) {
        valDictionary.put(vals[i], valDictionary.get(vals[i]) + 1);
      } else {
        valDictionary.put(vals[i], 1);
      }
    }

    int maxCount = 0;
    for (int count : valDictionary.values()) {
        maxCount = Math.max(maxCount, count);
    }

    for (int i = 0; i < total; i++) {
      if (valDictionary.get(vals[i]) == maxCount) {
        System.out.println(vals[i]);
        break;
      }
    }
  }
}
