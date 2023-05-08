

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