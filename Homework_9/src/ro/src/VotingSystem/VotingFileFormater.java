package ro.src.VotingSystem;
/**
 * This class formats the file container.
 * <p>
 * @author Adelina
 */

import java.text.ParseException;

public class VotingFileFormater {

	

public String toVoteFile(Vote vote) {
	return (vote.getCNP()) + "," + vote.getName() + "," + vote.getCandidate();
	}
	
	public Vote fromVoteFile(String txtLine)throws ParseException{
	String[] tokens = txtLine.split(",");	
	Long a = Long.parseLong(tokens[0]);
	String b = String.valueOf(tokens[1]);
	String c = String.valueOf(tokens[2]);
	return new Vote(a, b, c);
	}
}


	
	

	
