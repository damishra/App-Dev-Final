import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EdgeConvertCreateDDLTest {
    EdgeConvertCreateDDL testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new EdgeConvertCreateDDL() {
            @Override
            public String getDatabaseName() {
                return null;
            }

            @Override
            public String getProductName() {
                return null;
            }

            @Override
            public String getSQLString() {
                return null;
            }

            @Override
            public void createDDL() {

            }
        };
        runner();
    }

    public void runner() {
        testGetField();
        testGetTable();
        testGetDatabaseName();
        testGetProductName();
        testGetSQLString();
    }

    @Test
    public void testGetTable() {
        assertEquals("It is only supposed to return null as default",null,testObj.getTable(1));
    }

    @Test
    public void testGetField() {
        assertEquals("It is only supposed to return null as default",null,testObj.getField(1));
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