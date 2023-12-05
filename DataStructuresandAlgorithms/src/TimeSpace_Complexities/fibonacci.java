package TimeSpace_Complexities;

public class fibonacci {

	public static void main(String[] args) {
		int n = 300;
		for(int i= 0; i <= n ; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
//	this is the drawback of fibo because the stack is getting overflow 
//	static int fibo(int n ) {
//		if(n < 2) {
//			return n;
//		}
//		return fibo(n - 1) + fibo(n - 2);
//	}
	static int fibo(int n) {
//		the below case i ignored less domination terms but it gives the wrong answer
//		return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
		return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) 
				   - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
	}
}
