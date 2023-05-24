
USE TheMovie;
CREATE TABLE Directors (
    DirectorID INT PRIMARY KEY not null,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
	Pay Int
);

Alter table Actors
Add  DirectorID int FOREIGN KEY references Directors(DirectorID) Not Null;