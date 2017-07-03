import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap {

	public static void main(String[] args) {
		
		Map<String,String> map=new LinkedHashMap<String,String>();
		System.out.println("Enter the input :");
		Scanner sc=new Scanner(System.in);
		String str[]=sc.next().split(",");
		String str1="";
		for(int i=0;i<str.length;i++) {
			//System.out.println(str[i]);
			for(int j=0;j<3;j++) {
				str1+=str[i].charAt(j);
			}
			str1=str1.toUpperCase();
			map.put(str1,str[i]);
			str1="";
		}
		System.out.println(map);
	}

}
