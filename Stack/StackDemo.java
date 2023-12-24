package Stack;
import java.util.*;

/*
 * Methods
 * 1)push(E)
 * 2)synchronized pop()
 * 3)synchronized peek()
 * 4)synchronized search(Object)	//return distance of object from top of the stack 
 * 5)size()
 * 6)empty()
 */

public class StackDemo {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push("1");
		s.push("2");
		s.push("3");
		s.push("4");
		s.push("5");
		
		System.out.println("Stack : "+s);		
		s.pop();
		System.out.println("Stack : "+s);		
		System.out.println("Size : "+s.size());		
		System.out.println("empty : "+s.empty());		
		System.out.println("peek : "+s.peek());	
		System.out.println("search : "+s.search("4"));
	}
}
