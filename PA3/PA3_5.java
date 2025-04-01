import java.util.*;

public class PA3_5{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        double score = sc.nextInt();
        double weight;
        switch(test){
            case 1: 
            weight = score * 0.1;
            break;
            case 2:
            case 3:
            case 6:
            weight = score * 0.2;
            break;
            case 4:
            case 5:
            weight = score * 0.15;
            break;
            default:
            weight = 0;
        }
        System.out.println(weight);
        sc.close();
        
    }
}