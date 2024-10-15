import java.util.Scanner;

public class Stock
{
    String name;
    boolean availablity;
    int Quantity;
    int QuantityLeft;
    int Price;    //Each Product

    Stock(){}

    void InputStock()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("====================");
        System.out.print("Enter the name of the product:");
        name=input.nextLine();
        System.out.print("Enter the quantity of the product in stock:");
        Quantity=input.nextInt();
        QuantityLeft=Quantity;
        System.out.print("Enter the price for the above mentioned number of quantites:");
        int tprice=input.nextInt();
        Price=tprice/Quantity;
        availablity=CheckAvailabiltity(QuantityLeft);
    }
    
    boolean CheckAvailabiltity(int QuantityLeft)
    {
        if(QuantityLeft==0)
        {
            return false;
        }
        return true;
        
    }

    void PrintStock()
    {
        System.out.println("====================");
        System.out.println("Name:"+name);
        System.out.println("Original Quantity:"+Quantity);
        System.out.println("Quantity Left:"+QuantityLeft);
        System.out.println("Price:"+Price);
        System.out.println("Availability:"+availablity);
    }
}