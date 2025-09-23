package app15;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        addVertex(source);
        addVertex(destination);
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public void removeVertex(int vertex) {
        if (!adjList.containsKey(vertex)) return;

        adjList.remove(vertex);
        for (List<Integer> neighbors : adjList.values()) {
            neighbors.remove(Integer.valueOf(vertex));
        }
    }

    public void removeEdge(int source, int destination) {
        if (adjList.containsKey(source)) {
            adjList.get(source).remove(Integer.valueOf(destination));
        }
        if (adjList.containsKey(destination)) {
            adjList.get(destination).remove(Integer.valueOf(source));
        }
    }


    public boolean hasVertex(int vertex) {
        return adjList.containsKey(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return adjList.containsKey(source) && adjList.get(source).contains(destination);
    }

    public void printGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

