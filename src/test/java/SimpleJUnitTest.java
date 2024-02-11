import org.junit.jupiter.api.*;

public class SimpleJUnitTest {
    int result;
    @BeforeAll
     static void BeforeAll(){
        System.out.println("### BeforeAll()\n");

    }
    @BeforeEach
    void beforeEach(){
        System.out.println("###   beforeEach()");
        result = getResult();
    }

    @AfterEach
    void AfterEach(){
        System.out.println("###   AfterEach()\n");
        result = getResult();
    }
    @AfterAll
    static void AfterAll(){
        System.out.println("### AfterAll()\n");
    }
    @Test
    void firstTest() {
        System.out.println("###   firstTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void secondTest() {
        System.out.println("###   secondTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void thirdTest() {
        System.out.println("###   thirdTest()");
        Assertions.assertTrue(result>2);
    }
    private int getResult(){
        return 3;
    }
}
