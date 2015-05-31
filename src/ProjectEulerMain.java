import java.util.ArrayList;

public class ProjectEulerMain {

	public static void main(String[] args) {
		// Problems class containing all problem solutions to Project Euler Problems
		Problems problems = new Problems();
		// List storing all solutions
		ArrayList<Integer> solutionList = new ArrayList<Integer>();

		// Problem number 1 added
		solutionList.add(problems.One(1000));
		solutionList.add(problems.Two());

		// Prints out solutions to problems in an array format
		printSoln(solutionList);
	}
	
	public static void printSoln(ArrayList<Integer> soln) {
		for (int i = 0; i < soln.size(); i++) {
			System.out.println("The solution to problem number " + (i+1) + " is " + soln.get(i) + ".");
		}
	}

}
