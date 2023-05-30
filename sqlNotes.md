

step by step video on installation 
https://www.youtube.com/watch?v=8vTCyhDyRjg&list=PL82C6-O4XrHfZoh2ZH7-HCPyh9oHeYPnz&index=1&pp=iAQB



// LINKING TWO TABLES
USE DataBaseName;

CREATE TABLE schemaName.table(
	id INT IDENTITY(1,1) PRIMARY KEY,
	name VARCHAR(225) NOT NULL,
    ForiendKey_coulmn_name  INT not nul,

	FOREIGN_KEY (ForiendKey_coulmn_name)
		REFERANCES schema.table (id)
		ON DELETE CASCADE ON UPDATE CASCADE 
);

example

  CREATE TABLE orders (
  order_id INT PRIMARY KEY,
  customer_id INT,
   order_date DATE,
  FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
    );

   CREATE TABLE customers (
   customer_id INT PRIMARY KEY, email VARCHAR(100) UNIQUE      <-----
  );

  CREATE TABLE employees (
  employee_id INT PRIMARY KEY,
  age INT,
  CONSTRAINT CK_EmployeeAge CHECK (age >= 18)
);

CREATE TABLE products (
  product_id INT PRIMARY KEY,
  product_name VARCHAR(50) NOT NULL
);
 
 desc & asc

 //JOINS
    
    INNER join => returns only mathcing rows based on conidtion

    SELECT *
    FROM table1
    INNER JOIN table2 ON table1.column = table2.column;

    LEFT join => all val from left and only matching val of right; right will have null if no match of left
    
    SELECT *
    FROM table1
    LEFT JOIN table2 ON table1.column = table2.column;

    RIGHT

    SELECT *
    FROM table1
    RIGHT JOIN table2 ON table1.column = table2.column;

    FULL OUTER => retunals full values including null values for both

    SELECT *
    FROM table1
    FULL OUTER JOIN table2 ON table1.column = table2.column;

    CROSS => returns the value of the combination of each row from frist tab with sec tab

    SELECT *
    FROM table1
    CROSS JOIN table2;


AGGREGATE FUNCTIONS
 Use Database/Schema; 
 Select 
    SUM(list_price) as sum, // total of all row in column
    AVG(list_price) as Avg,
    MAX(list_price) as Max,
    Count(list_price) as [RowCount]  // count the number of rows in colmn
From table;

Group By speical

    SELECT column1, AVG(column2) FROM table GROUP BY column1 HAVING AVG(column2) condition(opt);



//create table or database

Crate Table/Database name;   //for database use the gui for table and schema no prefreence

droping a databse, kill all connection and erase
table delete // look up and ask for help before if new to job


//insert

INSERT INTO schema.table(coulmn, colman) VALUES('someing', '3333'); // never use double qoutes
                                                                    // colman optional

//edit table
      //if only table dont add schema just table
UPDATE schema.table SET columan ='new item" WHERE ID = numerOfIterest;




//Allias
SELECT TOP(100) colum, colum FROM schema.table;
    // * => this selects all columns from table


SELECT TOP(100)
     First_name name, // this is an alaias when printed out First_name will name in the colmun
     phone_number number
 FROM schema.table;


//where
    SELECT TOP(100)
        First_name name, // this is an alaias when printed out First_name will name in the colmun
        phone_number number
    FROM schema.table                                                                     // !=
    WHERE column  logical operator  row;  // row is just column value, logical operator is =,<> ,<, etc
                                          // search sql logical operators
                                          // column typically is ID, used to find spefic things.

example
    SELECT 
        first_name Name,
        prfile_pic pic, 
        bio 
    FROM Hinge.women 
    WHERE hieght >= 5.6 AND age >= 20 OR age<= 26;

SELECT * FROM table WHERE NOT condition;
SELECT * FROM table WHERE column IS NULL;

SELECT product_name, price FROM products ORDER BY price DESC;

SELECT product_name, price FROM products ORDER BY price ASC;




 USE AdventureWorks2022
 Go
 SELECT Distinct PersonType from Person.Person   // different kinds of columnans PersonType //




