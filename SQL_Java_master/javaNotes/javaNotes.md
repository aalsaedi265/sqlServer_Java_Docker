
java -version  

sudo apt install default-jdk     jdk runs spefic java sofware

javac -version                    see if its installed

sudo service mssql-server start
sudo service docker start


https://learn.microsoft.com/en-us/sql/linux/quickstart-install-connect-docker?view=sql-server-ver16&pivots=cs1-bash

 sudo docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=mypassowrd" \
1433:14>    -p 1433:1433 --name sql1 --hostname sql1 \
>    -d \
>    mcr.microsoft.com/mssql/server:2022-latest


did not work
https://github.com/MicrosoftDocs/WSL/issues/815

sudo /opt/mssql/bin/mssql-conf setup

System has not been booted with systemd as init system (PID 1). Can't operate.
Failed to connect to bus: Host is down



Java Coding

    \n  => line break

    //intergers
        bye  -128 to 128
        short -30000 to 30000
        int  millions
        long  superLongnuberL // adds to the end of it

        double 3.445 and so on
        float  super long float number // end with F

        boolean
        char  for any thing that str of characer

        if whole number divids a decmial it will be a decimal and vice versa

    // operators
        ==
        <, >, >=, <=
        !=
        && , ||
        ! => not
        null
        ++ same as +=1
        %2 for evens & %1 for odds same as py

        STRING
        .length
        .isEmpty()
        .toUpperCase()
        .toLowerCase()
                                                                // new String
        .equals(str) => compares two values if exact or not, does not compare objects 

        .equalsIgnoreCase(str)

        .replace(targetItem, newItem) // doe not changed og string, unless reasigned

        .contains(str)

        Integer.parseInt(strNum) //set using the proper asigners
        Double.parseDouble(strNum)


        // ternary

        2>=1 ?: 'yeas' : 'no'

        //if else 
        
        if(){
            lsfjs;
        }else if(){
            slkfslfs;
        }else{
            dslkawas;
        }

        switch(x){
            case y:
                some result;
                break;
            case z;
                if(){
                    dsflsjsdfs;
                    }
                break;
            default:
                if all cases are false this result;
        }


        //array

            Arrays.toString(arr); //tunred to string '[sf,sds]', used with println()

            Array.sort(arr); // sorted on next line
                 .sort(arr,inclusive_STR, exlusive_END)

            Arrays.binarySearch(arr,itemOfInterst) return index of item in arr
                  .binarySearch(arr,inclusive_STR, exlusive_END, itemOfInterst )

            Array.fill(arr, item)
                 .fill(arr, int, fin, item)

            // arrays are always refranced, to make a copy that is inedpenent of og do this
            int numArr[] = Arrays.copyOf(ogArr, ogArr.length) 
                                  .copyOfRange(ogArr, intIdx, finIdx)
            
            //copy end index can change end arry length 
                int[] originalArray = {1, 2, 3};

                int newLength = originalArray.length + 1; // Increase array length
                
                int[] newArray = new int[newLength];

                // Copy elements to the new array
                System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);

                newArray[newLength - 1] = 4;  // Add a new element at the end



            //Loop
              //check con then run it
                // while(true){
                //     //do something;
                //     //beaker;
                // }

                do{ // this runs at least, will run more if the condition is true
                    the something
                }while(condtions)