package come.brite.other;

public class ReplaceWithNextElementinArray {

	
	private static void replacewithNextHigherElement(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int max = num[i];
			 
			for (int j = i + 1; j < num.length; j++) {
				   max = num[j];
				if (max < num[j]) {
					max = num[j];
				}
			}
			num[i]=max;
		}
      for(int i:num){
    	  System.out.print(" "+i);
      }
	}

	public static void main(String[] args) {
     int[] k = new int[]{3,1, 10};
     replacewithNextHigherElement(k);
	}

}
