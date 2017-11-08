package net.bishnu.leetcode.longestWordInDictionary;

/**
 * 720. Longest Word in Dictionary
 * https://leetcode.com/problems/longest-word-in-dictionary/description/
 */
public class LongestWordInDictionary {
    private class Node{
        final Character val;
        final Node[] next;
        boolean isTerminal;
        Node(Character val){
            this.val = val;
            next = new Node[26];
            isTerminal = false;
        }
    }

    private final Node root;

    public LongestWordInDictionary(){
        root = new Node(null);
    }

    private void insert(String word){
        if(word==null || word.isEmpty())    return;
        Node curr = root;
        for(char c: word.toCharArray()){
            curr = curr.next[c-'a']==null ?
                    curr.next[c-'a']=new Node(c) :
                    curr.next[c-'a'];
        }
        curr.isTerminal=true;
    }

    public String longestWord(String[] words){
        if(words==null) return null;
        for(String word: words){
            insert(word);
        }

        return findLongest(root, "");
    }

    private String findLongest(Node node, String s) {
        if(node != root && !node.isTerminal)    return "";
        String longest =s;
        for(Node n : node.next){
            if(n==null) continue;
            String tmp = findLongest(n, s+n.val);
            longest=longest.length()<tmp.length() ? tmp : longest;
        }
        return longest;
    }
}
