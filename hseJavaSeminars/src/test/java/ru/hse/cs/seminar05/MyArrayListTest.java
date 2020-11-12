package ru.hse.cs.seminar05;


import junit.framework.TestCase;
import org.junit.Before;

/*@Test – определяет что метод method() является тестовым.
@Before – указывает на то, что метод будет выполнятся перед каждым тестируемым методом @Test.
@After – указывает на то что метод будет выполнятся после каждого тестируемого метода @Test
@BeforeClass – указывает на то, что метод будет выполнятся в начале всех тестов,
а точней в момент запуска тестов(перед всеми тестами @Test).
@AfterClass – указывает на то, что метод будет выполнятся после всех тестов.
@Ignore – говорит, что метод будет проигнорирован в момент проведения тестирования.
(expected = Exception.class) – указывает на то, что в данном тестовом методе
вы преднамеренно ожидаете Exception.
(timeout = 100) – указывает, что тестируемый метод не должен занимать больше чем 100 миллисекунд.*/

public class MyArrayListTest extends TestCase {
    MyArrayList<String> list;

    public void testGet() {
        assertEquals("Hi", list.get(0));

    }

    @Before
    public void setUp() {
        list = new MyArrayList<>();
        list.put("Hi");
        list.put("Bye");
    }

    public void testPut() {

        assertEquals("Hi", list.get(0));

        assertEquals("Bye", list.get(1));
    }

    public void testSize() {
        assertEquals(2, list.size());
    }

    public void testContains() {
        assertTrue(list.contains("Hi"));
        assertFalse(list.contains("111"));
    }

    public void testClear() {
        list.clear();
        assertEquals(0, list.size());
    }

}