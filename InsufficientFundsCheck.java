import java.util.Scanner;
import java.lang.Exception;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}

class InsufficientFundsCheck{
    public static void main(String[] args){
        int balance = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount : ");
        int withdraw = sc.nextInt();
        try{
            if(balance<withdraw){
                throw new InsufficientFundsException("Balance is low : "+balance);
            }
            else{
                balance = balance - withdraw;
                System.out.println(withdraw +" Amount is debited ");
                System.out.println("Your new balance is "+balance);
            }
        }
        catch(InsufficientFundsException e){
            System.out.println("Exception Caught : "+e.getMessage());
        }
        catch(Exception e){
            System.out.println("Enter valid Amount");
        }
        sc.close();
    }
}
