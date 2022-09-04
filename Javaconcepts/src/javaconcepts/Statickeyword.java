package javaconcepts;

public class Statickeyword {

	public void student() {

		Staff();

		System.out.println("Reading");

	}

	public static void Staff() {

		System.out.println("Teaching");
	}

	public static void main(String[] args) {
		Statickeyword st = new Statickeyword();
		st.student();
		Staff();

	}

}
