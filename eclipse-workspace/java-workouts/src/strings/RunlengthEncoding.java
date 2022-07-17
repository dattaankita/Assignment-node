package strings;

public class RunlengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbc";
		System.out.println("result "+rle(s));
	}

	public static String rle(String s) {
		// TODO Auto-generated method stub
		if(s==null && s.isEmpty())
			return "";
		String s1="";
		int c=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++; 
			}else {
				s1=s1+s.charAt(i)+Integer.toString(c);
				c=1;
			}
		}
		s1=s1+s.charAt(s.length()-1)+Integer.toString(c);
		return s1;
	}

}//result a3b2c1
