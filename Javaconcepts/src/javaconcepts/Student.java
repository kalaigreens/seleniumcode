package javaconcepts;

public class Student {
	public static void main(String[] args) {
		String s = "kani";
		String s1 = "kani";
		String s2 = "mozhi";

		// immutable
//		System.out.println(System.identityHashCode(s));
//		System.out.println(System.identityHashCode(s1));
//
//		System.out.println(System.identityHashCode(s2));
//
//		s = s + s2;
//		System.out.println(s);
//		System.out.println(System.identityHashCode(s));

		// mutable class
		StringBuffer str = new StringBuffer(s);
		StringBuffer str1 = new StringBuffer(s1);
		StringBuffer str2 = new StringBuffer(s2);
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		StringBuffer append = str.append(s2);
		System.out.println(append);
		System.out.println(System.identityHashCode(str));

	}
}
