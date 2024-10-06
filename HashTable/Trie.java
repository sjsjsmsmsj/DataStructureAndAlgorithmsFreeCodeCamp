

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    public class TrieNode {
        private TrieNode[] children;
        private boolean isWord;
        public TrieNode() {
            this.children = new TrieNode[26]; // storing a -> z
            this.isWord = false;
        }
    }
    public void insert(String word) {
        TrieNode current = root;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i ++) {
            char x = word.charAt(i);
            int n = x - 'a';
            if (current.children[n] == null) {
                TrieNode t = new TrieNode();
                current.children[n] = t;
                current = t;
            } else {
                current = current.children[n];
            }
        }
        
    }
    public static void main(String args[]) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("son");
        trie.insert("so");
        System.out.println("Values inserted successfully");
    }
}
