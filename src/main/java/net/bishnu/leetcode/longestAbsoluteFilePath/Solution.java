package net.bishnu.leetcode.longestAbsoluteFilePath;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by karlb on 2017-03-05.
 */
public class Solution {
    class Entity{
        Map<String, Entity> map;
        Entity parent;
        int level;
        String name;
        boolean isDir;

        Entity(Entity parent, String name, int level, boolean isDir){
            this.parent = parent;
            this.name = name;
            this.level = level;
            this.isDir = isDir;
            if(isDir)   map = new HashMap<>();
        }
    }

    private Entity root;

    private int makeTree(String input, int offset, Entity dir){
        String name = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder sbWithoutWhiteSpace = new StringBuilder();
        int level = 0;
        boolean isDir = true;

        for(int i=offset; i<input.length(); i++){
            char aChar = input.charAt(i);

            if(aChar =='/'){
                Entity parent = getParent(dir, level);
                name = isDir ? sbWithoutWhiteSpace.toString() : sb.toString();

                Entity entity = new Entity(parent, name, level, isDir);
                if(parent != null){
                    parent.map.put(entity.name, entity);
                }else {
                    root = entity;
                }

                if(isDir){
                    i=makeTree(input, i+1, entity);
                }

                sb.setLength(0);
                sbWithoutWhiteSpace.setLength(0);
                level = 0;
                isDir = true;
            }else if(aChar == '\t'){
                level++;
            }else {
                if(aChar == '.'){
                    isDir = false;
                }

                if(aChar == ' '){
                    sb.append(aChar);
                }else{
                    sb.append(aChar);
                    sbWithoutWhiteSpace.append(aChar);
                }
            }
        }

        if(sb.length()>0){
            name = isDir ? sbWithoutWhiteSpace.toString() : sb.toString();
            Entity parent = getParent(dir, level);
            Entity entity = new Entity(parent, name, level, isDir);
            if(parent != null){
                parent.map.put(entity.name, entity);
            }else {
                root = entity;
            }
        }

        return input.length();
    }

    private Entity getParent(Entity dir, int level) {
        Entity curr = dir;
        while(curr != null && level != 0 && curr.level >= level){
            curr = curr.parent;
        }
        return curr;
    }

    private String traverse(Entity root){
        String path = "";
        if(root.isDir) {
            Map<String, Entity> map = root.map;
            Iterator<String> iterator = map.keySet().iterator();

            while (iterator.hasNext()) {
                Entity entity = map.get(iterator.next());
                String aString = traverse(entity);
                path = path.length() > aString.length()?
                        path :
                        aString;
            }
            path = root.name +"/"+path;
        }else{
            path = root.name;
        }

        return path;
    }

    public int lengthLongestPath(String input){
        input.replaceAll("\\n\\t", "/");
        makeTree(input, 0, null);
        String longestPath = traverse(root);
        return longestPath.contains(".") ? longestPath.length() : 0;
    }
}
