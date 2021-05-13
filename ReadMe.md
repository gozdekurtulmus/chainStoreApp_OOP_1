# CENG211 – Programming Fundamentals

# Homework #

In this homework you are expected to implement an “Chain Store App” in Java.
You should fulfill the concepts of:

- Defining Classes
- CSV file I/O
- Arrays
- 2 - dimensional Arrays
- Constructors, Getters & Setters

In the Chain Store Application, purchase and sale information of 4 stores are stored and queried.
You are expected to implement necessary classes to load data from given CSV files and create
desired queries. The given CSV files are listed below:

- In “HW1_Items.csv”, the information is as follows:
    Name,ID,Category
- In “HW1_Transactions_Store1.csv”, the information is as follows:
    ID,PurchasePriceFor1stMonth,SalePriceFor1stMonth,NumberOfSale
    sFor1stMonth,PurchasePriceFor2ndMonth,SalePriceFor2ndMonth,Nu
    mberOfSalesFor2ndMonth,...
       (Note: Transaction files contain purchase price, sale price and sale count of an item
       for 12 month)
- Format of other CSV files for the remaining 3 stores are the same with the first one.
- Note that the IDs in the Items file and Transactions files are referring the same item.

You are expected to implement classes for **Item** , **Transaction** , **ItemTransaction** , **AnnualSale** ,
**StoreQuery** , **ChainStoreApp (the class with main method)** and other helper classes (e.g. **FileIO** )
with the information given below:

**Item:**

- ID
- Name
- Category

**Transaction:**

- Purchase Price
- Sale Price
- Number of Sales


**ItemTransaction:**

- Item
- Transactions
    ✓ **Note:** Two-dimensional array that holds **Transaction** objects for each Store for each
       Month.
    ✓ **Ex:** For 3rd store - September, it is [2][8]

**AnnualSale**

- ItemTransaction→ [0, 32]
    ✓ **Note:** One-dimensional array that holds 33 **ItemTransaction** objects.

Implement necessary methods to respond the following queries in **StoreQuery** class:

```
1 - Most profitable item for the whole year
✓ Note: Most profitable item is the item that have a maximum profit. Profit of an item is
(Sale Price – Purchase Price) x Number of Sales
2 - Most profitable category for the whole year
✓ Note: Not all categories have the same amount of items
3 - Least profitable item for the whole year
4 - Least profitable category for the whole year
5 - Most profitable item for a single sale
6 - Best-selling item for the whole year
7 - Most profitable store for each month
```
