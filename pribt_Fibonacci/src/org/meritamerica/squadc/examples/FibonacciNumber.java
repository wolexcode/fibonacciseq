package org.meritamerica.squadc.examples;

public class FibonacciNumber {

	
	private static int n;
	static int fibMemo[];
	public static void main(String[] args) {
		System.out.println("This program lists the Fibonacci sequence");

		//for(x= 0;x<=6765; x++) {
		
		/*int x1 = 0;
		int x2 = 1;
		while (x1 <= Max_Term_Value) {
			System.out.println("x3");
			int x3 = x1 + x2;
			x1 = x2;
			x2 = x3;
			*/
		
		
		int num = 21;
        
        // returns the fib series
        int fibSeries[] = fib(num);
        for (int i = 0; i < fibSeries.length; i++) {
            System.out.print(" " + fibSeries[i] + " ");
        }
}
	private static int[] fib(int num) {
		int fibSum[] = new int[num];
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                fibSum[i] = i;
                continue;
            }

            if (i == 1 || i == 2) {
                fibSum[i] = 1;
                continue;
            }

            fibSum[i] = fibSum[i - 1] + fibSum[i - 2];

        }
        return fibSum;
		
	}
	

	
	}
		