package string;

import java.util.Arrays;

public class Methods {
	public static void main(String[] args) {
		String name = "Dinesh kumar k";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println("  Hanako  ".strip());
		System.out.println(Arrays.toString(name.split(" ")));
	}
}
