package com.brite.exceptions;

public class ExplicitThrow {
	public int getStringSize(String str) throws Exception{
        if(str == null){
            throw new Exception("String input is null");
        }
        return str.length();
    }

	public static void main(String[] args) {
		 try{
			 ExplicitThrow met = new ExplicitThrow();
	            System.out.println("length of JUNK is "+met.getStringSize("JUNK"));
	            System.out.println("length of WRONG is "+met.getStringSize("WRONG"));
	            System.out.println("length of null string is "+met.getStringSize(null));
	        } catch (Exception ex){
	            System.out.println("Exception message: "+ex.getMessage());
	        }

	}

}
