// Checking recursion to find the kth element in a linkedlist
public class Test1 {

	public static void main(String...  args) {
		LinkedListNode n3 = new Test1.LinkedListNode(null, 3);
		LinkedListNode n2 = new Test1.LinkedListNode(n3, 2);
		LinkedListNode n1 = new Test1.LinkedListNode(n2, 1);
		System.out.println(kthToLast(n1, 3).data);
	}
	
	static class Index{
		public int value = 0;
	}
	
	static class LinkedListNode{
		public LinkedListNode next;
		public Object data;
		public LinkedListNode(LinkedListNode next, Integer i) {
			this.data = i;
			this.next = next;
					
		}
	}
	
	public static LinkedListNode kthToLast(LinkedListNode head, int k) {
		Index idx = new Index();
		return kthToLast(head, k, idx);
	}

	private static LinkedListNode kthToLast(LinkedListNode head, int k, Index idx) {
		if(head == null) {
			return null;
		}
		LinkedListNode node = kthToLast(head.next, k, idx);
		idx.value = idx.value+1;
		if(idx.value == k) {
			return head;
		}
		return node;
	}
	
}
