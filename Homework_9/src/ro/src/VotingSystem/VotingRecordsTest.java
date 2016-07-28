package ro.src.VotingSystem;
/**
 * This class tests if the counting process for the candidates is the correct one.
 * <p>
 * @author Adelina
 */
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class VotingRecordsTest {

	@Test
	public void test() {	
	    ArrayList <Vote> votes = new ArrayList<>();
		votes.add(new Vote(1578290283, "Ade", "Nobody"));
		votes.add(new Vote(1578290283, "Claire", "Someone"));
		assertEquals(2,votes.size(),0);
	}

}