import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    Tree myTree = new Tree();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getRoot() {
    }

    @Test
    public void find() {
    }

    @Test
    public void insert() {
        TreeTest test = new TreeTest();
        myTree.insert(0, 5555);
        //TreeTest val = new TreeTest();
        assertEquals("GOOD", myTree.find(1, myTree.getRoot()), null);
    }

    @Test
    public void printTree() {
    }
}