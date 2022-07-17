package strings;

public class removeduplicates {
	String removedups(char[] str) {
		int k=0;
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<i;j++) {
				if(str[i]==str[j])
					break;
			}
			if(i == j) {
				str[k++]=str[j];
			}
		}
		
		return str.toString();
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
