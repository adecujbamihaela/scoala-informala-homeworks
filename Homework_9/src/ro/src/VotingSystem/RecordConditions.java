package ro.src.VotingSystem;
/**
 * This class contains the save and the loadAll methods for the VotingFile class.
 * <p>
 * 
 * @author Adelina
 */

import java.util.List;

public interface RecordConditions {
	void save(Vote vote) throws Exception;

	List<Vote> loadAll() throws Exception;
}

