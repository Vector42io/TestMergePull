struct Customer {
	id int
	name string
	nr_orders int
	country string
}

db := pg.connect(db_name, db_user)

nr_customers := db.select count from Customer
println('number of all customers: $nr_customers')

// V syntax can be used to build queries
uk_customers = db.select from Customer where
	country == 'uk' && nr_orders > 0
for customer in uk_customers {
	println('$customer.id - $customer.name')
}

// by adding `limit 1` we tell V that there will be
// only one object
customer = db.select from Customer where id == 1 limit 1
println(customer.name)

// insert a new customer
new_customer := Customer{name: 'Bob', nr_orders: 10}
db.insert(new_customer)
