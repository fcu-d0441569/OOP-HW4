package fcu.iecs.oop;
import java.util.Scanner;

public class PasswordEncorder {
	public void transform(String str1){
		String fuck,str2,str3,str4,str5,str6,str7,str8,str9,str10;

		fuck = str1.replace('a', '4');
		str2 = fuck.replace('A', '4');
		str3 = str2.replace('E', '3');
		str4 = str3.replace('e', '3');	
		str5 = str4.replace('I', '1');
		str6 = str5.replace('i', '1');
		str7 = str6.replace('O', '0');
		str8 = str7.replace('o', '0');
		str9 = str8.replace('T', '7');
		str10 = str9.replace('t', '7');
		System.out.print(str10);
	}
	
	
	
	
	
	
}
