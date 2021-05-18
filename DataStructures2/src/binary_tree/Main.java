package binary_tree;

public class Main {

	public static void main(String[] args) {
		
		Tree t = new Tree();
		
		t.insert(0, 15);
		t.insert(1, 1);
		t.insert(2, 16);
		t.insert(3, 100);
		
		System.out.println(t.find(2));
	}

}
