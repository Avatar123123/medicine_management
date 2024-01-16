import java.util.Scanner;

public class MedicineInfo
{
    private String name;
    private int quantity = 30;
    public static int maximumOrder = 5; 

    // constructor to set the name
    public MedicineInfo(String medName)
    {
        this.name = medName;
    }

    //getter method for medicine name
    public String getMedicineName()
    {
        return name;
    }

    //method to get quantity
    public int getMedicineQuantity()
    {
        return quantity;
    }

    //method to check the stock
    public void isEnoughStock(int orderquantity)
    {
        if(this.quantity < orderquantity)
        {
            System.out.println("not enough stock available.");
            refill();
            return;
    
        } else
        {
            System.out.println("medicine withrawn");
            this.quantity -= orderquantity;
            System.out.println("remaining quantity: " + this.quantity);
        }
    }

    //set method to refill
    public void refill()
    {
        Scanner input = Main.getScanner();
        System.out.println("Do you want to refill? Type yes/no");
        String answer = input.next();
       
        if (answer.equalsIgnoreCase("yes"))
        {
             this.quantity = 20;
             System.out.println("refill successfully completed");
        }
    }


    //order requirement
    public int orderRequirement(int order)
    
    {
        if (order > maximumOrder)
        {
            System.out.println("Sorry. Maximum item per order is 5");
            return order;
        } else if ( order < 0)
        {
            System.out.println("Invalid order. Please place an order greater than 0");
            return order;
        } else
        {
            System.out.println("Processing...");
            
            isEnoughStock(order);
            return order;
        }
    }
}








