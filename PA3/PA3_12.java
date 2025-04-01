import java.util.*;
public class PA3_12 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "";
        boolean flag = true;

        for(int i = 0; i < s1.length(); i++){
            s2 = s1.charAt(i) + s2;
        }
        System.out.println(s2);

        for(int j = 0; j < s1.length() && flag == true; j ++){
            if(s1.charAt(j) != s2.charAt(j)){
                flag = false;
            }
        }

        if (flag){
            System.out.println("input is palindrome");
        } else {
            System.out.println("input is not palindrome");
        }
        sc.close();
    }
}
