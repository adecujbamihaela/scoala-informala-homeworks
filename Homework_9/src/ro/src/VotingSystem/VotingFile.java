package ro.src.VotingSystem;

/**
 * This class creates and reads a file line by line in a synchronized way.
 * <p>
 * 
 * @author Adelina
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class VotingFile implements RecordConditions {
	protected static final String votingFile = "votes.txt";
	protected VotingFileFormater voteFormater = new VotingFileFormater();

	public synchronized void elect(Vote vote) throws IOException {
		File file = new File(votingFile);
		try (FileWriter writer = new FileWriter(file, true)) {
			writer.append(voteFormater.toVoteFile(vote) + "\n");
		}
	}

	public synchronized List<Vote> readAll() throws FileNotFoundException, IOException, ParseException {
		File file = new File(votingFile);
		ArrayList<Vote> votes = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = reader.readLine();
			while (line != null) {
				Vote v = voteFormater.fromVoteFile(line);
				votes.add(v);
				line = reader.readLine();
			}
		}
		return votes;
	}

}