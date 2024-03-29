# Algorithms

Quick Find. 

Bunun əsas məğzi ilk öncə təkrarlanan valueları yəni indexlərin bağlı olduqları valueları götürürsən. Sonra bu götürdüklərini başlanğıc root kimi təyin edib, şaxələnməyi başladırsan.
Təkrarlanan dəyəri root olaraq yazıb ona bərabər digər value ların bağlı olduğu index nömrələrini altdan yazıb birləşdirirsən. Növbəti yaranan alt rootları əsas kimi götürüb arrayda ona bərabər valueların indexlərini altına yazırsan.
Bu şəkildə arrayin rooting işləmi ilk olaraq aparılır.

![quick_find](https://user-images.githubusercontent.com/26926048/175805490-4548d3a3-6675-446b-b43d-b1dd7220244d.PNG)
![exam](https://user-images.githubusercontent.com/26926048/175805640-bed10817-90a9-431d-a828-8765441c9a69.PNG)

### Weighted quick-union demo

![Weighted quick-union demo](https://user-images.githubusercontent.com/26926048/175805784-a3bd6a90-8d57-4bb6-bc74-7441d6f6c4d2.PNG)

Quick-union and weighted quick-union example
![Quick-union and weighted quick-union example](https://user-images.githubusercontent.com/26926048/175805878-a344f71e-93a7-4d70-96b9-66864f500e73.PNG)


![Common_rules](https://user-images.githubusercontent.com/26926048/175981914-4ea9dad6-7382-4e4e-ab42-80a74b7935fd.PNG)

![Practical implications of order-of-growth](https://user-images.githubusercontent.com/26926048/175983266-6b932af7-95b9-4fd5-b5fe-1c265001b428.PNG)


Kompyuter elmlərində istifadə olunan qarışıq siniflər 5 ədəddir.
<ul>
<li>Kiçik-o (small-o)</li>
<li>Böyük-O (big-o, veya big-oh diye de geçer)</li>
<li>Teta (Theta Θ, sadece büyük tetadan bahsedebiliz)</li>
<li>Böyük omega (big-Ω )</li>
<li>Kiçik omega(small-ω )</li>
</ul> 

Commonly-used notations in the theory of algorithms

![2](https://user-images.githubusercontent.com/26926048/176417364-8c4c913d-2bef-4b05-8c6f-4b22350af43f.PNG)


Binary Search
Binary Search Algorithm can be implemented in two ways which are discussed below.

Iterative Method
Recursive Method
The recursive method follows the divide and conquer approach.

The general steps for both methods are discussed below.

Min Heap and Max Heap:
Max-heap strukturunda kökdə duran element istənilən halda həm sağ, həm də sol budaqdakı elementdən böyük (bərabər) olmalıdır. Min-heap strukturunda isə bunun tərsidir, kökdə duran element istənilən halda həm sağ, həm də sol budaqdakı elementdən kiçik (bərabər) olmalıdır. 
![Min-heap_and_Max-heap](https://user-images.githubusercontent.com/26926048/177139036-13b8dedd-e3fe-438a-a6f8-042e1e7d5cf3.PNG)



Traverse Binary Search Tree
<ol>
<li>Inorder (Left, Root, Right)</li>
<li>Preorder (Root, Left, Right)</li>
<li>Postorder (Left, Right, Root)</li>
</ol>




![binary-search-tree-all-traversals-explain](https://user-images.githubusercontent.com/26926048/177148504-a298aa5f-8f37-402a-8e91-a49bfb7adcd0.jpg)



![binary-search-tree-traversals](https://user-images.githubusercontent.com/26926048/177154565-e45f5af8-0f0d-4167-9985-d7f973f4bbf1.jpg)



Recursion in Java
Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself is called recursive method.



# Complexity Classes

In computational complexity theory, a complexity class is a set of computational problems of related resource-based complexity. The two most commonly analyzed resources are time and memory.

In general, a complexity class is defined in terms of a type of computational problem, a model of computation, and a bounded resource like time or memory. In particular, most complexity classes consist of decision problems that are solvable with a Turing machine, and are differentiated by their time or space (memory) requirements. For instance, the class P is the set of decision problems solvable by a deterministic Turing machine in polynomial time. There are, however, many complexity classes defined in terms of other types of problems (e.g. counting problems and function problems) and using other models of computation (e.g. probabilistic Turing machines, interactive proof systems, Boolean circuits, and quantum computers).

![Complexity_subsets_pspace svg](https://user-images.githubusercontent.com/26926048/177935916-9325091f-7e12-4dec-9ee3-0726d97b753c.png)


# MurmurHash Algorithm
MurmurHash is a non-cryptographic hash function suitable for general hash-based lookup.It was created by Austin Appleby in 2008 and is currently hosted on GitHub along with its test suite named 'SMHasher'. It also exists in a number of variants, all of which have been released into the public domain. The name comes from two basic operations, multiply (MU) and rotate (R), used in its inner loop.

Unlike cryptographic hash functions, it is not specifically designed to be difficult to reverse by an adversary, making it unsuitable for cryptographic purposes.
MurmurHash (http://murmurhash.googlepages.com/) is a multiplicative hash function with a mixing step written by Austin Appleby. It aims to be a fast statistically strong hashing algorithm.

"The name, if you're wondering, comes from the simplest sequence of operations which will thoroughly mix the bits of a value - "x *= m; x = rotate_left(x,r);" - multiply and rotate. Repeat that about 15 times using 'good' values of m and r, and x will end up pseudo-randomized. Unfortunately multiply+rotate has a few major weaknesses when used in a hash function, so I used multiply+shift+xor. I liked the name Murmur better than Musxmusx, so I kept it."

MurmurHash was designed with four main goals in mind:

Distribution – Passing Chi-Square distribution tests for all keysets and bucket sizes.
Avalanche Behaviour – Maximum bias of 0.5%.
Collision Resistance – No collisions possible for 4-byte keys, no small (1- to 7-bit) differentials.
Simple and Fast – As few instructions as possible, as fast as possible while remaining statistically strong.



#Floyd–Warshall algorithm

In computer science, the Floyd–Warshall algorithm (also known as Floyd's algorithm, the Roy–Warshall algorithm, the Roy–Floyd algorithm,
 or the WFI algorithm) is an algorithm for finding shortest paths in a directed weighted graph with positive or negative 
 edge weights (but with no negative cycles).[1][2] A single execution of the algorithm will find the lengths (summed weights) 
 of shortest paths between all pairs of vertices. Although it does not return details of the paths themselves, 
 it is possible to reconstruct the paths with simple modifications to the algorithm. Versions of the algorithm 
 can also be used for finding the transitive closure of a relation R, or (in connection with the Schulze voting system) 
 widest paths between all pairs of vertices in a weighted graph.
