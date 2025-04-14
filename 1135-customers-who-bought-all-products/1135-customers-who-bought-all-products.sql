# Write your MySQL query statement below
select customer_id from customer c
join product p
where c.product_key=p.product_key 
group by customer_id
having count(distinct p.product_key)=(Select count(product_key)from product);