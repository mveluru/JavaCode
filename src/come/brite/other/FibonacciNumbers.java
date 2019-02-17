package come.brite.other;

public class FibonacciNumbers {
	//integer sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... 

	private static void fibo(){
		int[] a= new int[20];
		int arraySize=a.length;
		
		if (a!=null && arraySize > 2){
			a[0]=0;
			a[1]=1;
			for(int i=2; i<arraySize; i++){
				a[i]=a[i-1]+a[i-2];
			}
				
		}
		for (int i:a){
			System.out.print(" "+i);
		}
	}
	
	
	private static void fibo1() {
		int[] fib = new int[20];
		int fiblen = fib.length;
		if(fib!=null && fiblen>2) {
			fib[0]=0;
			fib[1]=1;
			for (int i=2;i<fiblen;i++) {
				fib[i]=fib[i-1]+fib[i-2];
			}
		}
		
		for(int i:fib) {
			System.out.print(" "+i);
		}
		
	}
	public static void main(String[] args) {
		int[] fb = new int[20];
		fb[0]=0;
		fb[1]=1;
		for (int i = 2; i < 20; i++) {
			fb[i] = fb[i - 1] + fb[i - 2];
		}
		
		for(int i:fb){
			System.out.print(" "+i);;
		}
		System.out.println();
		//fibo();
		fibo1();
	}
	
}
