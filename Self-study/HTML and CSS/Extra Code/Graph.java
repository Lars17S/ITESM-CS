import java.util.*;
import java.lang.*;
import java.io.*;

class Graph {


  class Edge implements Comparable<Edge> {
    int src, dest, weight;
    //Comparator function used for sorting edges
    // based on their weight
    public int compareTo(Edge compareEdge) {
      return this.weight-compareEdge.weight;
    }
  }; // semicolon end of class

  // Create class to represent a subset for union-find
  class subset {
    int parent, rank;
  };

  int V, E; //V-> no. of vertices & E->no. of edges
  Edge edge[]; // collection of all edges

  // Creates a graph with V vertices and E edges
  Graph(int v, int e) {
    V = v;
    E = e;
    edge = new Edge[E];
    for (int i = 0; i < e; ++i)
      edge[i] = new Edge();
  }

  //A utility function to find set of an element if
  // (uses path compression technique)
  int find(subset subsets[], int i) {

    //find root and make root as parent of i (path compression recursive)
    if (subsets[i].parent != i)
      subsets[i].parent = find(subsets, subsets[i].parent);

      return subsets[i].parent;
  }

  void union (subset subsets[], x, y) {


  }

  // The main function to construct MST using Kruskal's algorithm
  void KruskalMST() {
    Edge result[] = new Edge[V]; // This will store the resultant KruskalMST
    int e = 0; // An index variable, used for result[]
    int i = 0; // An index variable, used for sorted edges
    for (int i = 0; i < V; ++i) // WHY V, IT WORKS WITH V - 1. CHECK (?)
      result[i] = new Edge(); // Will store the edges in the KruskalMST

    // Step 1: Sort all edges in non-decreasing order of their
    // weight. If we are not allowed to change the given graph, we
    // can create a copy of array of edges
    Arrays.sort(edge);

    // Allocate memory for creating V subsets
    subset subsets[] = new subset[V];
    for (int i = 0; i < V; ++i)
      subsets[i] = new subset();

    // Create V subsets with single elements (0, 1, 2, 3)
    for (int v = 0; v < V; ++v) {
      subsets[i].parent = v;
      // Because at the beginning all subsets has rank 0, only has one element
      subsets[i].rank = 0;
    }
    i = 0; // Index used to pick next edge

    // Number of edges to be taken is equal to V - 1
    while (e < V - 1) {
      //Step 2: Pick the smallest edge. And increment
      // the index for next iteration
      Edge next_edge = new Edge();
      // First take the edge[i], then increment i + 1
      // First iteration is for edge[i], i = 0
      next_edge = edge[i++];

      int x = find(subsets, next_edge.src);
      int y = find(subsets, next_edge.dest);

      if(x != y) {
        union(subsets, x, y);
      }
    }
  }

  public static void main (String args[]) {

    /* Let us create following weighted graph
                 10
            0--------1
            |  \     |
           6|   5\   |15
            |      \ |
            2--------3
                4       */
    int V = 4; // Number of vertices in graph
    int E = 5; // Number of edges in graph
    Graph graph = new Graph(V, E);

    // add edge 0 - 1
    graph.edge[0].src = 0;
    graph.edge[0].dest = 1;
    graph.edge[0].weight = 10;

    // add edge 0 - 2
    graph.edge[1].src = 0;
    graph.edge[1].dest = 2;
    graph.edge[1].weight = 6;

    // add edge 0 - 3
    graph.edge[2].src = 0;
    graph.edge[2].dest = 3;
    graph.edge[2].weight = 5;

    // add edge 1 - 3
    graph.edge[3].src = 1;
    graph.edge[3].dest = 3;
    graph.edge[3].weight = 15;

    // add edge 2 - 3
    graph.edge[4].src = 2;
    graph.edge[4].dest = 3;
    graph.edge[4].weight = 4;

    graph.KruskalMST();
  }
}
