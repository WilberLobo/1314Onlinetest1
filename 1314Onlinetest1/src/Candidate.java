import java.util.ArrayList;


public class Candidate {
	public ArrayList<String> candidate=new ArrayList<String>(16);

	public ArrayList<String> getCandidate() {
		return candidate;
	}

	public void setCandidate(ArrayList<String> candidate) {
		this.candidate = candidate;
	}

	public  Candidate() {

	}

	public  Candidate(ArrayList<String> candidate) {
		this.candidate = candidate;
				
	}
	
	public void addCandidateList() {

		candidate.add("Ram");
		candidate.add("Prasad");
		candidate.add("Prakash");
		candidate.add("sujay");

	}
	
	public void displayCandidateList() {
		for(int i=0; i<= candidate.size(); i++){
			System.out.println(candidate.get(i));			
		}
		

	}



	

}
