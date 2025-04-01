import java.util.*;

public class PA3_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        String z = "";
        
        switch(m){
            case 1: z = (d>=19)? "Capricorn": "Aquarius";
                    break;
            case 2: z = (d<=17)? "Aquarius": "Pisces";
                    break;
            case 3: z = (d<=19)? "Pisces": "Aries";
                    break;
            case 4: z = (d<=19)? "Aries": "Taurus";
                    break;
            case 5: z = (d<=20)? "Taurus": "Gemini";
                    break;
            case 6: z = (d<=20)? "Gemini": "Cancer";
                    break;
            case 7: z = (d<=22)? "Cancer": "Leo";
                    break;
            case 8: z = (d<=22)? "Leo": "Virgo";
                    break;
            case 9: z = (d<=22)? "Virgo": "Libra";
                    break;
            case 10: z = (d<=22)? "Libra": "Scorpio";
                    break;
            case 11: z = (d<=21)? "Scorpio": "Sagittarius";
                    break;
            case 12: z = (d<=21)? "Sagittarius": "Capricorn";
                    break;
            default: z = "error";
        }

        System.out.print(z);
        sc.close();
    }
}