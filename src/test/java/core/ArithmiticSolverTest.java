package core;

import junit.framework.TestCase;

public class ArithmiticSolverTest extends TestCase {

	public void TestAdd() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEqual(4, solver.add(2,2));
	}
	
	public void TestSubtract() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEqual(2, solver.subtract(4,2));
		
	}
	
	public void TestMultiply() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEqual(16, solver.multiply(8,2));
		
	}
	
	public void TestDivide() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEqual(3, solver.divide(9,3));
		
	}
	
	public void TestModules() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEqual(1, solver.modules(5,2));
		
	}
}
