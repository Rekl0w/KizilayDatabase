/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonodev;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;



/**
 *
 * @author Rekl0w
 */
public class KanVericiler {

    private Map<Node, LinkedList<Node>> adjacencyMap;

    public KanVericiler(){
        adjacencyMap = new HashMap<>();
    }

    public void insert(Node source, Node target){
       if(!adjacencyMap.keySet().contains(source)){
            
            adjacencyMap.put(source, null);
        }
        if(!adjacencyMap.keySet().contains(target)){
            
            adjacencyMap.put(target, null);
        }
        LinkedList<Node> temp = adjacencyMap.get(source);
        if(temp == null){
            temp = new LinkedList<>();
        }
        temp.add(target);
        adjacencyMap.put(source, temp);
    }

    public boolean hasEdge(Node source, Node target){
        return adjacencyMap.containsKey(source) && adjacencyMap.get(source) != null && adjacencyMap.get(source).contains(target);
    }

    public void traverse(){
       for(Node root: adjacencyMap.keySet()){
            System.out.print("Bu kişinin kan verebileceği insanlar: " + root.Insan + " -> " );
            LinkedList<Node> vertices = adjacencyMap.get(root);
            if(vertices != null) {
                for (Node adjacent : adjacencyMap.get(root)){
                    System.out.print(adjacent.Insan +", ");
                }
                System.out.print("\n");
            }
            
        }


    }


}