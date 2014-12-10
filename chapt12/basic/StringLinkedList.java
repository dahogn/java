package cn.sdu.edu.sc.java.chapt12.basic;

public class StringLinkedList {
	private ListNode head;

	public StringLinkedList() {
		head = null;
	}

	/**
	 * Returns the number of nodes in the list.
	 */
	public int length() {
		int count = 0;
		ListNode position = head;
		while (position != null) {
			count++;
			position = position.getLink();
		}
		return count;
	}

	/**
	 * Adds a node at the start of the list. The added node has addData as its
	 * data. The added node will be the first node in the list.
	 */
	public void addANodeToStart(String addData) {
		head = new ListNode(addData, head);
	}

	public void deleteHeadNode() {
		if (head != null) {
			head = head.getLink();
		} else {
			System.out.println("Deleting from an empty list.");
			System.exit(0);
		}
	}

	public boolean onList(String target) {
		return (Find(target) != null);
	}

	/**
	 * Finds the first node containing the target data, and returns a reference
	 * to that node. If target is not in the list, null is returned
	 */
	private ListNode Find(String target) {
		ListNode position = head;
		String dataAtPosition;
		while (position != null) {
			dataAtPosition = position.getData();
			if (dataAtPosition.equals(target))
				return position;
			position = position.getLink();
		}
		// target was not found,
		return null;
	}

	public void showList() {
		ListNode position = head;
		while (position != null) {
			System.out.println(position.getData());
			position = position.getLink();
		}
	}

	// add a node at the tail of the list
	public void AddNodeAtTail(String newData) {
		if (head == null) {
			addANodeToStart(newData);
		} else {
			ListNode position = head;
			ListNode current = null;

			while (position != null) {
				current = position;
				position = position.getLink();
			}
			current.setLink(new ListNode(newData, null));
		}
	}

	// delete a node at the tail of the list
	public void DeleteNodeAtTail() {
		if (head != null) {
			ListNode position = head;
			ListNode current = position;
			if (position.getLink() == null) {
				head = null;
			} else {
				while (position.getLink() != null) {
					current = position;
					position = position.getLink();
				}
				current.setLink(null);
			}
		}
	}

	// delete a node at the tail of the list
	// if no target is found, no data add
	public void FindAndInsertAfter(String target, String newData) {
		ListNode current = Find(target);
		if (current != null)
			current.setLink(new ListNode(newData, current.getLink()));
		else
			System.out.println("No target is found, nothing insert.");
	}
}
