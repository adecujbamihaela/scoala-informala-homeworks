package ro.src.VotingSystem;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class adds a vote to a record.
 * <p>
 * Also, the class writes votes and reads them as a threading process.
 * @author Adelina
 *
 */

public class VotingRecords {

	private VotingFile votingFile;

	public VotingRecords(VotingFile votingFile) {
		this.votingFile = votingFile;
	}

	public void addVote(Vote vote) throws Exception {
		votingFile.elect(vote);

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
	protected void writeVotes(VotingFile votingCard, Vote vote) {
		new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000 + new Random().nextInt(2000));
					synchronized (votingCard) {
						VotingRecords records = new VotingRecords(votingCard);
						records.addVote(vote);
						System.out.println("Vote incomming" + vote.toString());
					}
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}.start();
	}

	protected void readVotes(VotingFile votingCard) {
		new Thread() {
			@Override
			public void run() {
				try {
					while (true) {
						Thread.sleep(5000);
						synchronized (votingCard) {
							System.out.println("\n>>>>>>>> VotingList <<<<<<<<<");
							VotingRecords rec = new VotingRecords(votingCard);
								System.out.println(votingFile.toString());
							}
						}
					
				} catch (Exception e) {
					e.printStackTrace(System.err);
				}
			}
		}.start();
}
}