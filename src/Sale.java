import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sale extends Stock 
{
    private double discountRate = 0.0;
    String productName;
    int totalPrice = 0;
    int quantityToBuy;

    class PurchasedItem 
    {
        String name;
        int quantity;
        int price;

        PurchasedItem(String name, int quantity, int price) 
        {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    void generateInvoice(Stock[] objStock, int n) 
    {
        Scanner input = new Scanner(System.in);
        List<PurchasedItem> purchasedItems = new ArrayList<>();
        
        System.out.print("Enter the number of different items you want to purchase: ");
        int itemsCount = input.nextInt();

        for (int i = 0; i < itemsCount; i++) 
        {
            System.out.print("Enter the name of the product: ");
            input.nextLine();
            productName = input.nextLine();
            System.out.print("Enter the quantity to purchase: ");
            quantityToBuy = input.nextInt();

            boolean itemFound = false;
            for (int j = 0; j < n; j++) 
            {
                if (objStock[j].name.equalsIgnoreCase(productName) && objStock[j].QuantityLeft >= quantityToBuy) {
                    int itemTotalPrice = objStock[j].Price * quantityToBuy;
                    totalPrice += itemTotalPrice;
                    objStock[j].QuantityLeft -= quantityToBuy;
                    objStock[j].availablity = objStock[j].CheckAvailabiltity(objStock[j].QuantityLeft);
                    purchasedItems.add(new PurchasedItem(objStock[j].name, quantityToBuy, itemTotalPrice));
                    itemFound = true;
                    break;
                }
            }

            if (!itemFound)
             {
                System.out.println("Product not found or insufficient quantity for: " + productName);
            }
        }

        System.out.println("-----------------------------------------------------------");
        String leftAlignFormat = "| %-5s | %-20s | %-10s |  %-10s |%n";
        System.out.printf(leftAlignFormat, "S No", "Product Name", "Qty", "Price");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < purchasedItems.size(); i++) 
        {
            PurchasedItem item = purchasedItems.get(i);
            System.out.printf(leftAlignFormat, i + 1, item.name, item.quantity, "INR " + item.price);
        }
        
        System.out.println("-----------------------------------------------------------");

        double discountedTotal = applyDiscount(totalPrice);
        System.out.println("Total Price of Purchased Items: INR " + totalPrice);
        viewDiscountInfo();
        System.out.println("Discounted Price: INR " + discountedTotal);
        totalPrice=0;
    }

    double applyDiscount(int totalPrice)
    {
        if (totalPrice > 10000) 
        {
            discountRate = 0.1; 
        } else if (totalPrice > 5000)
        {
            discountRate = 0.05;
        } else
        {
            discountRate = 0.0;
        }
        return totalPrice - (totalPrice * discountRate);
    }

    void viewDiscountInfo()
    {
        if (discountRate > 0)
        {
            System.out.println("Current Discount Rate: " + (discountRate * 100) + "%");
        } else 
        {
            System.out.println("No discount available for the current purchase amount.");
        }
    }
}