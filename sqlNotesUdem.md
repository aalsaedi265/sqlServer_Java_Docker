
USE TheMovie;
CREATE TABLE Directors (
    DirectorID INT PRIMARY KEY not null,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
	Pay Int
);

Alter table Actors
Add  DirectorID int FOREIGN KEY references Directors(DirectorID) Not Null;


use AdventureWorks2022
Go
select CurrencyCode
from Sales.CountryRegionCurrency
Union //==>>>> bottom adds to resutl of top, no duplicates, Union all allows duplicats
select CurrencyCode from Sales.Currency


use AdventureWorks2022
Go
select JobTitle
from HumanResources.Employee
where Gender = 'M'
Intersect // jobs that have both m and f that are "distinct"
             except, would look for both jobs, but not mention if filled by F
select JobTitle
from HumanResources.Employee
where Gender = 'F'



select GETDATE()

        IDDATE(date) return 1 if true 0 if not


    Login in
pick data base to secure it

Create Login NewLoginNameHere With Password = 'passwordChoice'

Alter Login NewLoginNameHere With Password ='newPW'

Drop Login NewLoginNameHere 

    create user
Create User NewUser For Login Admin
