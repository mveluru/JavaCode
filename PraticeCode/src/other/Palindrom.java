package come.brite.other;

public class Palindrom {
	
	public boolean palindrom(String pal){
		
		StringBuilder sb = new StringBuilder();
		for (int i=pal.length()-1;i>=0;i--){
			sb =sb.append(pal.charAt(i));
		}
		
		return sb.toString().equalsIgnoreCase(pal);
	}
public static void main(String[] args) {
	Palindrom p = new Palindrom();
	System.out.println("is palindrom "+p.palindrom("LEVEL"));
	System.out.println("is palindrom "+p.palindrom("Murali"));
	
}
}
