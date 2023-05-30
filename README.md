# Mosquito
This is a joke. Regardless I still suggest trying it.

# Requirements
Have Java installed.

# Usage
1. Run the program in your IDE or from the command line.
2. The methods and classes are quite self explanatory. 
3. Look at the code.
4. For the most favorable experience use command line.
5. Open a terminal at the location of the folder src.
6. Type: javac GiantMosquito.java
7. Type: java GiantMosquito
8. Let the mosquito annoy you.
9. When enough annoyance is caused, you can get rid of it with ctrl-c.
10. Get the stats! (mosquito's lifespan )

# Design Patterns Used
* Template Method: The AbstractTemplateGenerator class defines the overall structure of the graph generation algorithm and delegates getSizeOfGraph hook method to be implemented by the subclasses.
* Union-Find: The UnionFind data structure is used for the MST calculation algorithm.
* Model-View-Controller (MVC): The program uses the MVC design pattern to separate concerns between the model (graph), user interface (CLI)/ controller (main program logic) and the view.
* Strategy: The program lets the user choose the type of generator at runtime through CLI.

## The inspiration:
![Real Big Mosquito](mosquito.gif)


## Future plans
None, really
