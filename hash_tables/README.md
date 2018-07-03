## Hash tables

What is it?

A hash table is a data structure that maps keys to values for highly efficient lookup.

The popular implementation for it uses an array of linked lists.

We calculate the hash code which is  a function .

Note, there is a possibility that two keys will map to the same index.

This is the reason of using a linked list because we want to handle any chain that might happen.


The run time is o(N) if there is a bad collision, but sometimes we assume good implementation.


Elements

- Hash table itself: This is the array if linked list.

- Hash function: <code>hash(key)</code> which return the best possible index.


Another possible solution for this huge size of array we might end up with, is we can use a balanced binary search tree. This will give us o(log n)
