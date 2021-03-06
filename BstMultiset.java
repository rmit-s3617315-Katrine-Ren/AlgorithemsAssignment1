package DataStructures;
import java.io.PrintStream;
import java.util.*;




public class BstMultiset<T> extends Multiset<T>
{
	protected Node mRoot;
    protected Node mNew;
    protected int mLength;
	
	public BstMultiset() {
		// Implement me!
		mRoot = null;
		mNew = null;
		mLength = 0;
	} // end of BstMultiset()

	public void add(T item) {
		// Implement me!
		Node newNode = new Node((String) item);
		Node currNode = mRoot;
		
		// If root is empty, then list is empty and root references need to be initialised.
		if(mRoot == null){
			mRoot = newNode;
			mRoot.newCounter();
		}
		
		while (currNode != null){
			
			if (currNode.getValue().equals(newNode.getValue())) {
            	currNode.addCounter();
		        mLength++; 
		        return;
		        }
			
			if(currNode.getValue().compareTo(newNode.getValue())<0){
				if(currNode.getRight() == null){
					currNode.setRight(newNode);
					mLength++;
					return;
				}
				currNode=currNode.getRight();
				
			}
			
			else if(currNode.getValue().compareTo(newNode.getValue())>0){
				if(currNode.getLeft() == null){
					currNode.setLeft(newNode);
					mLength++;
					return;
				}
				currNode=currNode.getLeft();
				
			}
			
		}
		
		
		
		
	} // end of add()


	public int search(T item) {
		// Implement me!

		Node newNode = new Node((String) item);
		Node currNode = mRoot;
		
		while (currNode != null){
			
			if (currNode.getValue().equals(newNode.getValue())) {
		        return currNode.getCounter();
		        }
			
			else if(currNode.getValue().compareTo(newNode.getValue())<0){
				currNode=currNode.getRight();
				
			}
			
			else if(currNode.getValue().compareTo(newNode.getValue())>0){
				currNode=currNode.getLeft();
				
			}
			else if (currNode.getLeft()==null && currNode.getRight()==null){
				return 0;
			}
		}
		
		// default return, please override when you implement this method
		return 0;
	} // end of add()


