import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
class Arary{
    public static void main(String[] args){
        //5 is length of arr
        char vowls[]= new char[5];// only 5 character strings like "4323", "%^&*","h","9"
        // or another way
        // char vowls[]={'dsaf', 34,'3242'};
        Arrays.fill(vowls,'x');

        int arr[]={2,3,4,5,6,1,7,8};

        // System.out.println(Arrays.toString(vowls) );

        int sum=0;

        for(int idx =1; idx <arr.length; idx++){ sum+=arr[idx]; }
        //printf() has no new line break rember to \n
        
        //iterate through values
        for(int num: arr){
                // System.out.println(num);
            }
        //dynamic add & remove as much as  i want, only numbers because
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // ArrayList

        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(7);
        
        numbers.forEach( el -> {
            System.out.println(el*2);
        });

        numbers.size();
        //     .contains(Integer.valueOf(val)) produce boolean
        //     .isEmpty()

        numbers.get(1); // value at index 1

        numbers.remove(1); // removes the val on idx 1
        //      .clear() remoes all characters
        numbers.remove(Integer.valueOf(9));  //removes based on val instead idx
        
        numbers.set(2, Integer.valueOf(30)); // update val at index 2

        numbers.sort(Comparator.naturalOrder()); // sorts array
        //                     .reverseOrder() order in reverse

        // System.out.println(numbers.toString());
        // System.out.println(); 

    }
}