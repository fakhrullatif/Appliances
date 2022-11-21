public class Fridge {

    public double price;
	

	Appliances app = new Appliances();
	int month = app.selectMonth();
	Appliances readings[] = new Appliances[month];
	
	public Fridge()
	{
		price = 0.35;
	}

    public void read()
    {
        int FridgeRange[] =  {0, 300};
		
        for (int i=0; i<readings.length; i++) {
            readings[i] = new Appliances();  
            //System.out.println("Electric Amount for day #" + (i+1));
            readings[i].obtain(FridgeRange);
        }
    }
    
    public double calculatePrice()
    {
        double total = 0;
		
        
        for (int i  = 0; i < 30; i++)
        {
            total += readings[i].getFridge();
        }
        
        double amounts = total * price;
      
        return amounts;
    }
    
    public double calculateMax()
    {
        double max = readings[0].getFridge();
        
        for (int i  = 0; i < readings.length; i++)
        {
            if (max < readings[i].getFridge())
            {
                max = readings[i].getFridge();
            }
        }
        return max;
    }
    
    public double calculateMin()
    {
		double min = readings[0].getFridge();
		
        for (int i  = 0; i < readings.length; i++)
        {
            if (min > readings[i].getFridge())
            {
                min = readings[i].getFridge();
            }
        }
        return min;
    }
    
    public double calculateAverage()
    {
        double total = 0;
        
        for (int i  = 0; i < readings.length; i++)
        {
            total += readings[i].getFridge();
        }
        
        double average = total / month;
        return average;
    }
	
    public static void main(String[] args) 
	{
		
        
        Fridge FridgeReading = new Fridge();
		//int month = FridgeReading.selectMonth();
		FridgeReading.read();
		
		//Fridge readings[] = new Fridge[month];
		
        double totalPrice = FridgeReading.calculatePrice();
        System.out.println(totalPrice);
		
        double max = FridgeReading.calculateMax();
        System.out.println(max);
		
		double averageAmount = FridgeReading.calculateAverage();
        System.out.println(averageAmount);
    }
}
