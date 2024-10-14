/*
Step 1 : Get user input such as name and others
Step 2 : Get desired objects and its price (could intergrate with database to get price)
Step 3 : print output total price of the bought items 
*/
import java.util.Scanner;
public class App {
    public static void main(String[] args) 
    {
        int choice;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1.Stock Management");
            System.out.println("2.Discount");
            System.out.println("3.Invoice");
            System.out.println("4.Exit");
            System.out.print("Enter your choice:");
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter number of objects to be stocked:");
                    int n=input.nextInt();
                    input.nextLine();
                    Stock objStock[]=new Stock[n];
                    for(int i=0;i<n;i++)
                    {                                                                                                                                                       
                        objStock[i] = new Stock();
                        objStock[i].InputStock();
                    }
                    break;
                }
                case 2:
                {
                    break;
                }
                case 3:
                {
                    break;
                }
            }
        }while(choice<4);
        input.close();
    }
}
