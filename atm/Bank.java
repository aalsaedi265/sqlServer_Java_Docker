
import java.util.ArrayList;
import java.util.Random;

public class Bank{

    private String name;
     // I can make it Interger or String  in the <>
    private ArrayList<User> users;

    private ArrayList<Account> accounts;

    public String getNewUserUUID(){
        String uuid;
        Random rng = new Random();
        int len =6;
        boolean nonUnique =false;

        do{
            uuid =""
            for(int c =0; c < len; c++){
                //10 exlusive
                uuid+= (Interger)rng.nextInt(10).toString();
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
            uuid =""
            for(int c =0; c < len; c++){
                //10 exlusive
                uuid+= (Interger)rng.nextInt(10).toString();
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
        this.accounts.add(anAcct)
    }

}
