package visitor;

public class Main {

	public static void main(String[] args) {

		System.out.println("Making new directories...");

		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory tmpdir = new Directory("tmp");
		Directory usrdir = new Directory("usr");

		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);

		bindir.add(new File("vi", 2000));
		bindir.add(new File("latex", 1000));

		rootdir.accept(new ListVisitor());

	}

}
