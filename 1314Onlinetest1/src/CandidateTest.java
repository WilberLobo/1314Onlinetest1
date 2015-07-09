import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class CandidateTest {
	Candidate candidt= new Candidate();
	@Test
	public final void testDisplayCandidateList() {
		//fail("Not yet implemented");
		ArrayList<String> candidate = new ArrayList<String>();
		candidate.add("Ram");
		candidate.add("Prasad");
		candidate.add("Prakash");
		candidate.add("sujay");
		assertEquals(candidate,candidt.candidate);
		
	}

}
