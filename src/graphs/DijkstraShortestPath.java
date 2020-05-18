package graphs;

import graphs.entity.WeightedGraphNode;

import java.util.ArrayList;
import java.util.Random;

public class DijkstraShortestPath {


    public static void main(String[] args){

        WeightedGraphNode root = createSampleGraph(10);
        printGraph(root,new ArrayList<>());
        findShortestPath(root,0);
        System.out.println("\n\nAfter cal shortest path\n");
        printGraph(root,new ArrayList<>());

    }


    public static WeightedGraphNode createSampleGraph(int n){
        //n tane node oluşturulur, node'lar zincir halinde birbirlerine bağlanır ve root döndürülür.

        ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();
        WeightedGraphNode root = new WeightedGraphNode(("node" +( n+1)));

        while(n-- > 0){

            nodeList.add(new WeightedGraphNode(("node" + (n+1))));

        }

        WeightedGraphNode tempRoot = root;
        Random ran = new Random();

        for(WeightedGraphNode node: nodeList){
            tempRoot.getNodesWithWeight().put(node,ran.nextInt(20)+1);
            tempRoot = node;
        }

        tempRoot.getNodesWithWeight().put(root,ran.nextInt(20)+1);

        n = 5;
        while(n-- > 0){
            int ranIndex = ran.nextInt(nodeList.size());
            tempRoot = nodeList.get(ranIndex);
            ranIndex = ran.nextInt(nodeList.size());
            tempRoot.getNodesWithWeight().put(nodeList.get(ranIndex) ,ran.nextInt(20)+1);
        }

        return root;
    }

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
