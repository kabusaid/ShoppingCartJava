# Simple Shopping Cart in Java

Simple Shopping Cart that can contain different product types and calculate the total price.

In this Project :
- OOP (Object Oriented Programing)
- SOLID Principles
- Code Style and Comments
- GetHub Submission
- Manual Test by Example Code

# Item Interface 
Item Interface for different products like: countable , bookable, downloadable, or products depend on weight.

# Product Abstract Class :
Super Class Product have the same fields for all subclass. The common fields are : code, title, image, price.

- Product Countable Class : Subclass of Product. Inherits common fields, and have new field quantity and iplements Item interface methods: price, details 

- Product Bookable Class : Subclass of Product. Inherits common fields, and have 3 new fields: date, time, hours and iplements Item interface methods: price, details 

# Shopping Cart Class
Shopping Cart Class tha can contain different products: Countable or Bookable.
The Class methods :add or remove product, show content of the cart, and calculate the total price for all shopping cart content.

# Manual Test Case
- Create Countable Product with Price 10$ and Quantity 2
- Create Bookable Product with Price 30$/Hour and Specific date, time and for 3 hours
- Add the different products to Shopping Cart
- Print The Content of the Cart and the Total Price.
