package graphs;

import graphs.entity.WeightedGraphNode;

import java.util.ArrayList;
import java.util.Random;

public class DijkstraShortestPath {

    public static void printGraph(WeightedGraphNode tempRoot ,ArrayList<WeightedGraphNode> blackList){

        blackList.add(tempRoot);
        System.out.println("\n" + tempRoot.toString());

        for (WeightedGraphNode node : tempRoot.getNodesWithWeight().keySet()) {
            if (!blackList.contains(node))
                printGraph(node, blackList);
        }
    }

    public static void findShortestPath(WeightedGraphNode tempRoot, int curCost){

        for(WeightedGraphNode node: tempRoot.getNodesWithWeight().keySet()){
            int newCost = tempRoot.getNodesWithWeight().get(node) + curCost;
            if(node.getCost() > newCost){
                node.setCost(newCost);
                findShortestPath(node, newCost);
            }
        }
    }



}
