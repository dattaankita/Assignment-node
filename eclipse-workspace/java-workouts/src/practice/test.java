package practice;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 5;
//		int b = 3;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
		int c=0;
		
		String s="aabcdefffghhiggee";
		char[] ch= s.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<ch.length;i++){
			char c1=ch[i];
			int x=0;
			for(int j=i+1;j<ch.length;j++) {
				x=0;
				if(c1==ch[j])
					x++;
			}
			if(x>0)
				c++;
		}
		System.out.println(c);
	}

}
