package com.distance;

import java.util.Arrays;
import java.util.List;

public class DijkstraAlgorithmLongRunningUnitTest {

    public static  void main(String[] a) {

        Nodes nodeA = new Nodes("A");
        Nodes nodeB = new Nodes("B");
        Nodes nodeC = new Nodes("C");
        Nodes nodeD = new Nodes("D");
        Nodes nodeE = new Nodes("E");
        Nodes nodeF = new Nodes("F");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

        List<Nodes> shortestPathForNodeB = Arrays.asList(nodeA);
        List<Nodes> shortestPathForNodeC = Arrays.asList(nodeA);
        List<Nodes> shortestPathForNodeD = Arrays.asList(nodeA, nodeB);
        List<Nodes> shortestPathForNodeE = Arrays.asList(nodeA, nodeB, nodeD);
        List<Nodes> shortestPathForNodeF = Arrays.asList(nodeA, nodeB, nodeD);

        for (Nodes node : graph.getNodes()) {
            switch (node.getName()) {
                case "B":
                    assert (node
                            .getShortestPath()
                            .equals(shortestPathForNodeB));
                    break;
                case "C":
                    assert (node
                            .getShortestPath()
                            .equals(shortestPathForNodeC));
                    break;
                case "D":
                    assert (node
                            .getShortestPath()
                            .equals(shortestPathForNodeD));
                    break;
                case "E":
                    assert (node
                            .getShortestPath()
                            .equals(shortestPathForNodeE));
                    break;
                case "F":
                    assert (node
                            .getShortestPath()
                            .equals(shortestPathForNodeF));
                    break;
            }
        }
    }

}
