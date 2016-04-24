
public class DSBox {

	private Link<String> head;
	private Link<String> tail;
	private int cnt;
	
	
	DSBox(){ head = tail = new Link<String>(null); cnt = 0;}
	
	public void submit(String document){
		Link<String> pNew = new Link<String>(document, head.getNext());
		if(head == tail) 
			tail = pNew;
		
		head.setNext(pNew);
		cnt++;
	}
	
	public String get_top(){
		
		if(head == tail)
			return null;
		if(head.getNext() == tail)
			tail = head;
		
		String retElem = head.getNext().getElement();
		head.setNext(head.getNext().getNext());
		cnt--;
				
		return retElem;
	}
	
	public String get_bottom(){
		if(head == tail)
			return null;
			
		/*go to preTail*/

		//for(Link<String> p = head; p.getNext() != tail ; p = p.getNext());
		Link<String> p = head;
		while(p.getNext() != tail)
			p = p.getNext();
		
		/*Set the tail to previous node*/
		String retElem = p.getNext().getElement();
		p.setNext(null);
		tail = p;
		
		cnt--;
		return retElem;
	}
	
	public String view_top(){
		if(head.getNext() != null)
			return head.getNext().getElement();
		else
			return null;
	}
	
	public String view_bottom(){
		if(tail == head)
			return null;
		else
			return tail.getElement();
	}
	
	public int size(){
		return cnt;
	}
	
	
}
