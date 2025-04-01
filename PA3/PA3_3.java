import java.util.*;

public class PA3_3{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a message: ");
        String s = sc.nextLine();

        System.out.println("Please enter a key: ");
        int k = sc.nextInt();

        String r = "";
        char c;

        for(int i = 0; i <s.length(); i++){ 
            c = s.charAt(i);
            if (Character.isUpperCase(c)){
                c = (char) ((c - 'A' + k) % 26 + 'A');  
            } else {
                c = (char) ((c - 'a' + k) % 26 + 'a');
            }
            r += c;
        }
        System.out.println(r);
        sc.close();
    }
}