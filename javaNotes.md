

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
