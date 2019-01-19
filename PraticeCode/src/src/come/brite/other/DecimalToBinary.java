package come.brite.other;

public class DecimalToBinary {

	public static void main(String[] args) {
		int[] binary = new int[10];
		int i=0;
		int number= 20;
		while (number >0){
			binary[i++]= number%2;
			number=number/2;
		}
       for(int j= i-1;j>=0;j--){
    	   System.out.print(binary[j]);
       }
	}

}
