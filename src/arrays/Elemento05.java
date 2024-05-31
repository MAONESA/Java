package arrays;

public class Elemento05 {
    public static int[] setFirstElement(int[] numbers, int a) {
        numbers[0] = a; 
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2};
        int[] arrNumbers = Elemento05.setFirstElement(numbers, 3);
    
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.println(arrNumbers[i]);
        }
    }
}
