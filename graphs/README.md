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


## Graph representations: Adjacency Matrix implementation.

in Edge list implementation., we found out that there are some running times that are slow since we had to scan the whole edge list to find out some of the most performed operations on graphs.The reason is because the number of edges as we saw before can be extremely large.
something like O(v^(2)).

Now, we want to develop a faster algorithm for graphs common operations.

This approach is better is time, it optimized the previous one to to O(V).


The idea is to create a 2D array which is V*V = edges[v][v].

and then, we we store in each cell either  a 0 or a 1.

We put 1 iff two vertices are connected.


Note, if the graph has weight, then instead of 1 we wrote the weight, and instead of a zero we write an INFINITY.

Running times for the previous operations are both: O(|V|).

Note, this approach has a better run time than the previous one, but it has VERY bad space time complexity.


This approach is preferable iff the graph is dense which has no spars.


## Graph representations: Adjacency List implementation.


As we saw before, the adjacency matrix/multi- diminutional arrays. Graphs usually are sparse (less edges). So, we found out that the space was extraordinary more than in adjacency matrix which results to O(V*V), so in a social media website it will be something like 1000000000 * 1000000000 which is a lot of space.
Note, in real life no one will have a billion friend, so List adjacency list come to help us.


The idea is that we do not have to store unnecessary things like 0 (which represent no friends), we can have a a pointer to array or a linked list per cell to represents edges. This way we can remove the sparseness of this graph which made a huge space complexity.
