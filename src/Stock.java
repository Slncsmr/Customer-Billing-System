import java.util.Scanner;
public class Stock
{
    String name;
    boolean availablity;
    int quantity_left;

    Stock(String name,int quantity_left, boolean availablity)
    {
        this.availablity=availablity;
        this.name=name;
        this.quantity_left=quantity_left;   
    }

    void input_stock()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the product:");
        name=input.nextLine();
        System.out.println("Enter the quantity of the product in stock:");
        quantity_left=input.nextInt();
        System.out.println("Is this product available (Y/N):");
        char ask=input.nextLine().charAt(0);
        if(ask=='Y'||ask=='y')
        {
            availablity=true;
        }
        else if (ask=='N'||ask=='n')
        {
            availablity=false;
        }
        input.close();
    }   
}

