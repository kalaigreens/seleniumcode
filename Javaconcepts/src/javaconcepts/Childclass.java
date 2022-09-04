package javaconcepts;

public class Childclass extends Parentclass {

	@Override
	public void name() {
		System.out.println("nila");
	}

	public void children() {
		System.out.println("Childrens are the kids");

	}

	public void kids() {
		System.out.println("Kids are the childrens");
	}

	public static void main(String[] args) {
		Parentclass p = new Childclass();

		p.father();
		p.mother();
		p.name();

	}
}