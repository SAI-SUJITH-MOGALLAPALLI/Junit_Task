package com.klu.JUnit;

public class RemoveAsTask {

	public String removeAs(String originalString) {
		String ans="";
		for(int i=0;i<originalString.length();i++) {
			if(i==2)
				break; 
			if(originalString.charAt(i)!='A')
				ans=ans+originalString.charAt(i);
		}
		return ans+originalString.substring(2);
	}

}
