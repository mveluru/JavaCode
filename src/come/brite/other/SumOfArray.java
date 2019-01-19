package come.brite.other;
/*
 * Google Interview Question
 */

public class SumOfArray {
	
	
	private boolean sum8(int[]a){
		int startIndex =0;
		int endIndex= a.length -1;
		boolean sum8 = false;
		while(startIndex < endIndex){
			if(a[startIndex]+a[endIndex]==8){
				
				System.out.println(a[startIndex] +" "+a[endIndex]);
				return sum8=true;
			}else if(a[startIndex]+a[endIndex]<8) {
				startIndex++;
			}else{
				endIndex--;
			}
		}
		return sum8;
	}
public static void main(String[] args) {
	int [] array0 = new int[]{1,2,3,9};
	int [] array1 = new int[]{1,2,4,4};
	SumOfArray sa = new SumOfArray();
	sa.sum8(array0);
	sa.sum8(array1);
}
}