	public void removeOne(T item) {
		// Implement me!
		Node newNode = new Node((String) item);
		Node currNode = mRoot;
		Node prevNode = null;
		
		if(mRoot==null)return; ///tree is empty
		while (currNode != null){
			
			if (currNode.getValue().equals(newNode.getValue())) {
				if(currNode.getCounter()>0){
		        	currNode.minusCounter();
		        	
		        	if(currNode.getCounter()>0)return;
		        	
		        	if(currNode.getCounter()==0)break;
				}
			}
			
			///If item doesn't match, move to correct children
			else if(currNode.getValue().compareTo(newNode.getValue())<0 && currNode.getRight()!=null){
				prevNode = currNode;
				currNode=currNode.getRight();
			}
			
			
			else if(currNode.getValue().compareTo(newNode.getValue())>0 && currNode.getLeft()!=null){
				prevNode = currNode;
				currNode=currNode.getLeft();
				
			}
			
			////If item doesn't match and there is no more children
			else if (Objects.equals(currNode.getLeft(), currNode.getRight())){
				return;
			}
			else if(currNode.getValue().compareTo(newNode.getValue())<0 && currNode.getRight()==null){
				return;
			}
			
			else if(currNode.getValue().compareTo(newNode.getValue())>0 && currNode.getLeft()==null){
				return;
			}
			
		}
		
		
		if(currNode.getCounter()==0){
			
			
			Node tempNode = null;
			Node ptempNode = null;
			
			
			//If node to be deleted has no children
					if(currNode.getLeft()==null && currNode.getRight()==null){
						if(currNode==mRoot){
							mRoot = null;
							return;
						}
						if(prevNode.getLeft()==currNode){
							prevNode.setLeft(null);
							return;
						}else if (prevNode.getRight()==currNode){
							prevNode.setRight(null);
							return;
						}
					}
					
			//If node only has exactly one child
					else if(currNode.getRight()==null){
						if(currNode==mRoot){
							mRoot=currNode.getLeft();
							currNode.setLeft(null);
							return;
							
						}else if(prevNode.getRight()==currNode){
							prevNode.setRight(currNode.getLeft());
							return;
							
						}else if(prevNode.getLeft()==currNode){
							prevNode.setLeft(currNode.getLeft());
							return;
						}
					}
					
					else if(currNode.getLeft()==null){
						if(currNode==mRoot){
							mRoot=currNode.getRight();
							currNode.setRight(null);
							return;
							
						}else if(prevNode.getRight()==currNode){
							prevNode.setRight(currNode.getRight());
							return;
							
						}else if(prevNode.getLeft()==currNode){
							prevNode.setLeft(currNode.getRight());
							return;
						}
					}
					
			//If node has multiple children
					
					
					else if(currNode.getLeft()!=null && currNode.getRight()!=null){
						
						ptempNode = currNode;
						tempNode=currNode.getRight();
						
						
						//// go most left,chk right null
						while(tempNode.getLeft()!=null){
							ptempNode=tempNode;
							tempNode=tempNode.getLeft();
						}
						
						if(currNode==mRoot){
							mRoot=tempNode;
							if(tempNode.getRight()!=null){
								
								ptempNode.setLeft(tempNode.getRight());
								tempNode.setLeft(currNode.getLeft());	
								currNode.setLeft(null);
								tempNode.setRight(currNode.getRight());
								currNode.setRight(null);
								return;
							}
							else{
								tempNode.setLeft(currNode.getLeft());	
								currNode.setLeft(null);
								tempNode.setRight(currNode.getRight());
								currNode.setRight(null);
								return;
							}
						}
												
						if(tempNode.getRight()==null){
							if(prevNode.getLeft()==currNode)
								prevNode.setLeft(tempNode);
							else
								prevNode.setRight(tempNode);
							
							tempNode.setLeft(currNode.getLeft());	
							currNode.setLeft(null);
							tempNode.setRight(currNode.getRight());
							currNode.setRight(null);
							
						}
						else {
							
							ptempNode.setLeft(tempNode.getRight());
							
							if(prevNode.getLeft()==currNode)
								prevNode.setLeft(tempNode);
							else
								prevNode.setRight(tempNode);
							
							tempNode.setLeft(currNode.getLeft());	
							currNode.setLeft(null);
							tempNode.setRight(currNode.getRight());
							currNode.setRight(null);
							
							
						}
						
					}
			
			
		}
		return; //default return
	} // end of removeOne()
	
	
	public void removeAll(T item) {
		// Implement me!
		
		Node newNode = new Node((String) item);
		Node currNode = mRoot;
		
		Node prevNode = null;
		Node tempNode = null;
		Node ptempNode = null;
		
		if(mRoot==null)return; //Tree is empty
		
		//search for node to be removed 
		while (currNode != null){
			
			if (currNode.getValue().equals(newNode.getValue())) { /// current Node is the node to be removed
				if(currNode.getCounter()>0){
					currNode.resetCounter();
					break;
					}
				else return; ///If counter=0, it already removed
		        	
		        }
			
			//if current node < node to be removed, go right 
			
			else if(currNode.getValue().compareTo(newNode.getValue())<0 && currNode.getRight()!=null){ 
				prevNode = currNode;
				currNode=currNode.getRight();
			}
			
			//if current node > node to be removed, go left 
			else if(currNode.getValue().compareTo(newNode.getValue())>0 && currNode.getLeft()!=null){
				prevNode = currNode;
				currNode=currNode.getLeft();
				
			}
		////If item doesn't match and there is no more children
			else if (Objects.equals(currNode.getLeft(), currNode.getRight())){
				return;
			}
			else if(currNode.getValue().compareTo(newNode.getValue())<0 && currNode.getRight()==null){
				return;
			}
					
			else if(currNode.getValue().compareTo(newNode.getValue())>0 && currNode.getLeft()==null){
				return;
			}
			
			
		}
		
		
		//If node to be deleted has no children
				if(Objects.equals(currNode.getLeft(), currNode.getRight())){
					if(currNode==mRoot){
						mRoot = null;
						return;
					}
					if(prevNode.getLeft()==currNode){
						prevNode.setLeft(null);
						return;
					}else if (prevNode.getRight()==currNode){
						prevNode.setRight(null);
						return;
					}
				}
				
				//If node only has exactly one child
				else if(currNode.getRight()==null){
					if(currNode==mRoot){
						mRoot=currNode.getLeft();
						currNode.setLeft(null);
						return;
						
					}else if(prevNode.getRight()==currNode){
						prevNode.setRight(currNode.getLeft());
						return;
						
					}else if(prevNode.getLeft()==currNode){
						prevNode.setLeft(currNode.getLeft());
						return;
					}
				}
				
				else if(currNode.getLeft()==null){
					if(currNode==mRoot){
						mRoot=currNode.getRight();
						currNode.setRight(null);
						return;
						
					}else if(prevNode.getRight()==currNode){
						prevNode.setRight(currNode.getRight());
						return;
						
					}else if(prevNode.getLeft()==currNode){
						prevNode.setLeft(currNode.getRight());
						return;
					}
				}
				
		//If node has multiple children
				
				
				else if(currNode.getLeft()!=null && currNode.getRight()!=null){
					ptempNode = currNode;
					tempNode=currNode.getRight();
					
					//// go most left,chk right null,chk root
					while(tempNode.getLeft()!=null){
						ptempNode=tempNode;
						tempNode=tempNode.getLeft();
					}
					
					if(currNode==mRoot){
						mRoot=tempNode;
						if(tempNode.getRight()!=null){
							
							ptempNode.setLeft(tempNode.getRight());
							tempNode.setLeft(currNode.getLeft());	
							currNode.setLeft(null);
							tempNode.setRight(currNode.getRight());
							currNode.setRight(null);
							return;
						}
						else{
							tempNode.setLeft(currNode.getLeft());	
							currNode.setLeft(null);
							tempNode.setRight(currNode.getRight());
							currNode.setRight(null);
							return;
						}
					}
					
					
					if(tempNode.getRight()==null){
						if(prevNode.getLeft()==currNode)
							prevNode.setLeft(tempNode);
						else
							prevNode.setRight(tempNode);
						
						tempNode.setLeft(currNode.getLeft());	
						currNode.setLeft(null);
						tempNode.setRight(currNode.getRight());
						currNode.setRight(null);
						return;
						
					}
					else {
						
						ptempNode.setLeft(tempNode.getRight());
						
						if(prevNode.getLeft()==currNode)
							prevNode.setLeft(tempNode);
						else
							prevNode.setRight(tempNode);
						
						tempNode.setLeft(currNode.getLeft());	
						currNode.setLeft(null);
						tempNode.setRight(currNode.getRight());
						currNode.setRight(null);
						return;
						
					}
					
				}
				
		return; //default return
	} // end of removeAll()


