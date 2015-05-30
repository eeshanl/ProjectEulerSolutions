import java.util.ArrayList;

public class ProjectEulerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Class containing all problem solutions to Project Euler Problems
		Problems problems = new Problems();
		// List storing all solutions
		ArrayList<Integer> solutionList = new ArrayList<Integer>();
		
		// Problem number 1 added 
		solutionList.add(problems.One_Sum3and5(1000));
		
		// Prints out solutions to problems in an array format
		System.out.println(solutionList);
	}

}
