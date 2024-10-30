#CUSTOMER BILLING SYSTEM USING INHERITANCE

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Video Demo

## Description

The project is divided into three programs and named `App.java`,`Sale.java`,`Stock.java` and it is written in java language and uses basic Object Oriented Programming (OOP's) concept such as Inheritance and other concepts.

**1.App Class**:

  - The App.java program contains the main method from which the code runs.The main method has a switch case which is used for a menu driven for printing in the console. The switch case has three cases being Add Inventory,View Inventory,Billing/Invoice and finally one for exiting the program.
  - **Add Inventory**: The Add inventory case adds inventory for objects which are inputed from the console, the method InputStock is in the Stock.java file and when the add inventory runs for the second time it stacks the data.
  - **View Inventory**: The View inventory shows how of the stock is left and general details of the object such as name, quantity, price, quantity original bought for and availability of the stock from the method PrintStock in `Stock.java`.
  - **Billing\Invoice**: The Billing\Invoice prompts the user to buy the object and print the invoice from the `Sale.java`.

**2. Sale Class**:

The `Sale` class, inheriting from `Stock`, manages sales transactions and generates invoices. Key features include:
   - **Discount Management**: Applies discounts based on the total purchase amount.
   - **Invoice Generation**: Prompts the user to input product name and quantity, checks inventory availability, and calculates total and discounted prices. The invoice displays each item’s name, quantity, and price.

**3. Stock Class**:

The `Stock` class handles the inventory for each product. Key features include:
   - **Stock Input**: Allows users to add products, specifying quantity and price.
   - **Availability Check**: Updates product availability based on quantity left after each purchase.
   - **Display Stock**: Shows product details, including name, original and remaining quantities, price per unit, and availability status.

## How to Run the Program
1. Compile `App.java` using `javac App.java` in console.
2. Run the `App` class to start the menu interface using `java App` in the console
3. Choose options from the menu to interact with the inventory and billing features.

This ia a university project.
