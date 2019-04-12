import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTableTest {
	private EdgeTable testObj;

	private static String param;

	public void prepare(String param) {
		EdgeTableTest.param = param;
	}

	@Before
	public void setUp() {
		testObj = new EdgeTable(param);
		runner();
	}

	public void runner() {}

	@Test
	public void testgetNumFigure() {
		assertEquals("NumFigure was initialized to 1 so it should be 1", 1, testObj.getNumFigure());
	}

	@Test
	public void testgetName() {
		assertEquals("Name is testname so it should testname", "testname", testObj.getName());
	}

	@Test
	public void testgetRelatedTablesArray() {
		assertEquals("There should be no related tables array", null, testObj.getRelatedTablesArray());
	}

	@Test
	public void testgetRelatedFieldsArray() {
		assertEquals("There should be no related fields array", null, testObj.getRelatedFieldsArray());
	}

	@Test
	public void testgetNativeFieldsArray() {
		assertEquals("There should be no NativeFields Array returned", null, testObj.getNativeFieldsArray());
	}
}
