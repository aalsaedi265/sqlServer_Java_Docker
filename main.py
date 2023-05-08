
import mysql.connector

db = mysql.connector.connect(
    host="localhost",
    user="root",
   
    
)

print('made in heaven')

# sudo docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=C.attano1!" \
#    -p 1433:1433 --name sql1 --hostname sql1 \
#    -d \
#    mcr.microsoft.com/mssql/server:2022-latest