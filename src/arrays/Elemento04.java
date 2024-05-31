package arrays;

public class Elemento04 {
public static int getFirstElement(int[]arr) {
	return arr[0];
}
public static void main(String[] args) {
	int [] numbers = {1,2};
	
	int arr = Elemento04.getFirstElement(numbers);
		System.out.println(arr);
}
}
