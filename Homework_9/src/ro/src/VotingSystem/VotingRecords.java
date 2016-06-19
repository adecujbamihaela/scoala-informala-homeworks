package ro.src.VotingSystem;

import java.util.ArrayList;

/**
 * This class adds a vote to a record.
 * <p>
 * @author Adelina
 *
 */

public class VotingRecords {

	private VotingFile votingFile;

	public VotingRecords(VotingFile votingFile) {
		this.votingFile = votingFile;
	}

	public void addVote(Vote vote) throws Exception {
		votingFile.save(vote);

	}
	public void countingVotes() throws Exception{
		ArrayList <Vote> votes = new ArrayList<>();
		int counter = 0;
		for (int i = 0; i<= votes.size(); i++ );{
			int i = 0;	
			if ( votes.get(i) != null)
				counter++;
			else throw new Exception("Someone hasn't choose a candidate, the vote is invalidated.");
			if (votes.get(i) == votes.get(i)){
				throw new Exception ("Someone tried to vote twice, all his votes are invalidated and he'll pay a fine");
			}
		}
	}
	public float calculatePercentage(float max, float actual) {
		return actual*100/max;
	}
}