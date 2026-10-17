-- Write your query below
SELECT
    cust.customer_id
FROM customers cust
WHERE cust.year = 2020
  AND cust.revenue > 0
ORDER BY
    cust.customer_id ASC,
    cust.year DESC;