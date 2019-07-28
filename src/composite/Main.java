package composite;

public class Main {

	public static void main(String[] args) {

		System.out.println("making root directory...");
		Directory rootdir = new Directory("root");
		Directory bindir  = new Directory("bin");
		Directory tmpdir  = new Directory("tmp");
		Directory usedir  = new Directory("use");

		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usedir);
		bindir.add(new File("vi", 10000));
		bindir.add(new File("latex", 20000));
		rootdir.printList();

//		System.out.println("");
//		System.out.println("Making user entrie...");
//
//		Directory yuki = new Directory("yuki");
//		Directory hanako = new Directory("hanako");
//		Directory tomura = new Directory("tomura");
//
//		usedir.add(yuki);
//		usedir.add(hanako);
//		usedir.add(tomura);
//
//		yuki.add(new File("diary.html", 100));
//		yuki.add(new File("Composite.java", 200));

	}

}
