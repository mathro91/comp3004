package core;

import junit.framework.TestCase;

public class ArithmiticSolverTest extends TestCase {

	public void TestAdd() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEquals(4.0, solver.add(2,2));
	}
	
	public void TestSubtract() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEquals(2.0, solver.subtract(4,2));
		
	}
	
	public void TestMultiply() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEquals(16.0, solver.multiply(8,2));
		
	}
	
	public void TestDivide() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEquals(3.0, solver.divide(9,3));
		
	}
	
	public void TestModules() {
		ArithmiticSolver solver = new ArithmiticSolver();
		
		assertEquals(1.0, solver.modules(5,2));
		
	}
}
