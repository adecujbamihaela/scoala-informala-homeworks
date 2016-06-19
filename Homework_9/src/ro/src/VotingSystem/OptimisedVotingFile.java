package ro.src.VotingSystem;
/**
 * This class closes optimizes the writing in the file..
 * <p> 
 * @author Adelina
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OptimisedVotingFile extends VotingFile implements AutoCloseable {
	private FileWriter writer;

	public void openTXT() throws IOException {
		File file = new File(votingFile);
		writer = new FileWriter(file, true);
	}

	public void closeTXT() throws IOException {
		if (writer != null) {
			writer.close();
		}
	}

	@Override
	public void save(Vote vote) throws IOException {
		writer.append(voteFormater.toVoteFile(vote) + "\n");
	}

	public void close() throws Exception {
		closeTXT();
	}

}


