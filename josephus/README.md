Background: Josephus is a foster mom for dogs and spends 
her week days rescuing puppies and their moms from dog 
hoarders, and finding new homes for the puppies. The puppies 
are all equally adorable, so she gives them away in a fair 
order by choosing the kth puppy every time she finds 
a new family. Given a list of names for 
a litter of puppies, figure out which puppy is the last one to 
be chosen. Josephus makes this puppy a special biscuit treat, finds it the 
last family, and starts on another litter of puppies.

Input: a list of puppy names
Output: the last puppy to be chosen for a family

Spec: Implement CircularArrayList and CircularLinkedList to extend AbstractArrayList and AbstractLinkedList, respectively, and be used functionally as specified in the Josephus program. 

Already implemented:
 - JosephusSolver.java: this contains the main method, which is the entrypoint to your Java program. The main method contains code for running a Josephus-style iteration over circular data structures, specifically CircularArrayList and CircularLinkedList.
 - AbstractArrayList.java, AbstractLinkedList.java: abstract classes with the add(String s) method and the constructors implemented. Your CircularArrayList and CircularLinkedList will inherit from these classes
 - CircularArrayList.java, CircularLinkedList.java: the skeleton of these classes have been written for you, just so you know what the overall structure of the class should look like. You will need to replace the `throw new UnsupportedOperationException()` with your implementation code. Your code will look similar to (but slightly modified from) the basic data structure implementations in class. Remember that this is NOT a Bag, so we don't care about uniqueness at all here.
