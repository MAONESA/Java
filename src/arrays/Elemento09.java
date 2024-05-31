package arrays;

public class Elemento09 {
public static void main(String[] args) {
	int [] arr = new int[6];
	int value = 5;
	int i = 0;
	   while (value >= 0) {
           arr[i] = value;
           value--;
           i++;
       }
	   for (int j = 0; j < arr.length; j++) {
           System.out.print(arr[j] + " "); // Debería imprimir: 5 4 3 2 1 0
       }
}
}
