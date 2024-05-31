package arrays;

public class Elemento06 {
	public static  int getLastElement(int []a) {
	        return a[a.length-1];
	    }
	public static void main(String[] args) {
		  int[] numbers = {1, 2};
		  int arr = getLastElement(numbers);
		  System.out.println(arr); 

		
}
}
