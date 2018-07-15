# Graph data structre and algorithms used on it.

## What is it?

## Applications that use graphs.


1- Google Maps. Various locations are represented as vertices and the roads are represented as edges. They used graph theory a lot.

2- Facebook users. Each user is represented as a vertex.


3- Recommendations on e-commerce websites uses graph theory to recommend items od similar types to user's choice.

4- Transportation networks.

5- Computer network.

###  MCS tutorials.

- Concepts

1- Graph properties.

2- Edge lists.

3- Adjacency matrix.

4-Adjacency List.

5- Weighted graphs.

6- Graph Traversal algorithms.

7- Topological sort.

8- Shortest path

9- Currency exchange

10- Dijkstra's

11- Network building.

12- Kruskal's



#### Graph properites.


Graphs are represented using this notation.

<code>G=(V,E)</code>, where V represent.

- Cardinality: it is an integer number that represents that number of edges this vertex has.

- Self-loop: it is an edge which goes and points to the same vertex.

* Example: browser refresh button.

- Multi-edge: If a vertex has more than one edge going to the same vertex, then this is a multi-edge graph (sometimes it is referred to as a parallel edges) .

* Example: When we have flights going from one city to another city. Each edge represent the airline company.



#### What is a simple graph,

A simple graph is a graph without any self-loops, or multi-edges.

<code> How many edges in a simple graph? </code>


The answer is depends on the type of a graph.

Types are:

1- Directed graphs.

2- Undirected graphs.



1- It is a graph that has an order-paired: (a,b) != (b,a)


2- It is a graph that has unordered-pairs. (a,b) == (b,a)


so, if the graph is directed, then the number of edges: n(n-1)


If a graph is undirected, then the number of edges: n(n-1)/2



- Simple path: A path in a graph is a simple path if there are no edges/vertices repeated in the path.


- Walk: If you repetition is possible.


- Trail: This is  a walk in which no edges are repeated (vertices can be repeated)



- Strongly connected graph: If there is a path from any vertex to ANY other vertex in the graph.  


## Graph cycles:

*  closed walk.

- Walk is called a closed walk if it starts and ends at same vertex. e.g. trees

- Simple cycle: No repetition other than starting/ending vertices.  

- Asyclic graph: It is  graph that has no cycle.


Directed-Acyclic-Graph or (DAG): it is a graph with no cycles.


## Graph representations: Edge list implementation.


The way we implement graphs is by creating a class that represent an edge classes.


```cpp
class Edge {
  string startVertex ;
  string endVertex;
  int weight;
  // This is only added if edges have weights.
}
string vertex_list[MAX_SIZE]; // This is the

Edge edge_list[MAX_SIZE];
```


- Time complexity and space.


Space complexity is : O(|V| + |E|)

Some tasks that can be operations"


1- Finding if two nodes are connected?

You need to traverse the edges to check that. O(|E|)


2- Finding Adjacent nodes:


You need to traverse the edges to check that. O(|E|)
