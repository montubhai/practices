package com.distance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Nodes {

    private String name;

    private List<Nodes> shortestPath = new LinkedList<>();

    private Integer distance = Integer.MAX_VALUE;

    Map<Nodes, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(Nodes destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public Nodes(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Nodes> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Nodes> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<Nodes, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Nodes, Integer> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }
}
