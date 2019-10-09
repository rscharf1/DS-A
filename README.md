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
|Operation       	 |Time Complexity|
|--------------------|---------------|
|.add(element)       |O(1)			 |              
|.get(element)   	 |O(n)			 |
|.remove()	 		 |O(1)			 |
|.contains(element)  |O(n)			 |
|.size()			 |O(1)			 |

#### Stack  
|Operation       	 |Time Complexity|
|--------------------|---------------|
|.push(element)      |O(1)			 |              
|.pop()   	 		 |O(1)			 |
|.peek()			 |O(1)			 |
|.isEmpty()	 		 |O(1)			 |
|.size()			 |O(1)			 |

#### Queue  
|Operation       	 |Time Complexity|
|--------------------|---------------|
|.add(element)       |O(1)			 |              
|.remove()   	 	 |O(1)			 |
|.peek()			 |O(1)			 |
|.isEmpty()	 		 |O(1)			 |
|.size()			 |O(1)			 |

#### HashMap
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