package com.google.engedu.ghost;
import java.util.HashMap;


public class TrieNode {
    private HashMap<String, TrieNode> children;
    private boolean isWord;

    public TrieNode() {
        children = new HashMap<>();
        isWord = false;
    }

    public void add(String s) {
        TrieNode currentnode = this;
        String word;

        for (int i=0 ; i<s.length() ; i++){

            word = "" + s.charAt(i);
            if(!currentnode.children.containsKey(word)){

                currentnode.children.put(word, new TrieNode());

            }

            currentnode = currentnode.children.get(word);

        }

        currentnode.isWord = true;
    }

    public boolean isWord(String s) {

        //get the root node of this object
        TrieNode currentNode = this;
        String key;

        //maintain a boolean to check for end of word
        boolean isFound = false;

        //loop through all the chars
        for (int i = 0; i < s.length(); i++) {
            key = "" + s.charAt(i);
            //if the current char is present as a key , then go to its child node and further so on
            if (currentNode.children.containsKey(key)) {
                currentNode = currentNode.children.get(key);
            }
            //if any char is not found , then break out of the loop
            else {
                isFound = false;
                return isFound;
            }
        }
        return false;
    }

    public String getAnyWordStartingWith(String s) {
        return null;
    }

    public String getGoodWordStartingWith(String s) {
        return null;
    }
}
