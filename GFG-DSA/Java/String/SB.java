package string;

public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Builders
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch = (char)('a'+i);
			builder.append(ch);
		}
		System.out.println(builder);
		System.out.println(builder.toString());
		builder.reverse();
		System.out.println(builder);
		

	}

}
