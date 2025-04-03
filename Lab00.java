public class Lab00 {
   public static void main(String[] args) {
      int x = 5;
      String y = "hello";
      double z = 9.8;

      //printing the variables
      System.out.println("x: " + x + " y: " + y + " z: " + z);

      //a list (make an array in java)
      int[] A = {3, 6, -1, 2};
      for (int i : A) {
         System.out.println(i);
      }

      //call a function
      int numFound = Lab00.char_count(y, 'l');
      System.out.println("Found: " + numFound);

      //counting a for loop
      for(int i = 0; i < 11; i++){
         System.out.print(i + "\t");
      }
      System.out.println();
   }

   public static int char_count(String s, char c){
      int count = 0;
      for(int i = 0; i < s.length(); i++){
         if(s.charAt(i) == c){
            count++;
         }
      }
      return count;
   }
}
