package ca.demo.salestool;

/*
 * Represent the sales data for a given period.
 * 
 */
public class SalesData {
	int data[] = {-1, 0, 4, 42, 84};
	
	public void display() {
		System.out.println("Data: ");
		
		int sum = 0;

//      replaced by foreach loop
		for(int i: data) {
			System.out.println("Next value: " + i);
			sum += i;
		}
		System.out.println("SUm is: " + sum);

	}
}