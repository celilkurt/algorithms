package graphs.entity;

import java.util.HashMap;

public class WeightedGraphNode {

    private String label;
    private HashMap<WeightedGraphNode,Integer> nodesWithWeight;
    private int cost;

    public WeightedGraphNode(String label){

        nodesWithWeight = new HashMap<>();
        this.label = label;
        cost = Integer.MAX_VALUE;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public HashMap<WeightedGraphNode, Integer> getNodesWithWeight() {
        return nodesWithWeight;
    }

    public void setNodesWithWeight(HashMap<WeightedGraphNode, Integer> nodesWithWeight) {
        this.nodesWithWeight = nodesWithWeight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {

        String str = "Label: " + label + " cost: " + cost + "\n"
                + "Connect with,\n";
        for(WeightedGraphNode node: nodesWithWeight.keySet())
            str += node.getLabel() + " -> " + nodesWithWeight.get(node) + " ";
        return str;
    }
}
