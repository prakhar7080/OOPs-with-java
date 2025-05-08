import java.lang.Exception;
import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(String message){
        super(message);
    }
}

class NegativeNumberCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        
        try{
            if(num<0){
                throw new NegativeNumberException("Got negative number : "+num);
            }
            System.out.println("You have entered : "+num);
        }
        catch(NegativeNumberException e){
            System.out.println("Execption Caught " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Wrong imput, Enter a valid number");
        }
        sc.close();
    }
}
