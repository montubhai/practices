package com.distance;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Nodes> nodes = new HashSet<>();

    public void addNode(Nodes nodeA) {
        nodes.add(nodeA);
    }

    public Set<Nodes> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Nodes> nodes) {
        this.nodes = nodes;
    }


}
