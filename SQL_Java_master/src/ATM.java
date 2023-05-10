
import java.util.Scanner;

public class ATM{
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        Bank theBank = new Bank("Bank of Drausin");

        User aUser = theBank.addUser("Dio", "Brando", "1801");

        Account newAccount = new Account("Checking", aUser, theBank);
        aUser.addAccount(newAccount);
        theBank.addAccount(newAccount);

        User curUser;
        while(true){

            curUser = ATM.mainMenuPromp(theBank, sc);

            ATM.printUserMenu(curUser, sc);


        }

    }
    public static User mainMenuPromp(Bank theBank, Scanner sc){
        String userId;
        String pin;
        User authUser;

        do{
            System.out.printf("\n\nWelcome to %s\n\n", theBank.getName());
            System.out.println("Enter User ID: " );
        }while()
    }
}