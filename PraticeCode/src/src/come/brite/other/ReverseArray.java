package come.brite.other;

public class ReverseArray {
	public  void reverseIntarray(int[] array){
		int startIndex =0;
		int endIndex=array.length-1;
		while(endIndex>startIndex){
			swapValue(array,startIndex,endIndex);
			startIndex++;
			endIndex--;
		}
		
		for(int i:array){
			System.out.print(" "+i);
		}
	}
	private void swapValue(int[]array,int startIndex,int endIndex){
		int temp =array[startIndex];
		    array[startIndex]=array[endIndex];
		    array[endIndex]= temp;
		
	}
		
	
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
		ReverseArray ra = new ReverseArray();
		ra.reverseIntarray(array);
     
	}

}
