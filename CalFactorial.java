
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AVIAN
 */
public class CalFactorial {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number: ");
        int n=scanner.nextInt();
        System.out.println("Factorial Value:"+CalculateValues(n));

    }
      public static int CalculateValues(int n) {

        if(n==0){
            return 1;
        }
        else {
            return n * CalculateValues(n - 1);

        }
      }   
}
