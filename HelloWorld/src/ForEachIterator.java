import java.util.ArrayList;
 import java.util.List;
 import java.util.Iterator;
 
 public class ForEachIterator {
 
   private static List<Integer> squares = new ArrayList<Integer>();
 
  private static void fillList() {
     for (int i = 0; i < 6; i++) {
       squares.add(i * i);
     }
   }
 
   private static void outputList() {
     Iterator<Integer> iterator = squares.iterator();
     int j=0;
     for (; iterator.hasNext();) {
       System.out.printf("%d squared is %d.\n",
                          j++, iterator.next());
     }
   }
 
   public static void main(String args[]) {
     fillList();
     outputList();
   }
 }
