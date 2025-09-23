package app15;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);

        System.out.println("Граф після додавання вершин і ребер:");
        graph.printGraph();

        System.out.println("\nЧи існує вершина 2? " + graph.hasVertex(2));
        System.out.println("Чи існує вершина 5? " + graph.hasVertex(5));
        System.out.println("Чи існує ребро (1, 3)? " + graph.hasEdge(1, 3));
        System.out.println("Чи існує ребро (2, 5)? " + graph.hasEdge(2, 5));

        graph.removeVertex(2);
        System.out.println("\nГраф після видалення вершини 2:");
        graph.printGraph();

        graph.removeEdge(1, 3);
        System.out.println("\nГраф після видалення ребра (1, 3):");
        graph.printGraph();
    }
}

