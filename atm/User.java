
import java.util.MessageDigest;
import java.util.ArrayList;

public class User{
    private String firstname;
    private String lastname;

    private String uuid;
    private byte pinHash[];

    private ArrayList<Account> accounts;
    
    public User(String firstname, String lastname, String pin, Bank theBank){
        this.firstname=firstname;
        this.lastname= lastname;

        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        }catch(NoSuchAlgorithmException e){
            System.err.println("error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }
        this.uuid = theBank.getNewUserUUID();
        this.accounts = new ArrayList<Account>();
        System.out.println("New user %s, %s with ID %s created. \n", lastname, firstname,this.uuid);
    }
    public void addAccount(Account anAcct){
        this.accounts.add(anAcct);
    }
    public String getUUID(){
        return this.uuid;
    }

    // public static void main(String[] args) {
    //     System.out.println("Bite the Dust");
    // }
}


