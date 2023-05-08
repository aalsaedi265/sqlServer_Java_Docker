


sudo apt update 
sudo apt-get install mysql-server

sudo mysql -u root -p    to access sql if for got passowrd



To check the version : 
mysql - -version 

To fix Access denied for user 'root'@'localhost'

sudo mysql -u root -p 
show databases; 
use mysql 
UPDATE mysql.user SET plugin='mysql_native_password' WHERE User='root';  //plugin lets use it with the super incrimption, no need to pw

flush privileges; 

Then finally Type :
mysql -u root -p 



un: root
pw: // their is no password just press enter



run the server using  this command 

sudo service mysql start
sudo service mysql restart

check if its running using 
sudo service mysql status

using linux this is how check error log

tail -n 50 /var/log/mysql/error.log


sudo nano /etc/mysql/my.cnf  open the sql confi in lunux   

    if commands like this exists commend them these are hunt for somthing working on present task
    # !includedir /etc/mysql/conf.d/
    # !includedir /etc/mysql/mysql.conf.d/







Find the passowrd or user name 

sudo mysqld_safe --skip-grant-tables &
mysql -u root
use mysql;
chang pw to root 
UPDATE mysql.user SET authentication_string = 'root' WHERE User = 'root';
FLUSH PRIVILEGES;
exit;
sudo pkill mysqld_safe


access sql just write in terminal 
sudo mysql


installation

pip3 install mysql-connector-python     it not working use this


