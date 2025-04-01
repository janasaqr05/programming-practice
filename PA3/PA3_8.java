import java.util.*;

public class PA3_8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String days = "";

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "31";
                break;
            case 2:
                days = "28";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "30";
                break;
            default:
                days = "Invalid month";
        }
        System.out.println(days);
        
        sc.close();
    }
}
