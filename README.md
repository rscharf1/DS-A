# Data Structures  
- ArrayList
- Linked List  
- Stack  
- Queue  
- HashMap
- HashSet   
- PriorityQueue

#### ArrayList  
> Different from a normal array in that it has a dynamic size  
> When the array needs more space, a new array that is double the original size is created  
> Creates new array, copies existing elements, add new element
> May contain empty spaces so the space complexity might not be the best     

|Operation       	 |Time Complexity|
|--------------------|---------------|
|.add(element)       |O(1): amortized|
|.add(index, element)|O(n)			 |                
|.get(index)   		 |O(1)			 |
|.remove(element)	 |O(n)			 |
|.indexOf(element)   |O(n)			 |
|.contains(element)  |O(n)			 |
|.size()			 |O(1)			 |

#### Linked List  
> Elements are stored as a list of nodes  
> Starting at the root, each node has a value and a pointer to the next node  
> Never contains empty nodes so the space complexity is better than an ArrayList  
  
|Operation       	 |Time Complexity|
|--------------------|---------------|
|.add(element)       |O(1)			 |              
|.get(element)   	 |O(n)			 |
|.remove()	 		 |O(1)			 |
|.contains(element)  |O(n)			 |
|.size()			 |O(1)			 |

#### Stack  
> Last In First Out (LIFO)  
> Think of a stack of plates, where the top of the stack is the last element added and the first element to get pulled off of the stack   

|Operation       	 |Time Complexity|
|--------------------|---------------|
|.push(element)      |O(1)			 |              
|.pop()   	 		 |O(1)			 |
|.peek()			 |O(1)			 |
|.isEmpty()	 		 |O(1)			 |
|.size()			 |O(1)			 |

#### Queue  
> First In First Out (FIFO)  
> Think about a line, where the person who entered first is also the first to get off of the line 

|Operation       	 |Time Complexity|
|--------------------|---------------|
|.add(element)       |O(1)			 |              
|.remove()   	 	 |O(1)			 |
|.peek()			 |O(1)			 |
|.isEmpty()	 		 |O(1)			 |
|.size()			 |O(1)			 |

#### HashMap
> Implemented with an array full of LinkedLists  
> A LinkedList is at each index of the array, and may be implemented differently depending on how collisions are handled
> Each element has a key and a value  
> The key is used to place/find the element at the correct index of the array using a hash function  
> The value is the actual data being stored  

|Operation       	  |Time Complexity|
|-------------------- |---------------|
|.put(key, index)     |O(1)			 |              
|.get(key)   	 	  |O(1)			 |
|.remove(key)		  |O(1)			 |
|.containsKey(key)	  |O(1)	         |
|.containsValue(value)|O(n)			 |
|.isEmpty()	 		  |O(1)			 |
|.size()			  |O(1)			 |

#### HashSet
|Operation       	  |Time Complexity|
|-------------------- |---------------|
|.add(element)        |O(1)			 |              
|.remove(element)	  |O(1)			 |
|.contains(element)	  |O(1)	         |
|.isEmpty()	 		  |O(1)			 |
|.size()			  |O(1)			 |

#### PriorityQueue
> When elements are added or removed, they are reordered after each operation  

|Operation       	  |Time Complexity|
|-------------------- |---------------|
|.add(element)        |O(log n)		  |              
|.poll()	  		  |O(1)			  |
|.contains(element)	  |O(n)	          |
|.remove()	 		  |O(log n)		  |
|.isEmpty()			  |O(1)			  |
|.size()			  |O(1)			  |

# Algorithms
- Binary Search - O(log n)