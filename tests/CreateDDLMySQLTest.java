import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreateDDLMySQLTest {
        CreateDDLMySQL testObj;

	@Before
	public void setUp() throws Exception {
        testObj = new CreateDDLMySQL();
        runner();
	}
	
	public void runner() {
		testConvertStrBooleanToInt();
		testGenerateDatabaseName();
		testGetDatabaseName();
		testGetProductName();
		testGetSQLString();
	}

	@Test
	public void testConvertStrBooleanToInt() {
		assertEquals("Value passed in was true so result should be 1",1,testObj.convertStrBooleanToInt("true"));
	}

	@Test
	public void testGenerateDatabaseName() {
		assertEquals("Default database name value is MySQLDB","MySQLDB",testObj.generateDatabaseName());
	}

	@Test
	public void testGetProductName() {
		assertEquals("Product name is MySQL","MySQL",testObj.getProductName());
    }
    
    @Test
	public void testGetDatabaseName() {
		assertEquals("After previous test, the value should be MySQLDB","MySQLDB",testObj.getDatabaseName());
    }
    
    @Test
	public void testGetSQLString() {
		assertEquals("sb was initialized as null",null,testObj.getSQLString());
	}

}