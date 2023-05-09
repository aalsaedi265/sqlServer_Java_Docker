import java.util.Arrays;

class Arary{
    public static void main(String[] args){
        //5 is length of arr
        char vowls[]= new char[5];// only 5 character strings like "4323", "%^&*","h","9"
        // or another way
        // char vowls[]={'dsaf', 34,'3242'};
        Arrays.fill(vowls,'x');

        System.out.println(Arrays.toString(vowls) );
    }
}