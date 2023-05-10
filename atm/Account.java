
import java.util.ArrayList;

public class Account{

    private String name;

    private User holder;
    
    private ArrayList<Transactions> transactions;
 
//instructor
    public Account(String name, User holder, Bank theBank){
        this.name = name;
        this.holder = holder;

        this.uuid = theBank.getNewAccountUUID();

        this.transactions = new ArrayList<Transactions>();

        holder.addAccount(this);
        theBank.addAccount(this);

    }
}