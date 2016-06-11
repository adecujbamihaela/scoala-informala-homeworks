package ro.sci.TennisMatch;
/**
 * This class tests if the total amount sold is the correct one.
 * <p>
 * @author Adelina
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketSold {


	@Test
	public void TotalValueSoldTest() {
		HouseTickets tst = new HouseTickets();
		assertEquals(23300.0,tst.TotalValueSold(50, 80, 120), 0 );
	}

}
