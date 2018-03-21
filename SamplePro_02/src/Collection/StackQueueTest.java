package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Stack s = new Stack();
		s.push("dog");
		s.push("cat");
		s.push("rabbit");
		int size = s.size();
		//데이터가 없을때까지 출력
		for(int i = 0; i< size; i++){
			System.out.println(s.pop());
		}//rabit cat dog
		*/
		
		Queue q = new LinkedList();
		
		q.offer("a");
		q.offer("b");
		q.offer("c");
		int size = q.size();
		//데이터가 없을때까지 출력
		for(int i = 0; i < size; i++){
			System.out.println(q.poll());
		}//a b c
		
		
	}
}
