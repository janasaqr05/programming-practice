import java.util.*;
public class PA3_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

  
        int r = (int)(Math.random()*9999)+1000;
        System.out.println(r);

        System.out.println("Please enter your pincode: ");
        int pin = sc.nextInt();
        int i = 1;
        while(pin != r && i<3){
            System.out.println("Please enter your pincode: ");
            pin = sc.nextInt();
            i++;
        }
        
        if(pin == r){
            System.out.println("You succeeded in " + i + " trials");
        } else {
            System.out.println("You exceeded your trials, account locked");
        }

        sc.close();
    }
}
