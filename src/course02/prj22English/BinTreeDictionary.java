package course02.prj22English;

public class BinTreeDictionary {

	Node root;

	boolean add(Pair words)

	{
		if (root == null) {
			root = new Node(words, null, null);
			return true;
		}
		return insert(root, words);

	}

	boolean insert(Node node, Pair words) {

		Node curWords = new Node(words, null, null);

		while (true) {
			if (node.words.K.compareTo(words.K) > 0) {
				if (node.left == null) {
					node.left = curWords;
				} else {
					insert(node.left, words);
				}
			} else {
			}
		}
	}

}
