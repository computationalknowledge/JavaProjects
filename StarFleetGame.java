public class StarFleet{
	
	public static void main(String [] args)
	{
		Worker w = new Worker();
		w.ArrayWorkshop();
	}
}

class Worker{

	public void ArrayWorkshop(){

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
    }
}
