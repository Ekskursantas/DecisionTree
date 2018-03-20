package DecisionTrees.Tree;

public class DecisionTree {

	// 0 Hand-ins made in time
	// 1 Attend lectures
	// 2 Read textbook
	// 3 Make exercises
	
	
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
}
