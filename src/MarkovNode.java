import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MarkovNode {

	
	private String word;
	private ArrayList<MarkovStringPair> links;
	private MarkovNode next;

	public MarkovNode(String word, String before, String after, long wordCount) {
		this.word = word;
		MarkovStringPair first = new MarkovStringPair(wordCount, before, after);

		this.links = new ArrayList<MarkovStringPair>();
		links.add(first);

		this.next = null;

	}

	public String getWord() {
		return word;
	}

	public MarkovNode getNext() throws NoSuchElementException {
			return this.next;
	}
	
	public void setNext(MarkovNode nextNode){
		this.next = nextNode;
	}


}
