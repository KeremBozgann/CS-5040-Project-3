import student.TestCase;

/**
 * @author {Your Name Here}
 * @version {Put Something Here}
 */
public class RectangleDBTest extends TestCase {
    /**
     * Sets up the tests that follow. In general, used for initialization
     */
    public void setUp() {
        // Nothing Here
    }

    /**
     * Get code coverage of the class declaration.
     */
    public void testRInit() {
        RectangleDB manager = new RectangleDB();
        assertNotNull(manager);
        RectangleDB.main(null);
    }
}
