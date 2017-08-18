import java.io.PrintStream;
import java.util.*;




/**
 * Double linked list that extends from Multiset.
 * 
 * @author Katrine
 */

public class LinkedListMultiset<T> extends Multiset<T>
{
	protected Node mHead;
	protected Node mTail;
    protected int mLength;
    
	public LinkedListMultiset() {
		// Implement me!
		mHead = null;
		mTail = null;
		mLength=0;
	} // end of LinkedListMultiset()
	
	
	
	/** 
	 * Add an element into the beginning of list. 
	 * 
	 * @param item Element to add.
	 */
	public void add(T value) {
		Node newNode = new Node((String)value);
		
		//If a list is empty
		if(mHead == null){
			mHead = newNode;
			mTail = newNode;
		}
		
		//if not, add new node at the beginning of list
		else {
	        Node currNode = mHead;
	      ///if already exist
	        while (currNode != null) {
	        	
	            if (currNode.getValue().equals(newNode.getValue())) {
	                currNode.addCounter();
	                mLength++;
	                return;
	            }
	            currNode = currNode.getNext();
	            
	        }
	        
	        newNode.setNext(mHead);
            mHead.setPrev(newNode);
            mHead = newNode;
	        //tempNode.setNext(newNode);
	    }
	    mLength++;
		return;
		// Implement me!
	} // end of add()
	
	
	
	/**
	 * Searches for an element in the multiset.
	 * 
	 * @param item Element to search for.
	 * @return The number of instance of the element in the multiset.  If element is not in the multiset, return 0.
	 */
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
		
		return 0;
		
	} // end of search()
	
	
	/**
	 * Remove one instance of element from the beginning of list.  If element doesn't exist, method just returns.
	 * 
	 * @param item Element to remove. 
	 */
	public void removeOne(T item) {
		// Implement me!
		
		Node currNode = mHead;
		
		// check if value is head node
        if (currNode.getValue() == item) {
        	currNode.minusCounter();
        	
            // check if length of 1
            if (mLength == 1) {
                mHead = mTail= null;
            }
            else {
                mHead = currNode.getNext();
                mHead.setPrev(null);
                currNode = null;
            }
            
            mLength--;
            
        }
        
        
        // search for value in rest of list
        else {
            currNode = currNode.getNext();

            while (currNode != null) {
                if (currNode.getValue() == item) {
                	currNode.minusCounter();
                    Node prevNode = currNode.getPrev();
                    prevNode.setNext(currNode.getNext());
                    
                    // check if tail
                    if (currNode.getNext() != null) {
                    	currNode.getNext().setPrev(prevNode);
                    }
                    else {
                    	mTail = prevNode;
                    	
                    }
                    currNode = null; //successfully remove, end loop
                    mLength--;
                    
                }
 
                currNode = currNode.getNext();
            }	
        }

	} // end of removeOne()
	
	
	
	/**
	 * Remove all instances of element from the multiset.  If element doesn't exist, method just returns.
	 * 
	 * @param item Element to remove. 
	 */
	public void removeAll(T item) {
		// Implement me!
		Node currNode = mHead;
        Node prevNode = null;

        while (currNode != null) {
            if (currNode.getValue().equals((String) item)) {
                if (currNode == mHead)
                    mHead = currNode.getNext();
                else
                	prevNode=currNode.getPrev();
                    prevNode.setNext(currNode.getNext());
                
                mLength--;
                
            }
            prevNode = currNode;
            currNode = currNode.getNext();
        }
	} // end of removeAll()
	
	
	
	/**
	 * Prints out all the elements and the number of instances of each to 'out' PrintStream.
	 * 
	 * @param out PrintStream to print out to.
	 */
	public void print(PrintStream out) {
		// Implement me!
		Node currNode = mHead;

        while (currNode != null) {
            out.printf("%s | %d\n", currNode.getValue()
                    , currNode.getCounter());
            currNode = currNode.getNext();
        }
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

        /**
        public void setValue(String value) {
            mValue = value;
        }
        
        */

        public void setNext(Node next) {
            mNext = next;
        }
        
        public void setPrev(Node prev) {
            mPrev = prev;
        }
    }
	
} // end of class LinkedListMultiset
