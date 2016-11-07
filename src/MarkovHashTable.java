
public class MarkovHashTable {

	private MarkovNode[] table;

	public MarkovHashTable(int size) {
		table = new MarkovNode[size];
	}

	public MarkovHashTable() {
		this(1021);
	}

	public void add(MarkovNode node) {
		int pos = node.getWord().hashCode() % this.table.length;
		if (table[pos] != null) {
			MarkovNode temp = table[pos];
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);

		} else {
			table[pos] = node;
		}
	}
}
