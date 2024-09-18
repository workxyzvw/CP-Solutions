package medium;

/**
 * 445. Add Two Numbers II
 */

public class LCMed445 {
	
	static class ListNode {
		int val;
		ListNode next;
		
		ListNode() {
		}
		
		ListNode(int val) {
			this.val = val;
		}
		
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	public static void main(String[] args) {
		/*ListNode l1 = new ListNode(7);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		l1.next.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);*/
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		printList(addTwoNumbers(l1, l2));
		}
	
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode current = head;
		
		while (current != null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		l1 = reverseList(l1);
		l2 = reverseList(l2);
		
		ListNode head = new ListNode(0);
		ListNode current = head;
		int temp = 0;
		
		while (l1 != null || l2 != null || temp != 0) {
			int sum = temp;
			
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			
			temp = sum / 10;
			current.next = new ListNode(sum % 10);
			current = current.next;
		}
		
		return reverseList(head.next);
	}
	
	public static void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.val);
			if (node.next != null) {
				System.out.print(" ");
			}
			node = node.next;
		}
		System.out.println();
	}
	
	/*public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode currentPos = head;
		int temp = 0;
		
		while(l1 != null || l2 != null) {
			int A = l1 != null ? l1.val : 0;
			int B = l2 != null ? l2.val : 0;
			int calculate = temp + A + B;
			temp = calculate / 10;
			currentPos.next = new ListNode(calculate % 10);
			currentPos = currentPos.next;
			
			if (l1 != null) {
				l1 = l1.next;
			}
			
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		
		if (temp > 0) {
			currentPos.next = new ListNode(temp);
		}
		
		return head.next;
	}*/
}
