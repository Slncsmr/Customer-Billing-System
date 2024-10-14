//To-do : print output total price of the bought items 

import java.util.Scanner;
public class App {
    public static void main(String[] args) 
    {
        int choice;
        int n=0;
        Stock[] objStock = null;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("1.Add Inventory");
            System.err.println("2.View Inventory");
            System.out.println("3.Discount");
            System.out.println("4.Invoice");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.print("Enter number of objects to be stocked:");
                    int newObjects=input.nextInt();
                    input.nextLine();
                    Stock[] newObjStock=new Stock[n+newObjects];
                    for (int i=0;i<n;i++) 
                    {
                        newObjStock[i] = objStock[i];
                    }
                    for(int j=n;j<n+newObjects;j++)
                    {                                                                                                                                                       
                        newObjStock[j] = new Stock();
                        newObjStock[j].InputStock();
                    }
                    objStock = newObjStock;
                    n += newObjects;
                    break;
                }
                case 2:
                {
                    for (int i=0;i<n;i++) 
                    {
                        objStock[i].PrintStock();   
                    }
                    break;
                }
                case 3:
                {
                    break;
                }
                case 4:
                {
                    break;
                }
            }
        }while(choice<5);
        input.close();
    }
}