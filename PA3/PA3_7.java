import java.util.*;
public class PA3_7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        if (n < 0){
            System.out.println("No positive integers entered");
        } else {

            int max = n;
            int min= n;
            double sum = 0;
            int count = 1;
            
            while (n >= 0){

                System.out.println(n);
                n = sc.nextInt();
                if (n > max){
                    max = n;
                } else {
                    min = n;
                }
                count++;
                sum += n;
            }
            System.out.println("max: " + max);
            System.out.println("min: " + min);
            System.out.println("avg: " + (sum/count));
        }
        
        sc.close();
    }
}
