import java.util.*;

public class PA3_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int l;
        boolean flag = true;

        if (s1.length() != s2.length()){
            System.out.println("Strings don't match");
        } else {
            l = s1.length();
            for (int i = 0; i < l && flag == true; i++){
                if ((s1.charAt(i) != s2.charAt(i))){
                    flag = false;
                }
            }

            if (flag){
                System.out.println("Strings match");
            } else {
                System.out.println("Strings don't match");
            }
        }
        sc.close();
 
    }
}
