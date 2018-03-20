package DecisionTrees.Tree;

/**
 * Hello world!
 *
 */
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
