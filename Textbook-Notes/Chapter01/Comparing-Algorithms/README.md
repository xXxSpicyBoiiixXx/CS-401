# Comparing Algorithms: Order of Growth Analysis 

* Sequential Search: Starts from the lowest value and just increments by one to achieve the number, value, or object. 

* Best Case Complexity: This represents the fewest number of steps that an algorithm can take. We don't want to choose an algorithm due to its best case complecity an then hope we get lucky in terms of the inputed conditions. 

* Average Case Complexity: Repesents the average number of steps required, considering all possible inputs. Average case complexity analusis can be useful but it is often difficult to define for a specific algorithm. 

* Worst Case Complexity: This represents the highest number of steps that an algorithm would require. If we know that we can afford the amount of work required in the worst case then we can confidently use the algorithm under review. 

* Binary Search: You choose a number in the middle of the range and continues to do so until it finds the value you are looking for. 

* Order of Growth N: Report of the efficency. Number of steps needed.

* Selection Sort: Basically goes one by one through the array and ask each part of the array if they are smaller or larger than the previous value. 

### Common Orders of Growth 

* O(1) is called "bounded time". The amount of work is bounded by a constant value and is not dependent on the size of the problem. 

* O(log base 2 of N) "logarithmic time". THe amount of work depends on the logarithm in base 2, of the size of the problem. Algorithms that successively cut the amount of data to be processed in half at each step.

* O(N) is called "linear time" The amount of work is some constant times the size of the problem.

* O(N log base 2 of N) "NlogN time". Algorithms of this type typically invovle applying a logarithmic algorithm N times. 

* O(N^2) "quadratic time" Algorithms of this type typically involved applying a liner algortihm N times. 

* This pattern continues with time complexity as we can go one wiht O(N^2 log base 2 of N), O(N^3), O(N^3 log base 2 of N) and so on. 

* O(2^ N) is called "exponsnetial time" these algorithms are extremly costly and require more time for large problems than any of the polynomial time algorithms previoisly listed. Traveling salesperson problem. - given a set of cities and set of roads that connect some of them, plus the leght of the roads, find a route that visits every city exactly once and minimize total tavel distance. 
