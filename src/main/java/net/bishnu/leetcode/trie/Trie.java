package net.bishnu.leetcode.trie;

/**
 * 208. Implement Trie (Prefix Tree)
 * https://leetcode.com/problems/implement-trie-prefix-tree/description/
 */
public class Trie {
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
    public Trie(){
        root = new Node(null);
    }

    public void insert(String word){
        if(word==null || word.isEmpty())    return;
        Node curr = root;
        for(char c: word.toCharArray()){
            curr = curr.next[c-'a']==null ?
                    curr.next[c-'a']=new Node(c) :
                    curr.next[c-'a'];
        }
        curr.isTerminal=true;
    }

    public boolean search(String word){
        Node end = getLast(word);
        return end != null && end.isTerminal;
    }

    public boolean startsWith(String word){
        return getLast(word) != null;
    }

    private Node getLast(String word){
        Node curr = root;
        for(char c: word.toCharArray()){
            if(curr.next[c-'a']==null){
                curr = null;
                break;
            }else{
                curr = curr.next[c-'a'];
            }
        }
        return curr;
    }
}
