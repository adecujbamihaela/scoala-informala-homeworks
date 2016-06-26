package ro.src.VotingSystem;

/**
 * This class describes a vote.
 * <p>
 * 
 * @author Adelina
 *
 */

public class Vote {
	private String name;
	private long CNP;
	private String candidate;

	public Vote(long CNP, String name, String candidate) {
		this.name = name;
		this.CNP = CNP;
		this.candidate = candidate;
	}

	public String getName() {
		return name;
	}

	public long getCNP() {
		return CNP;
	}

	public String getCandidate() {
		return candidate;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", CNP=" + CNP + ", candidate=" + candidate + "]";
	}
	

}
