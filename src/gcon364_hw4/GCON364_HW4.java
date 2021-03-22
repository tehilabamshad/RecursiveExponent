package gcon364_hw4;

import java.util.Scanner;


public class GCON364_HW4 {

    
    public static void main(String[] args) {
        int base, exp;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a base number: ");
        base = input.nextInt();
        System.out.println("Please enter the exponent: ");
        exp = input.nextInt();
        System.out.println("Answer: " + exponent(base, exp));
        
    }
    
        public static int exponent(int base, int exp){
            if (exp < 1)
                return 1;
            else
                return base * exponent(base, exp-1);
         
        }
}
