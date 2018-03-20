


# Decision Tree
This is my simple approach for this assignment. Honestly, the assignment was a bit too vague to fully grasp what exactly we are required to do. My approach is only fit for this exercise. Meaning that any other conditions would not work with it.
[DecisionTree.java](https://github.com/Ekskursantas/DecisionTree/blob/master/DecisionTree.java)
```java
public String decide(boolean[] answers) {
		Main print = new Main();
		if(!answers[0])
			return print.printFalse();
		if(!answers[1]&&!answers[2])
			return print.printFalse();
		if(!answers[1]&&!answers[3])
			return print.printFalse();
		return print.printTrue();
	}
```

This is the logic behind my decision tree. As the assignment indicated. The conditions for the student to fail easily is if he does not hand-in assignments in time. Or two specific conditions fail at the same time “Attend lectures” and “Read textbook” or “Attend lectures” and “Make exercises”. If any off these three conditions fail the student will easily fail the exam. Meaning any other option will let the student pass the exam.

[Main.java](https://github.com/Ekskursantas/DecisionTree/blob/master/Main.java)
```java
public class Main 
{
    public static void main( String[] args )
    {
        DecisionTree test = new DecisionTree();
        System.out.println(test.decide(new boolean[] {true, true, true, true}));
        System.out.println(test.decide(new boolean[] {true, true, true, false}));
        System.out.println(test.decide(new boolean[] {true, true, false, false}));
        System.out.println(test.decide(new boolean[] {true, false, false, false}));
        System.out.println(test.decide(new boolean[] {false, false, false, false}));
        System.out.println(test.decide(new boolean[] {false, true, true, true}));
        System.out.println(test.decide(new boolean[] {false, false, true, true}));
        System.out.println(test.decide(new boolean[] {false, false, false, true}));
        System.out.println(test.decide(new boolean[] {false, true, false, true}));
        System.out.println(test.decide(new boolean[] {true, false, true, false}));
        System.out.println(test.decide(new boolean[] {true, false, false, true}));
        System.out.println(test.decide(new boolean[] {false, true, true, false}));
        System.out.println(test.decide(new boolean[] {true, false, true, true}));
        System.out.println(test.decide(new boolean[] {true, true, false, true}));
        System.out.println(test.decide(new boolean[] {false, true, false, false}));
        System.out.println(test.decide(new boolean[] {false, false, true, false}));
    }
    
    public String printTrue()
    {
    	return "You should be able to pass the exam";
    }
    
    public String printFalse()
    {
    	return "You could easily fail the exam";
    }
}
```
This is the main class where I test all possible cases in our case there are 16 possible combinations. 
 - The boolean array consists of four values:
	 - The first input is: “Hand ins made in time”
	 - The second input is: “Attend lectures” 
	 - The third input is: “Read textbook”
	 - The forth input is: “Make exercises”
#### After thoughts
There are various different ways to approach this assignment: Arrays, Binary Trees, Dictionaries and etc. and I believe the best option in the end is the one with the fasted runtime. As I only did this one algorithm I could not measure the difference between different approaches. However, I believe that this approach in bigger decision trees would be quite fast but the size of it would be massive which would be definitely something easily readable and understandable.
