/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci_do_while;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Fibonaci_Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int hitung, nilaiA, nilaiB, counter, number; 
        counter = 1;
        
        do
        {
            System.out.print  ("Masukkan Nilai A = ");
            nilaiA = input.nextInt();
            System.out.print  ("Masukkan Nilai B = ");
            nilaiB = input.nextInt();
            System.out.print  ("Masukkan Nilai ke- n = ");
            number = input.nextInt();
            System.out.println("");
        }
        while(nilaiA < 0 || nilaiB < 0);
        
        
        while (counter <= number){
            hitung = nilaiA + nilaiB;
            System.out.printf  (" Nilai A = %d %n Nilai B = %d %n Nilai Fibonaci = %d %n",nilaiA , nilaiB, hitung);
            System.out.println("");
            
            
            nilaiA = nilaiB;
            nilaiB = hitung;
            counter++;
        }
    }
}
