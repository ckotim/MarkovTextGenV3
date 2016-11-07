import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MarkovNode {

	
	private String word;
	private ArrayList<MarkovStringPair> links;
	private MarkovNode collisionNode;

	public MarkovNode(String word, String before, String after, long wordCount) {
		this.word = word;
		MarkovStringPair first = new MarkovStringPair(wordCount, before, after);

		this.links = new ArrayList<MarkovStringPair>();
		links.add(first);

		this.collisionNode = null;

	}

	public String getWord() {
		return word;
	}

	public MarkovNode getNext() throws NoSuchElementException {
		if (this.collisionNode != null) {
			return this.collisionNode;
		}
		throw new NoSuchElementException("No more nodes in current branch");
	}
	
	public 

}
