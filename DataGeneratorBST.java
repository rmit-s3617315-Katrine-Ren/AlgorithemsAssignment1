package DataGenerator;

import java.util.ArrayList;
import java.util.Random;

import DataStructures.BstMultiset;

public class DataGeneratorBST {

	public static String FastFood(){
	    ArrayList<String>fastFood = new ArrayList<String>();
	    
	    fastFood.add("Hamburger");
	    fastFood.add("Chips");
	    fastFood.add("Salad");
	    fastFood.add("Nuggets");
	    fastFood.add("Chicken Wings");
	    fastFood.add("Hotdog");
	    fastFood.add("Salmon Roll");
	    fastFood.add("Onion Rings");
	    
	    String orderFood = fastFood.get(new Random().nextInt(fastFood.size()));
				return orderFood;
	     
	    }
	public static void main(String[] args) {
		System.out.println("BSTree testing");
		// TODO Auto-generated method stub

		int size1 = 1;
		int size2 = 1000;
		int size3 = 10000;
		int size4 = 30000;
		int size5 = 50000;
		int size6 = 100000;
		BstMultiset<String> orderList1 = new BstMultiset<String>();
		BstMultiset<String> orderList2 = new BstMultiset<String>();
		BstMultiset<String> orderList3 = new BstMultiset<String>();
		BstMultiset<String> orderList4 = new BstMultiset<String>();
		BstMultiset<String> orderList5 = new BstMultiset<String>();
		BstMultiset<String> orderList6 = new BstMultiset<String>();
		
  //generate a list of new order randomly,add it into LinkedList
		System.out.println(" ");
		System.out.println("for size = " + size1);
		System.out.println("Time Unit: milliSecond");
		
		long addBegin = System.nanoTime();
		for (int i = 1; i <= size1; i++) { 
             orderList1.add(FastFood());
		}
             long addEnd = System.nanoTime();
             double timeElapsed1= (addEnd - addBegin) / Math.pow(10, 6);
     		 System.out.println("Add data (secs): " + timeElapsed1);
             
             long removeOneStart = System.nanoTime();
             orderList1.removeOne("Hamburger");
             long removeOneEnd = System.nanoTime();
             double timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             long removeAllStart = System.nanoTime();
             orderList1.removeAll("Onion Ring");
             long removeAllEnd = System.nanoTime();
             double timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             long searchStart = System.nanoTime();
             orderList1.search("Chips");
             long searchEnd = System.nanoTime();
             double timeElapsed4= (searchEnd - searchStart) / Math.pow(10, 6);
             System.out.println("search data (secs): " + timeElapsed4);
             //orderList.print(System.out);
            
		
             System.out.println(" ");
		System.out.println("for size = " + size2);
		System.out.println("Time Unit: milliSecond");
		

		     addBegin = System.nanoTime();
		for (int i = 1; i <= size2; i++) {
             orderList2.add(FastFood());        
		}
             addEnd = System.nanoTime();
             timeElapsed1= (addEnd- addBegin) / Math.pow(10, 6);
     		 System.out.println("Add data (secs): " + timeElapsed1);
             
             removeOneStart = System.nanoTime();
             orderList2.removeOne("Hamburger");
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList2.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             orderList2.search("Chips");
             searchEnd = System.nanoTime();
             timeElapsed4= (searchEnd - searchStart) / Math.pow(10, 6);
             System.out.println("search all data (secs): " + timeElapsed4);
             //orderList.print(System.out);
            
		
             System.out.println(" ");
		System.out.println("for size = " + size3);
		System.out.println("Time Unit: milliSecond");
		

		addBegin = System.nanoTime();
		for (int i = 1; i <= size3; i++) {
  
			 
             orderList3.add(FastFood());
		}
             addEnd = System.nanoTime();
             timeElapsed1= (addEnd - addBegin) / Math.pow(10, 6);
     		 System.out.println("Add data (secs): " + timeElapsed1);
             
             removeOneStart = System.nanoTime();
             orderList3.removeOne("Hamburger");
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList3.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             orderList3.search("Chips");
             searchEnd = System.nanoTime();
             timeElapsed4= (searchEnd - searchStart) / Math.pow(10, 6);
             System.out.println("search data (secs): " + timeElapsed4);
             //orderList.print(System.out);
            
		
             System.out.println(" ");
		System.out.println("for size = " + size4);
		System.out.println("Time Unit: milliSecond");
		

		addBegin = System.nanoTime();
		for (int i = 1; i <= size4; i++) {
             orderList4.add(FastFood());
		}
             addEnd = System.nanoTime();
             timeElapsed1= (addEnd - addBegin) / Math.pow(10, 6);
     		 System.out.println("Add data (secs): " + timeElapsed1);
             
             removeOneStart = System.nanoTime();
             orderList4.removeOne("Hamburger");
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList4.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             orderList4.search("Chips");
             searchEnd = System.nanoTime();
             timeElapsed4= (searchEnd - searchStart) / Math.pow(10, 6);
             System.out.println("search data (secs): " + timeElapsed4);
             //orderList.print(System.out);
            
		
             System.out.println(" ");
		System.out.println("for size = " + size5);
		System.out.println("Time Unit: milliSecond");
		

		addBegin = System.nanoTime();
		for (int i = 1; i <= size5; i++) {
            orderList5.add(FastFood());
		}
             addEnd = System.nanoTime();
             timeElapsed1= (addEnd - addBegin) / Math.pow(10, 6);
     		 System.out.println("Add data (secs): " + timeElapsed1);
             
             removeOneStart = System.nanoTime();
             orderList5.removeOne("Hamburger");
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList5.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             orderList5.search("Chips");
             searchEnd = System.nanoTime();
             timeElapsed4= (searchEnd - searchStart) / Math.pow(10, 6);
             System.out.println("search data (secs): " + timeElapsed4);
             //orderList.print(System.out);
            
		
             System.out.println(" ");
		System.out.println("for size = " + size6);
		System.out.println("Time Unit: milliSecond");
		

		addBegin = System.nanoTime();
		for (int i = 1; i <= size6; i++) {
            orderList6.add(FastFood());
		}
             addEnd = System.nanoTime();
             timeElapsed1= (addEnd - addBegin) / Math.pow(10, 6);
     		 System.out.println("Add data (secs): " + timeElapsed1);
             
             removeOneStart = System.nanoTime();
             orderList6.removeOne("Hamburger");
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList6.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             orderList6.search("Chips");
             searchEnd = System.nanoTime();
             timeElapsed4= (searchEnd - searchStart) / Math.pow(10, 6);
             System.out.println("search data (secs): " + timeElapsed4);
             //orderList.print(System.out);
            
		}
	}


