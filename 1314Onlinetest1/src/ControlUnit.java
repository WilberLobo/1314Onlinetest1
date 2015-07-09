import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;



public class ControlUnit {
	int totalVotes=0;
	BallotUnit bu =new BallotUnit();


	Hashtable candidateVotes = new Hashtable();
	
	double bal;
	public void voteForCandidates(String candidate){

		totalVotes++;
		int i;
		candidateVotes.put(candidate, i++);
	}

	
	

	public void voteCounter(){

	}
}
