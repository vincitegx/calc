
package calc;

import java.util.Scanner;
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner vinci = new Scanner(System.in);
       double x;
       int y;
       double z;
       System.out.print("please enter x: ");
       x = vinci.nextDouble();
       System.out.print("please enter y: ");
       y = vinci.nextInt();
       z = x + y;
       System.out.print(z);
    }
    
}
