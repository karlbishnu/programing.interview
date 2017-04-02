package net.bishnu.leetcode.wordSquares;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 425. Word Squares
 * https://leetcode.com/problems/word-squares/#/description
 * Created by karlb on 2017-04-02.
 */
public class WordSquares {
    private class Node{
        List<String> word = new LinkedList<>();
        Node[] nodes = new Node['z'-'a'+1];
    }

    public List<List<String>> wordSquares(String[] words){
        List<List<String>> result = new LinkedList<>();
        Node root = buildStatusTree(words);
        for(String word: words){
            List<String> strings = new ArrayList<>(words.length);
            strings.add(word);
            search(strings, root, result);
        }
        return result;
    }

    private void search(List<String> strings, Node root, List<List<String>> result) {
        int size = strings.size();
        if(size==strings.get(0).length()){
            result.add(new ArrayList<>(strings));
            return;
        }

        Node curr = root;
        for(int i=0; i< strings.size(); i++){
            char aChar = strings.get(i).charAt(size);
            int index = aChar - 'a';
            if(curr.nodes[index] == null) return;
            curr = curr.nodes[index];
        }

        for(String word: curr.word){
            strings.add(word);
            search(strings, root, result);
            strings.remove(strings.size()-1);
        }
    }

    private Node buildStatusTree(String[] words) {
        Node root = new Node();

        for(int i=0; i<words.length; i++){
            String word = words[i];
            Node curr = root;
            for(int j=0; j<word.length(); j++){
                int index = word.charAt(j)-'a';
                if(curr.nodes[index] == null)   curr.nodes[index] = new Node();
                curr.word.add(word);
                curr = curr.nodes[index];
            }
        }
        return root;
    }
}
