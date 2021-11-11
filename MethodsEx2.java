package methodexp;

import java.util.Scanner;

public class MethodsEx2 {
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter an integer number:");
        num = keyboard.nextInt();
        
        System.out.println("The reverse of " + num + 
                " is " + reverse(num) + ".");
        
        digitDisplay(reverse(num));
    }
    
    public static int reverse(int n){
        int temp = n,
                digit,
                rev = 0;
        while(temp>0){
            digit = temp%10;
            temp /= 10;
            rev = 10*rev + digit;
        }
        return rev;
    }    
        public static void digitDisplay(int n){
            int temp=n,
                    digit;
            
            while(temp>0){
                digit = temp%10;
                temp /= 10;
                
                System.out.print(digit);
                if(temp != 0)
                    System.out.print("-");
            }
            System.out.println();
        }
    }
    
    
    
}
