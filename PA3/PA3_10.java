import java.util.*;

public class PA3_10 {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 =sc.nextInt();

        while (n1 != n2){
            if (n1 > n2){
                n1-=n2;
            } else {
                n2-=n1;
            }
        }
        System.out.println("GDC: " + n1);
        sc.close();
        
    }
}
