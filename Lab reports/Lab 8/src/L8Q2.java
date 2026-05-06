import java.util.Scanner;

public class L8Q2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        try {
            if(withdraw > balance) {
                throw new ArithmeticException("Insufficient Balance");
            }
            else {
                balance = balance - withdraw;
                System.out.println("Remaining Balance = " + balance);
            }
        }

        catch(ArithmeticException e) {
            System.out.println("Exception:"+e.getMessage());
        }
        
        finally {
            System.out.println("Program ends.");
        }

    }
}