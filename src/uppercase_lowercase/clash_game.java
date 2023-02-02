package uppercase_lowercase;

import java.util.Scanner;

public class clash_game {

     static void main(String args[]) {
         Scanner in = new Scanner(System.in);
         String t = in.nextLine();
         String out1 = "";
         String out2 = "";

         for (char c: t.toCharArray()) {
            if (Character.isUpperCase(c)) {

                out1 += c;
            }
            else {
                out2 += c;
            }

         }

         System.out.println(out1);
         System.out.println(out2);
    }
}
