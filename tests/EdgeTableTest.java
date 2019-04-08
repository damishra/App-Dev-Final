import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {
	private EdgeTable testObj;

	private String str;

	EdgeTableTest(String str) {
		this.str = str;
		testObj = new EdgeTable(str);
		runner();
	}

	@Before
	public void setUp() {
	}

	public void runner() {
		testgetNumFigure();
		testgetName();
	}

	@Test
	public void testgetNumFigure() {
		assertEquals("NumFigure was initialized to 1 so it should be 1", 1, testObj.getNumFigure());
	}

	@Test
	public void testgetName() {

		System.out.println(testObj.getName());assertEquals("Name is testname so it should testname", "testname", testObj.getName());
	}

	/*
	@Test
	public void testaddRelatedTables(){
		Boolean bool = false;
		testObj.addRelatedTable(1);
		if (testObj.alRelatedTables.size() > 0) {
			bool = true;
		}
		assertEquals("What ever value added to the Related Table is added",		bool);
	}*/

	@Test
	public void testgetRelatedTablesArray() {
		assertEquals("There should be no related tables array", null, testObj.getRelatedTablesArray());
	}

	@Test
	public void testgetRelatedFieldsArray() {
		assertEquals("There should be no related fields array", null, testObj.getRelatedFieldsArray());
	}

	@Test
	public void testsetRelatedField() {
		testObj.setRelatedField(0, 1);
		int[] test = testObj.getRelatedFieldsArray();
		assertEquals("IT works", 1, test);
	}

	@Test
	public void testgetNativeFieldsArray() {
		assertEquals("There should be no NativeFields Array returned", null, testObj.getNativeFieldsArray());
	}
}
