
import java.util.Scanner;

class Condtion{
    public static void main(String[] args){
        int age =25;
        ++age;
        --age;
        age--;
        age++;
        // System.out.println(age >= 18 && age <= 40);

        String stand1 = new String("white snake");
//this will make a NEW object in memeory regarles of the stand already existing
        String stand2 = new String("C-Moon");

        String name = "Enrico Pucci";
        String stand ="Made in heaven";
        int standNumber=3;
        // %f used for double or float
        // %c use for char & symboles  %b or boolean

        String line = String.format("Father %s reset the world with stand number %d named %s", name, standNumber,stand);
        // System.out.println(line);

        //inpute like in python, input("Enter your name: ")
        Scanner scanner = new Scanner(System.in);

        //print not println
        System.out.print("what is your name "); //no new line character
        
        String user = scanner.nextLine();
        System.out.println(user);

         age = scanner.nextInt();
         scanner.nextLine() // cleans up the buffer from nextInt()
        System.out.printf("%d is the age",age);

        scanner.close();
    }
}