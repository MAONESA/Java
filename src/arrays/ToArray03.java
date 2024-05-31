package arrays;

public class ToArray03 {
	public static int[] toArray(int a,int b) {
		return new int[] {a,b};
	}
	public static void main(String[] args) {
	
		int[] result = ToArray03.toArray(5, 9);
		for(int i = 0; i < result.length; i++) {
			
			System.out.println(result[i]);
		}
		
	
	
}
}
