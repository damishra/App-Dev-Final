import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
	EdgeField testObj;

	@Before
	public void setUp() throws Exception {
	testObj = new EdgeField("1|testname");
	runner();
	}

	public void runner(){
	testgetNumFigure();
	testgetName();
	testgetTableID();
	testsetTableID();
	testgetTableBound();



	}


	@Test
	public void testgetNumFigure(){
		assertEquals("numFigure was intialized to 1 so it should be 1",1,testObj.getNumFigure());
	}

	@Test
	public void testgetName(){
		assertEquals("Name was intialized to testname","testname",testObj.getName());
	}

	@Test
	public void testgetTableID(){
		testObj.setTableID(0);
		assertEquals("TableID should be 0",0,testObj.getTableID());
	}

	@Test
	public void testsetTableID(){
		testObj.setTableID(1);
		assertEquals("TableID should be what you set it to",1,testObj.getTableID());
	}

	@Test
	public void testgetTableBound(){
		assertEquals("TableBound should be 0",0,testObj.getTableBound());
	}

	@Test
	public void testsetTableBound(){
		testObj.setTableBound(1);
		assertEquals("TableBound should be what you set it to",1,testObj.getTableBound());
	}

	@Test
	public void testgetFieldBound(){
		assertEquals("FieldBound should be 0",0,testObj.getFieldBound());
	}

	@Test
	public void testsetFieldBound(){
		testObj.setFieldBound(1);
		assertEquals("FieldBound should be what you set it to",1,testObj.getFieldBound());	
	}
	
	@Test
	public void testgetDisallowNull(){
		assertEquals("DisallowNull should be false",false,testObj.getDisallowNull());	
	}
	
	@Test 
	public void testsetDisallowNull(){
		testObj.setDisallowNull(true);
		assertEquals("DisallowNull should be what you set it to",true,testObj.getDisallowNull());
	}

	@Test
	public void testgetIsPrimaryKey(){
		assertEquals("IsPrimaryKey should be false",false,testObj.getIsPrimaryKey());
	}

	@Test
	public void testsetIsPrimaryKey(){
		testObj.setIsPrimaryKey(true);
		assertEquals("IsPimaryKey should be what you set it to",true,testObj.getIsPrimaryKey());
	}
 
	@Test
	public void testgetDefaultValue(){
		assertEquals("DefaultValue should be Null","",testObj.getDefaultValue());
	}

	@Test
	public void testsetDefaultValue(){
		testObj.setDefaultValue("Hi");
		assertEquals("DefualtValue should be what you set it to","Hi",testObj.getDefaultValue());
	}

	@Test
	public void testgetDataType(){
		assertEquals("DataType should be 0",0,testObj.getDataType());
	}

	@Test
	public void testsetDataType(){
		testObj.setDataType(1);
		assertEquals("DataType should be what you set it to",1,testObj.getDataType());
	}
	
}
