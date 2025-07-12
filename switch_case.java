import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String dayName;
        switch(day){
            case 1: dayName = "Monday";
            break;
            case 2: dayName = "Tuesday";
            break;
            case 3: dayName = "Wednessday";
            break;
            case 4: dayName = "Thursday";
            break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
            break;
            case 7: dayName = "Sunday";
            break;
            default : dayName = "Invalid number";
        }
        System.out.println("Day : "+dayName);
    }
}
