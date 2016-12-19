package net.bishnu.data.structure.graph;

import net.bishnu.data.structure.list.LinkedQueue;
import net.bishnu.data.structure.list.Queue;

import java.util.*;

/**
 * Created by karlb on 2016-12-18.
 */
public class KevinBaconNumber {
    private static class ActorGraphNode{
        private final String name;
        private final Set<ActorGraphNode> linkedActors;

        ActorGraphNode(String name){
            this.name = name;
            linkedActors = new HashSet<>();
        }

        public void linkCoStar(ActorGraphNode coStar){
            if(coStar == this)  return;
            this.linkedActors.add(coStar);
            coStar.linkedActors.add(this);
        }

        @Override
        public int hashCode(){
            return name.hashCode();
        }

        @Override
        public boolean equals(Object o){
            if(this == o)   return true;
            if(o == null || !(o instanceof ActorGraphNode))  return false;

            return this.name.equals(((ActorGraphNode) o).name);
        }
    }

    private static Map<String, ActorGraphNode> actorGraphNodeMap = new HashMap<>();
    private static final String KEVIN_BACON = "KevinBacon";
    static{
        ActorGraphNode a = new ActorGraphNode("a");

        ActorGraphNode b = new ActorGraphNode("b");
        b.linkCoStar(a);

        ActorGraphNode c = new ActorGraphNode("c");
        c.linkCoStar(a);
        c.linkCoStar(b);

        ActorGraphNode d = new ActorGraphNode("d");
        d.linkCoStar(b);

        ActorGraphNode kevinBacon = new ActorGraphNode(KEVIN_BACON);
        kevinBacon.linkCoStar(c);

        actorGraphNodeMap.put(a.name, a);
        actorGraphNodeMap.put(b.name, b);
        actorGraphNodeMap.put(c.name, c);
        actorGraphNodeMap.put(d.name, d);
        actorGraphNodeMap.put(kevinBacon.name, kevinBacon);
    }

    public static int getBaconNumber(String name){
        Queue<ActorGraphNode> actorGraphNodeQueue = new LinkedQueue<>();
        actorGraphNodeQueue.enqueue(actorGraphNodeMap.get(name));
        Map<ActorGraphNode, Integer> distanceMap = new HashMap<>();
        distanceMap.put(actorGraphNodeMap.get(name), 0);

        ActorGraphNode bacon = actorGraphNodeMap.get(KEVIN_BACON);
        while(!actorGraphNodeQueue.isEmpty()){
            ActorGraphNode currentNode = actorGraphNodeQueue.dequeue();
            if(currentNode.equals(bacon)){
                return distanceMap.get(currentNode);
            }
            Set<ActorGraphNode> neighbors = currentNode.linkedActors;
            for(ActorGraphNode node : neighbors){
                if(!distanceMap.containsKey(node)){
                    distanceMap.put(node, distanceMap.get(currentNode)+1);
                    actorGraphNodeQueue.enqueue(node);
                }
            }
        }

        throw new IllegalStateException();
    }
}
