package string;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String series = "";
		for(int i=0;i<26;i++) {
			char ch = (char)('A'+i);
			series += ch+" ";
		}
		System.out.print(series);
	}

}
