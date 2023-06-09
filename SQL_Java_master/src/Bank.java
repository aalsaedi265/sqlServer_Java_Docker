
import java.util.ArrayList;
import java.util.Random;

public class Bank{

    private String name;
     // I can make it Interger or String  in the <>
    private ArrayList<User> users;

    private ArrayList<Account> accounts;

    public Bank(String name){
        this.name =name;
        this.users = new ArrayList<User>();
        this.accounts = newArrayList< Account >();
    }

    public String getNewUserUUID(){
        String uuid;
        Random rng = new Random();
        int len =6;
        boolean nonUnique =false;

        do{
            uuid ="";
            for(int c =0; c < len; c++){
                //10 exlusive
                uuid += Integer.toString(rng.nextInt(10));
            }
            for(User u: this.users){
                
                    if(uuid.compareTo(u.getUUID()) == 0 ){
                        nonUnique = true;
                        break;
                    }
                }

        }while(nonUnique);

        return uuid;
    }

    public String getNewAccountUUID(){
        
        String uuid;
        Random rng = new Random();
        int len =10;
        boolean nonUnique;

        do{
            uuid ="";
            for(int c =0; c < len; c++){
                //10 exlusive
                uuid += Integer.toString(rng.nextInt(10));
            }
            for(Account a: this.users){
                
                    if(uuid.compareTo(a.getUUID()) == 0 ){
                        nonUnique = true;
                        break;
                    }
                }

        }while(nonUnique);

        return uuid;
    }

    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    
    public User addUser(String firstname, String lastname, String pin){
        User newUser = new User(firstname, lastname, pin, this);
        this.users.add(newUser);

        Account newAccount = new Account("Savings", newUser, this);
        newUser.addAccount(newAccount);
        this.accounts.add(newAccount);
    }

    public User userLogin(String userID, String pin){

        for (User u: this.users){

            if(u.getUUID().compareTo(userID) ==0 && u.validatePin(pin) ){
                return u;
            }
        }
        return null;
    }
    public String getName(){
        return this.name;
    }
}
