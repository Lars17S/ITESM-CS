import java.util.Scanner;
/* In mathematics, two sets are said to be disjoint sets if they have no element in common, conjuntos disjuntos*/
// Rank es el máxiimo numero de elemntos en un arbol que puede llegar a abarcar un elemento parent en un arbol
// https://www.youtube.com/watch?v=ID00PMy0-vE
//  result[e++] = next_edge; increment the value after the evaluation
// https://www.geeksforgeeks.org/kruskals-minimum-spanning-tree-algorithm-greedy-algo-2/
public class Graph_2 {

  public static void main (String args[]) {
    Scanner stdIn = new Scanner(System.in);
    int v, e;
    v = 6; e = 8;
    Graph graph = new Graph(v, e);
    graph.edge[0].src = 1; //A
    graph.edge[0].dest = 3; //C
    graph.edge[0].weight = 4;

    graph.edge[1].src = 1; //A
    graph.edge[1].dest = 2; //B
    graph.edge[1].weight = 4;

    graph.edge[2].src = 2; // B
    graph.edge[2].dest = 3; // C
    graph.edge[2].weight = 2;

    graph.edge[3].src = 3; // C
    graph.edge[3].dest = 4; // D
    graph.edge[3].weight = 3;

    graph.edge[4].src = 3; // C
    graph.edge[4].dest = 5; // E
    graph.edge[4].weight = 4;

    graph.edge[5].src = 3; // C
    graph.edge[5].dest = 6; // F
    graph.edge[5].weight = 2;

    graph.edge[6].src = 4; // D
    graph.edge[6].dest = 5; // E
    graph.edge[6].weight = 3;

    graph.edge[7].src = 5; // E
    graph.edge[7].dest = 6; // F
    graph.edge[7].weight = 3;

  }

  private class Edge {// Class Edge, it represents an edge
    int src, dest, weight; //Source, destiny, weight
  }

  int V, E; //V num. of vertices and E num. of edges
  Edge[] edge; // An array of edges

  private class Set {
    int vertice;
  }



  Graph(int v, int e) {
    V = v;
    E = e;
    edge = new Edge[E];
    for (int i = 0; i < e; ++i)
      edge[i] = new Edge(); // OOP: new class() SYNTAX creates a new object
    }
}
