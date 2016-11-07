
public class MarkovStringPair {
	
	
	//object that holds string before, string after, and position in document of a specific instance of a word
	private long wordNum;
	private String before;
	private String after;

	
	public MarkovStringPair(long wordNum, String before, String after) {
		this.wordNum = wordNum;
		this.before = before;
		this.after = after;
	}

	public long getWordNum() {
		return wordNum;
	}

	public void setWordNum(long wordNum) {
		this.wordNum = wordNum;
	}

	public String getBefore() {
		return before;
	}

	public String getAfter() {
		return after;
	}

}
