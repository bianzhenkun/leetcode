class Trie {
    private Trie[] children;
    boolean isEnd;

    /** Initialize your data structure here. */
    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie node = this;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int index = ch-'a';
            if(node.children[index]==null){
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;
        
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return searchPrefix(word)!=null && searchPrefix(word).isEnd==true;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix)!=null;
    }

    public Trie searchPrefix(String prefix){
        Trie node = this;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(node.children[ch-'a']==null) return null; 
            node = node.children[ch-'a'];
        }
        return node;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */