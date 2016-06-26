package ro.src.VotingSystem;


/**
 * This class contains the main method that adds new votes to a record.
 * <p>
 * 
 * @author Adelina
 *
 */

public class VotingProcess {

	public static void main(String[] args) throws Exception {
		VotingFile votingCard = new VotingFile();
		
		VotingRecords records = new VotingRecords(votingCard);
		records.writeVotes(votingCard, new Vote(1657894690, "Dick Dastardly", "Muttley"));
		records.writeVotes(votingCard, new Vote(1456546546, "Burt Reynolds", "Mr. Bean"));
		records.writeVotes(votingCard, new Vote(1676576577, "Ronaldo", "Spirt Mona"));
		records.writeVotes(votingCard, new Vote(1563453455, "Britney Spears", "A tree"));
		records.writeVotes(votingCard, new Vote(1657896590, "Stevie Wonder", null));
		records.writeVotes(votingCard, new Vote(1657887640, "Scooby Doo", "Xena"));
		records.writeVotes(votingCard, new Vote(1657898720, "Lord", "Anne"));
		records.writeVotes(votingCard, new Vote(1657459390, "James", "Butterfly"));
		
		records.readVotes(votingCard);
		}
		
}
	
	
