# Write your MySQL query statement below
-- Time Complexity:(O(n)) — one pass to group and count.
-- Space Complexity: (O(n)) — internal storage for counts.
SELECT Email FROM Person  GROUP BY email HAVING COUNT(*)>1;

-- To Print Duplicate Values we USE  the "HAVING" clause and the "COUNT(*)"" function.
-- Use GROUP BY email to group rows with the same email.