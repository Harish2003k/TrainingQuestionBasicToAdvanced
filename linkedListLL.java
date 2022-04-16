import java.util.*;
public class linkedListLL {
public static void main(String args[]) {
	LinkedList <String> list =new LinkedList <String>();
	list.add("is");
	list.add("a");
	list.addFirst("this");
	list.addLast("List");
	list.add(3,"linked");
	System.out.println(list);
	System.out.println(list.get(0));
	System.out.println(list.size());
	list.remove(3);
	list.removeFirst();
	list.removeLast();
	System.out.println(list);
}
}
