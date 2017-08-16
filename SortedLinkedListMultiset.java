import java.io.PrintStream;
import java.util.*;

//import LinkedListMultiset.Node;

//import LinkedListMultiset.Node;

public class SortedLinkedListMultiset<T> extends Multiset<T>
{
	protected Node mHead;
	protected Node mTail;
    protected int mLength;
    
	public SortedLinkedListMultiset() {
		mHead = null;
		mTail = null;
		mLength=0;
		// Implement me!
	} // end of SortedLinkedListMultiset()
	
	
	/** 
	 * Add an element into multiset and sort it.
	 * 
	 * @param item Element to add.
	 */
	public void add(T item) {
		// Implement me!
		Node newNode = new Node((String)item);
		
		//If a list is empty
		if(mHead == null){
		 mHead = newNode;
		 mTail = newNode;
	}
		else {
			Node currNode = mHead;
			
			//if the value passed in equal to or smaller than head, then insert it before head
			if(newNode.getValue().compareTo(currNode.getValue())==0){ 
				newNode.setNext(mHead);
				mHead.setPrev(newNode);
				mHead = newNode;
				currNode.addCounter();
			}
			
			else if(newNode.getValue().compareTo(currNode.getValue())<0){
				newNode.setNext(mHead);
				mHead.setPrev(newNode);
				mHead = newNode;
			}
			
			//if the value is bigger than head
			else{
				if(currNode.getNext()==null){
					mHead.setNext(newNode);
					newNode.setPrev(mHead);
				}
				
				else{
					while(currNode.getNext() != null){
						Node nextNode = currNode.getNext();
						if(newNode.getValue().compareTo(nextNode.getValue())==0){
							currNode.setNext(newNode);
							newNode.setPrev(currNode);
							newNode.setNext(nextNode);
							nextNode.setPrev(newNode);
							nextNode.addCounter();
				}
						else if(newNode.getValue().compareTo(nextNode.getValue())<0){
							currNode.setNext(newNode);
							newNode.setPrev(currNode);
							newNode.setNext(nextNode);
							nextNode.setPrev(newNode);	
						}
						
						else /**if(newNode.getValue().compareTo(nextNode.getValue())>0)*/{
							
							nextNode.setNext(newNode);
							newNode.setPrev(nextNode);
							
							if(nextNode.getNext() !=null){
							newNode.setNext(nextNode.getNext());
							nextNode.getNext().setPrev(newNode);
							}
							
							else
								mTail = newNode;
						}
							
					}
				}
			}
				
		}
			  mLength++;		
	} // end of add()
	
	
	public int search(T item) {
		// Implement me!		
		Node currNode = mHead;
		int counter=0;

		while(currNode != null){
			if(currNode.getValue().equals(item)){
				return currNode.getCounter();
			}
			currNode = currNode.getNext();
		}
		
		// default return, please override when you implement this method
		return 0;
	} // end of add()
	
	
	public void removeOne(T item) {
		// Implement me!
	} // end of removeOne()
	
	
	public void removeAll(T item) {
		// Implement me!
	} // end of removeAll()
	
	
	public void print(PrintStream out) {
		// Implement me!
	} // end of print()
	
	//Node type, inner private class.
	
	private class Node {
			
	        protected String mValue;
	        protected Node mNext;
	        protected Node mPrev;

	        int counter;

	        public Node(String value) {
	            mValue = value;
	            mNext = null;
	            mPrev = null;
	            counter = 1;
	        }

	        
	        public void addCounter() {
	            counter++;
	        }

	        public void minusCounter() {
	            counter--;
	        }

	        public int getCounter() {
	            return counter;
	        } 

	        public String getValue() {
	            return mValue;
	        }

	        public Node getNext() {
	            return mNext;
	        }
	        
	        public Node getPrev(){
	        	return mPrev;
	        }
	        
	         public void setNext(Node next) {
	            mNext = next;
	        }
	        
	        public void setPrev(Node prev) {
	            mPrev = prev;
	        }

	        /**
	        public void setValue(String value) {
	            mValue = value;
	        }
	        
	        */

	       
	    }

} // end of class SortedLinkedListMultiset