	public void print(PrintStream out) {
		// Implement me!
		
		Node currNode = mRoot;
		print(currNode,out);
	} // end of print()

	public void print (Node root,PrintStream out){
		if(root!=null){
			print(root.getLeft(),out);
			out.printf("%s | %d\n", root.getValue()
                    , root.getCounter());
			print(root.getRight(),out);
		}
		
		
	}
	
	private class Node{
		int counter;
		protected String mValue;
		protected Node mLeft;
		protected Node mRight;	
		
		public Node(String value){
			mValue = value;
			counter = 1;
			mLeft = null;
			mRight = null;
		}
		
		 public void addCounter() {
	            counter++;
	        }

	        public void minusCounter() {
	            counter--;
	        }
	        
	        public void newCounter(){
	        	counter=1;
	        }
	        
	        public void resetCounter(){
	        	counter=0;
	        }

	        public int getCounter() {
	            return counter;
	        } 

	        public String getValue() {
	            return mValue;
	        }
	        
	        public Node getLeft() {
	            return mLeft;
	        }
	        
	        public Node getRight(){
	        	return mRight;
	        }
	        
	        public void setLeft(Node left) {
	            mLeft = left;
	        }
	        
	        public void setRight(Node right) {
	            mRight = right;
	        }
	        
	        
	}
	
	
} // end of class BstMultiset
