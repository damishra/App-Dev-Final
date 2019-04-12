import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
	EdgeField testObj;

	private static String param;

	public void prepare(String param) {
		EdgeFieldTest.param = param;
	}

	@Before
	public void setUp() {
		testObj = new EdgeField(param);
		runner();
	}

	public void runner(){}

	@Test
	public void testGetNumFigure(){
		assertEquals("numFigure was intialized to 1 so it should be 1",1,testObj.getNumFigure());
	}

	@Test
	public void testGetName(){
		assertEquals("Name was initialized to testname","testname",testObj.getName());
	}

	@Test
	public void testGetTableID(){
		assertEquals("TableID should be 0",0,testObj.getTableID());
	}

	@Test
	public void testGetTableBound(){
		assertEquals("TableBound should be 0",0,testObj.getTableBound());
	}

	@Test
	public void testSetTableID(){
		testObj.setTableID(1);
		assertEquals("TableID should be what you set it to",1,testObj.getTableID());
	}

	@Test
	public void testSetTableBound(){
		testObj.setTableBound(1);
		assertEquals("TableBound should be what you set it to",1,testObj.getTableBound());
	}

	@Test
	public void testGetFieldBound(){
		assertEquals("FieldBound should be 0",0,testObj.getFieldBound());
	}

	@Test
	public void testSetFieldBound(){
		testObj.setFieldBound(1);
		assertEquals("FieldBound should be what you set it to",1,testObj.getFieldBound());
	}
	
	@Test
	public void testGetDisallowNull(){
		assertEquals("DisallowNull should be false",false,testObj.getDisallowNull());
	}
	
	@Test 
	public void testSetDisallowNull(){
		testObj.setDisallowNull(true);
		assertEquals("DisallowNull should be what you set it to", true,testObj.getDisallowNull());
	}

	@Test
	public void testGetIsPrimaryKey(){
		assertEquals("IsPrimaryKey should be false",false,testObj.getIsPrimaryKey());
	}

	@Test
	public void testSetIsPrimaryKey(){
		testObj.setIsPrimaryKey(true);
		assertEquals("IsPimaryKey should be what you set it to",true,testObj.getIsPrimaryKey());
	}

	@Test
	public void testSetDefaultValue(){
		testObj.setDefaultValue("Hi");
		assertEquals("DefualtValue should be what you set it to","Hi",testObj.getDefaultValue());
	}

	@Test
	public void testGetDataType(){
		assertEquals("DataType should be 0",0,testObj.getDataType());
	}

	@Test
	public void testSetDataType(){
		testObj.setDataType(1);
		assertEquals("DataType should be what you set it to",1,testObj.getDataType());
	}
	
}
