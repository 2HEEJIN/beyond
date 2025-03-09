package com.beyond.graph;

import com.beyond.graph.practice.LinkedListGraph;
import com.beyond.graph.practice.MatrixGraph;

public class Application {
    public static void main(String[] args) {
        // 인접 행렬 테스트
        MatrixGraph matrixGraph = new MatrixGraph(4);

        // addEdge() 메소드
        matrixGraph.addEdge(0, 1, 30);
        matrixGraph.addEdge(0, 2, 20);
        matrixGraph.addEdge(1, 2, 50);
        matrixGraph.addEdge(2, 3, 70);

        System.out.println(matrixGraph);
        System.out.println();

        // removerEdge() 메소드
        matrixGraph.removeEdge(0, 1);

        System.out.println(matrixGraph);
        System.out.println();

        // 인접 리스트 테스트
        LinkedListGraph linkedListGraph = new LinkedListGraph(4);

    }
}
