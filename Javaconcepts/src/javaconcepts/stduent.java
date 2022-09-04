package javaconcepts;

public class stduent {

	public void name(String ab) {
		System.out.println(ab);
	}

	public void name() {
		System.out.println("kalaiarasan");
	}

	public void name(String ab, int bc) {
		System.out.println(ab + bc);
	}

	public void name(int cd, String jj) {
		System.out.println(cd + jj);
	}

	public static void main(String[] args) {
		stduent s = new stduent();
		s.name();
		s.name("Greens");
		s.name(4, "kalai");
		s.name("Java", 5);

	}
}
