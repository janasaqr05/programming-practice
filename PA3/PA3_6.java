import java.util.*;

public class PA3_6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter chapter number:");
        String chapter = sc.nextLine();

        System.out.println("Enter page number:");
        String page = sc.nextLine();

        int dots = 30 - page.length() - chapter.length();
        System.out.print("Chapter " + chapter);

        for(int i = 0; i < dots; i++){
            System.out.print(".");
        }

        System.out.println(page);
        sc.close();
    }
}
