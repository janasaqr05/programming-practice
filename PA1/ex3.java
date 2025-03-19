import java.util.*;
public class ex3 {
    public static void main(String[] args){

        //solution 1

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int h = s/3600;
        int m = (s-(h*3600))/60;
        s = (s-(h*3600)-(m*60));

        System.out.println(h + " Hours " + m + " minutes " + s + " seconds ");


        // solution 2
        // Scanner sc = new Scanner(System.in);
        // int s, m, h;
        // s = sc.nextInt();
        // h = s/3600;
        // s = s%3600;
        // System.out.println(s);

        // m = s/60;
        // s = s%60;

        // System.out.println(h + " " + m + " " + s);

        sc.close();
    }
}