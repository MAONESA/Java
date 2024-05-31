package arrays;

public class Elemento10 {
public static void main(String[] args) {
	int []arr = new int [6];
	for(int i =0; i <arr.length; i++) {
		 arr[i] = 5 - i;
	}
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " "); // Debería imprimir: 5 4 3 2 1 0
    }
}
}
