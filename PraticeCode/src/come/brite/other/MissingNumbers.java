package come.brite.other;

public class MissingNumbers {
	
	public int[] bubbleSort(int[]array){
		int n = array.length;
		for (int m = n-1; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				int k = i + 1;
				if (array[i] > array[k]) {
					int temp = array[k];
					array[k] = array[i];
					array[i] = temp;
				}
			}
			
		}
		return array;
	}
	
	

	public static void main(String[] args) {
		int[] a = new int[]{1,3,5,11,10,14,13,12,7,6};
		MissingNumbers mn = new MissingNumbers();
		mn.bubbleSort(a);
		int[]c=mn.bubbleSort(a);
		int[] b =new int[c.length];
		for(int i=0;i<=mn.bubbleSort(a).length-1;i++){
			b[i]=c[i];
			System.out.print(" "+b[i]);
		}
		System.out.println("\nMissing Numbers are..");
		for(int i=0;i<b.length-1;i++){
			
			if(b[i]+1 != b[i+1]){
				System.out.println(b[i]+1);
			}
				
				
				
			
		}
	}

}
