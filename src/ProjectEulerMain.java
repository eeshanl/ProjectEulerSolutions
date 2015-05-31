import java.util.ArrayList;

public class ProjectEulerMain {

	public static void main(String[] args) {
		
		// Problems class containing all problem solutions to Project Euler Problems
		Problems problems = new Problems();
		
		// List storing all solutions
		ArrayList<Integer> solutionList = new ArrayList<Integer>();

		// Adding solutions to the list to later print out
		addSolns(problems, solutionList);

		// Prints out solutions to problems in an array format
		printSoln(solutionList);
		
	}
	
	// Prints the solutions
	public static void printSoln(ArrayList<Integer> soln) {
		for (int i = 0; i < soln.size(); i++) {
			System.out.println("The solution to problem number " + (i+1) + " is " + soln.get(i) + ".");
		}
	}
	
	// Adds solutions to the solution list
	public static void addSolns(Problems problems, ArrayList<Integer> solutionList) {
		solutionList.add(problems.One(1000));
		solutionList.add(problems.Two());
	}

}
