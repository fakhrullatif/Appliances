import java.util.Random;
import java.util.Scanner;

public class Appliances {
    
    //electrical amount used
    private double Fridge;
    //private double AirCond;
    //private double Washing;

    public double getFridge() {
        return Fridge;
    }

    public void setFridge(double Fridge) {
        this.Fridge = Fridge;
    }
    
    
    public void obtain(int FridgeRange[])
    {
        Random rand = new Random();
        Fridge = rand.nextDouble() * (FridgeRange[1] - FridgeRange[0]) + FridgeRange[0]; 
		
    }
	
	public int selectMonth()
	{
		int monthData, month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter month in digit : ");
		month = sc.nextInt();
		
		if (month > 1 && month < 8)
		{
			if (month % 2 == 1) monthData = 31;
			else if (month % 2 == 0) monthData = 30;
			else monthData = 28;
		}
		else 
		{
			if (month % 2 == 0) monthData = 31;
			else monthData = 30;
		}
		
		return monthData;
	}
    
    public static void main(String[] args)
    {   
	
		
	/*
		int FridgeRange[] = {0, 300};
        //if statement 30/31/29/28
		appliance.obtain(FridgeRange);
		
		double amount = appliance.getFridge();
		System.out.println(amount);
    */
    }
    
}
