package Estructuras;
/**
 * Implementacion de lista enlazada utilizando generics
 * @author Will
 *
 */
public class LinkedList<E> implements Stack<E>, Queue<E>{
	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E element, Node<E> next) {
			super();
			this.element = element;
			this.next = next;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> next) {
			this.next = next;
		}
		
	}
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public E first() {
		if(isEmpty()) {
			return null;
		}
		return head.getElement();
	}
	public E last() {
		if(isEmpty()) {
			return null;
		}
		return tail.getElement();
	}
	public void addFirst(E e) {
		head =  new Node<>(e, head);
		if(size == 0) {
			tail = head;
		}
		size++;
	}
	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if(isEmpty()) {
			head = newest;
		}
		else {
			tail.setNext(newest);
		}
		tail = newest;
		size++;
	}
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}
		E response = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0) {
			tail = null;
		}
		return response;
	}
	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		addFirst(e);
	}
	@Override
	public E top() {
		// TODO Auto-generated method stub
		return top();
	}
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return removeFirst();
	}
	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		addLast(e);
	}
	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return removeFirst();
	}
}
