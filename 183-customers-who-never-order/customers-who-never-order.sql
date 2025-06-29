# Write your MySQL query statement below
SELECT name as Customers FROM Customers WHERE id NOT IN (SELECT customerId FROM Orders);

-- Simply selecting from customer table where if is not equal to customerID from orders table