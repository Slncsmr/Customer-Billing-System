import java.util.Scanner;

class Sale extends Stock 
{
    private double discountRate = 0.0;

    void generateInvoice(Stock[] objStock, int n) 
    {
        Scanner input = new Scanner(System.in);
        int totalPrice = 0;
        System.out.println("Enter the number of different items you want to purchase: ");
        int itemsCount = input.nextInt();
        
        for (int i = 0; i < itemsCount; i++) 
        {
            System.out.print("Enter the name of the product: ");
            input.nextLine(); // Consume newline
            String productName = input.nextLine();
            System.out.print("Enter the quantity to purchase: ");
            int quantityToBuy = input.nextInt();
            
            boolean itemFound = false;
            for (int j = 0; j < n; j++) 
            {
                if (objStock[j].name.equalsIgnoreCase(productName) && objStock[j].QuantityLeft >= quantityToBuy) {
                    totalPrice += objStock[j].Price * quantityToBuy;
                    objStock[j].QuantityLeft -= quantityToBuy;
                    objStock[j].availablity = objStock[j].CheckAvailabiltity(objStock[j].QuantityLeft);
                    itemFound = true;
                    break;
                }
            }

            if (!itemFound) 
            {
                System.out.println("Product not found or insufficient quantity for: " + productName);
            }
        }

        double discountedTotal = applyDiscount(totalPrice);
        System.out.println("Total Price of Purchased Items: $" + totalPrice);
        viewDiscountInfo();
        System.out.println("Discounted Price: $" + discountedTotal);
    }

    double applyDiscount(int totalPrice)
    {
        if (totalPrice > 1000) 
        {
            discountRate = 0.1; 
        } else if (totalPrice > 500)
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

    void PrintInvoice(Stock[] objStock, int n)
    {
        String leftAlignFormat = "| %-5s | %-20s | %-10s |%n";
            
        System.out.println("---------------------------------------------");
        System.out.printf(leftAlignFormat, "S No", "Product Name", "Price");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < n; i++) 
        {
            System.out.printf(leftAlignFormat, i + 1, objStock[i].name, "$" + objStock[i].Price);
        }
        System.out.println("---------------------------------------------");
    }
}