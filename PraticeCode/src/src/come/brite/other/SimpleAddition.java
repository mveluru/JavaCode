package come.brite.other;

public class SimpleAddition {
	
	
	private static void AddNumber(int[] a){
		if(a.length==0){
			return;
		}else{
			for (int i=0;i<a.length;i++){
				int result=0;
				for(int j=0;j<=i;j++){
				    result =result+a[j];
				    if(j!=i){
				    System.out.print(a[j]+"+");
				    }else{
				    	System.out.print(a[j]);
				    }
				}
				System.out.println(" = "+result);
			}
		}
	}
public static void main(String[] args) {
	 int [] a ={1,2,3,4,5,6};
	SimpleAddition.AddNumber(a);
}
}
