import java.util.*;
public class PA3_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will be added:");
        int iterations = sc.nextInt();
        int n;
        int sum = 0;

        for (int i = 0; i < iterations; i++){
            System.out.println("Enter integer:");
            n = sc.nextInt();
            sum+=n;
        }
        System.out.println(sum);
        sc.close();
    }
}
