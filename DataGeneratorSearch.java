package DataGenerator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import DataStructures.LinkedListMultiset;

public class DataGeneratorSearch {
	//Method to get the name of fast food in the menu ramdomly
    public static String FastFood(){
    ArrayList<String>fastFood = new ArrayList<String>();
    
    fastFood.add("Hamburger");
    fastFood.add("Chips");
    fastFood.add("Salad");
    fastFood.add("Nuggets");
    fastFood.add("Chicken Wings");
    fastFood.add("Hotdog");
    fastFood.add("Salmon Roll");
    //fastFood.add("Vegan Burger");
    //fastFood.add("Muffin");
    fastFood.add("Onion Rings");
    
    String orderFood = fastFood.get(new Random().nextInt(fastFood.size()));
			return orderFood;
     
    }
    /**
    //Methods to get the name of drinks from the menu randomly
    public final static String Drinks(){
    ArrayList<String>drinks = new ArrayList<String>();
    
    drinks.add("Coke");
    drinks.add("Orange Juice");
    drinks.add("Milk Shake");
    drinks.add("Beer");
    
    String orderDrinks = drinks.get(new Random().nextInt(drinks.size()));
    return orderDrinks;
    
    }
		
		//Method to get a set of food & drinks randomly
		public static String customerOrder() {
   
			//ArrayList<String> CustomerOrder = new ArrayList<String>();
     // CustomerOrder.add(FastFood()+ "  " + Drinks());
			//String newOrder = CustomerOrder.get(new Random().nextInt(CustomerOrder.size()));
     
     String newOrder = FastFood() + " & " + Drinks();
			return newOrder;

		}*/
	public static void main(String[] args) {
		System.out.println("Doubly LinkedList testing");

		// TODO Auto-generated method stub
		int size1 = 50000;
		int size2 = 10;
		int size3 = 100;
		int size4 = 1000;
		int size5 = 10000;
		int size6 = 50000;
		LinkedListMultiset<String> orderList1 = new LinkedListMultiset<String>();
		LinkedListMultiset<String> orderList2 = new LinkedListMultiset<String>();
		LinkedListMultiset<String> orderList3 = new LinkedListMultiset<String>();
		LinkedListMultiset<String> orderList4 = new LinkedListMultiset<String>();
		LinkedListMultiset<String> orderList5 = new LinkedListMultiset<String>();
		LinkedListMultiset<String> orderList6 = new LinkedListMultiset<String>();
		long addBegin=0;
		long addEnd=0;
  //generate a list of new order randomly,add it into LinkedList
		System.out.println(" ");
		System.out.println("for size = " + size1);
		System.out.println("Time Unit: milliSecond");
		

		addBegin = System.nanoTime();
		for (int i = 1; i <= size1; i++) { 
             orderList1.add(FastFood());
		}
             addEnd = System.nanoTime();
             double timeElapsed1= (addEnd - addBegin) / Math.pow(10, 6);
     		 System.out.println("Add data (secs): " + timeElapsed1);
             
             long removeOneStart = System.nanoTime();
             for (int i = 1; i <= size1; i++) {
                 orderList1.removeOne(FastFood());
                 }
             long removeOneEnd = System.nanoTime();
             double timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             long removeAllStart = System.nanoTime();
             orderList1.removeAll("Onion Ring");
             long removeAllEnd = System.nanoTime();
             double timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             long searchStart = System.nanoTime();
             for (int i = 1; i <= (size1*2); i++) {
             orderList1.search(FastFood());
             }
             long searchEnd = System.nanoTime();
             double timeElapsed4= (searchEnd - searchStart) / Math.pow(10, 6);
             System.out.println("search data (secs): " + timeElapsed4);
            
            
		
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
             for (int i = 1; i <= size2; i++) {
                 orderList2.removeOne(FastFood());
                 }
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList2.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             for (int i = 1; i <= (size2*2); i++) {
                 orderList2.search(FastFood());
                 }
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
             for (int i = 1; i <= size3; i++) {
                 orderList3.removeOne(FastFood());
                 }
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList3.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             for (int i = 1; i <= (size3*2); i++) {
                 orderList3.search(FastFood());
                 }
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
             for (int i = 1; i <= size4; i++) {
                 orderList4.removeOne(FastFood());
                 }
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList4.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             for (int i = 1; i <= (size4*2); i++) {
                 orderList4.search(FastFood());
                 }
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
             for (int i = 1; i <= size5; i++) {
             orderList5.removeOne(FastFood());
             }
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("Remove data all (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList5.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             for (int i = 1; i <= (size5*2); i++) {
                 orderList5.search(FastFood());
                 }
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
             for (int i = 1; i <= size6; i++) {
                 orderList6.removeOne(FastFood());
                 }
             removeOneEnd = System.nanoTime();
             timeElapsed2= (removeOneEnd - removeOneStart) / Math.pow(10, 6);
             System.out.println("remove one data (secs): " + timeElapsed2);
             
             removeAllStart = System.nanoTime();
             orderList6.removeAll("Onion Ring");
             removeAllEnd = System.nanoTime();
             timeElapsed3= (removeAllEnd - removeAllStart) / Math.pow(10, 6);
             System.out.println("remove all data (secs): " + timeElapsed3);
             
             searchStart = System.nanoTime();
             for (int i = 1; i <= (size6*2); i++) {
                 orderList6.search(FastFood());
                 }
             searchEnd = System.nanoTime();
             timeElapsed4= (searchEnd - searchStart) / Math.pow(10, 6);
             System.out.println("search data (secs): " + timeElapsed4);
             //orderList.print(System.out);
            
		}
  /**
		long end = System.nanoTime();
		double timeElapsed = (end - begin) / Math.pow(10, 9);
		System.out.println("");
        System.out.println("Time elapsed (secs): " + timeElapsed); */
		
		/**
		
		while(true){
  System.out.println("------Food Menu------");
  System.out.println("Hamburger\nChips\nSalad\nNuggets\nOnion Rings\nChicken Wings\nHotdog\nSalmon Roll");
		//System.out.println("------Drinks Menu------");
 // System.out.println("Coke\nOrange Juice\nMilk Shake\nBeer");
  System.out.println(" ");
  System.out.println(" ");

  Scanner scan = new Scanner(System.in);
		System.out.println("what do you want do next");
		System.out.println("1. add");
		System.out.println("2. remove");
		System.out.println("3.remove all");
		System.out.println("4. search");
		int choice = scan.nextInt();            
        switch (choice)
        {
        case 1 : 
            System.out.println("Enter a element to insert");
            long begin1 = System.nanoTime();
            orderList.add(scan.next()); 
        	long end1 = System.nanoTime();
        	System.out.println(end1 - begin1);
        	break;
        case 2 :
        	System.out.println("Enter a element to remove");
        	long begin2 = System.nanoTime();
        	orderList.removeOne(scan.next()); 
        	long end2 = System.nanoTime();
        	System.out.println(end2 - begin2);
        	break;
        case 3 :
        	System.out.println("Enter a element to remove");
        	long begin3 = System.nanoTime();
        	orderList.removeAll(scan.next()); 
        	long end3 = System.nanoTime();
        	System.out.println(end3 - begin3);
        	break;
        	
        case 4 : 
          System.out.println("Enter a element to search");
          long begin4 = System.nanoTime();
          orderList.search(scan.next()); 
        	long end4 = System.nanoTime();
        	
        	System.out.println(end4 - begin4);  
        	break;
        }    
		}*/
	}