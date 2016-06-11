package ro.sci.TennisMatch;
/**
 * This class adds tickets per each category and also adds the total tickets in a HashMap.
 * <p>
 * @author Adelina
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Console {

	public static void main(String[] args) throws CategoryTicketsSoldoutException, SoldOutException {
		HouseTickets tick = new HouseTickets();
		Collection<Integer> CategoryThree = new ArrayList<>(10);
		CategoryThree.add(1);
		CategoryThree.add(2);
		CategoryThree.add(3);
		CategoryThree.add(4);
		CategoryThree.add(5);
		CategoryThree.add(6);
		CategoryThree.add(7);
		CategoryThree.add(8);
		CategoryThree.add( 9);
		CategoryThree.add( 10);
		System.out.println("Category Three tickets: " + CategoryThree.toString());
		
		Collection<Integer> CategoryTwo = new ArrayList<>(7);
		CategoryTwo.add(11);
		CategoryTwo.add(12);
		CategoryTwo.add(13);
		CategoryTwo.add(14);
		CategoryTwo.add(15);
		CategoryTwo.add(16);
		CategoryTwo.add(17);		
		System.out.println("Category Two tickets: " + CategoryTwo.toString());
		
		Collection<Integer> CategoryOne = new ArrayList<>(3);
		CategoryOne.add(18);
		CategoryOne.add(19);
		CategoryOne.add(20);
		System.out.println("Category One tickets:" + CategoryOne.toString());
		
		HashMap<Integer, Collection<Integer>> tickets = new HashMap<>(20);
		tickets.put(3,  CategoryThree);
		tickets.put(2,  CategoryTwo);
		tickets.put(1,  CategoryOne);
		System.out.println("The list of total tickets is: " + tickets);
		
		tick.sellTickets(5);
		tick.TotalValueSold(50, 80, 120);
		tick.buyer();
		
	}

}
