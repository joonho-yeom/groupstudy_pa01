
public class Link<E> {
	
	/*Field*/
	private E element;
	private Link<E> next;
	
	
	/* Constructor */
	Link( E it, Link<E> nextVal){
		element = it;
		next = nextVal;
	}
	Link(Link<E> nextVal){
		next = nextVal;
	}
	
	
	/*Getter and Setter*/
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public Link<E> getNext() {
		return next;
	}
	public void setNext(Link<E> next) {
		this.next = next;
	}
	
	
}
