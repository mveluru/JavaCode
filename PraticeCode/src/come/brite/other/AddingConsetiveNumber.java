package come.brite.other;

public class AddingConsetiveNumber {
	//n/2(firstNumber+LastNumber)
	
	private void AddConsecutiveNumber(int totalNumbers,int firstNumber, int lastNumber){
	   Integer Sum = (totalNumbers/2)*(firstNumber + lastNumber);
	  // Integer Sum2 = (totalNumbers)*(lastNumber -firstNumber )/2;
	   System.out.println("Total Numbers "+ Sum);
	   //System.out.println("Total Numbers "+ Sum2);
	}
public static void main(String[] args) {
	AddingConsetiveNumber addsum = new AddingConsetiveNumber();
	addsum.AddConsecutiveNumber(200, 1, 200);
}
}
