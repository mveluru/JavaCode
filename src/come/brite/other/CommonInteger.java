package come.brite.other;

public class CommonInteger {

	public static void main(String[] args) {
		int[] input1 = {2,7,17,19,20,45,56,159,239};
        int[] intput2 = {7,12,15,19,22,34,55,150,159};
        
        for (int i:input1){
        	for(int j:intput2){
        		if(i==j){
        			System.out.print(" "+i);
        		}
        	}
        }

	}

}
