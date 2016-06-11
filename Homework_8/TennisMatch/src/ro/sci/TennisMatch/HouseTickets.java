package ro.sci.TennisMatch;
/**
 * This class iterates over each category of tickets held in a collection and sell tickets one by one.
 * <p>
 * When a category remains out of tickets an exception is thrown. Also when all tickets are sold  a "Sold Out" exception is thrown.
 * <p>
 * The class calculates the value of tickets sold per category and the total amount of the sold tickets.
 * <p>
 * @author Adelina
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class HouseTickets {

	private double numberTicket = 20;
	private final double PRICE1 = 50;
	private final double PRICE2 = 80;
	private final double PRICE3 = 120;
	HashMap<Integer, Double> tickets = new HashMap<>(20);
	Collection<Double> CategoryOne = new ArrayList<>(3);
	Collection<Double> CategoryTwo = new ArrayList<>(7);
	Collection<Double> CategoryThree = new ArrayList<>(10);
	Collection<String> buyers = new ArrayList<>(33);
	private int i;

	public void sellTickets(double ticket) throws CategoryTicketsSoldoutException, SoldOutException {
		for (i = 0; i < CategoryThree.size(); i--) {
			if (CategoryThree.remove(ticket))
				System.out.println(CategoryThree.toString() + "Price = " + "50");

			if (CategoryThree == null)
				throw new CategoryTicketsSoldoutException();
		}
		System.out.println("Category Three is out of tickets! Would you like a Category Two ticket?");

		for (i = 0; i < CategoryTwo.size(); i--) {
			if (CategoryTwo.remove(ticket))
				System.out.println(CategoryTwo.toString() + "Price = " + "50");

			if (CategoryTwo == null)
				;
			throw new CategoryTicketsSoldoutException();
		}
		System.out.println("Category Two is out of tickets! Would you like a Category One ticket?");

		for (i = 0; i < CategoryOne.size(); i--) {
			if (CategoryOne.remove(ticket))
				System.out.println(CategoryTwo.toString() + "Price = " + "50");
		}
		if (CategoryOne == null)
			throw new SoldOutException();

		System.out.println("There are no tickets remaining!");

	}

	public double TotalValueSold(double PRICE1, double PRICE2, double PRICE3) {
		double PricesCateg3 = 120 * PRICE3;
		double PricesCateg2 = 80 * PRICE2;
		double PricesCateg1 = 50 * PRICE1;
		System.out.println("The value of tickets sold per category is " + PricesCateg3 + ", " + PricesCateg2 + ", "
				+ ", " + PricesCateg1);

		double totalSoldTickets = PricesCateg3 + PricesCateg2 + PricesCateg1;
		System.out.println("The total value of sold tickets is " + totalSoldTickets);
		return totalSoldTickets;
	}

	public void buyer() {
		for (i = 0; i < buyers.size(); i++) {
			if (i == 17)
				;
			Object ticket = null;
			CategoryThree.remove(ticket);
			CategoryThree.remove(ticket);
			CategoryThree.remove(ticket);
			System.out.println(CategoryThree.toString());
		}
	}

	public double getNumberTicket() {
		return numberTicket;
	}

	@Override
	public String toString() {
		return "HouseTickets [CategoryThree=" + CategoryThree + "]";
	}

	public double getPRICE1() {
		return PRICE1;
	}

	public double getPRICE2() {
		return PRICE2;
	}

	public double getPRICE3() {
		return PRICE3;
	}

}