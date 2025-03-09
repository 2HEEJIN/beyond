package com.beyond.graph.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedListGraph {
    private int numVertices;

    List<List<Edge>> Vertices;

    public LinkedListGraph(int numOfVertices) {
        this.numVertices = numOfVertices;
        this.Vertices = new LinkedList<>();
    }

    private static class Edge {
        private int vertex;

        private int weight;

        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
}
