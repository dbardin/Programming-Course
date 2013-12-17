package ru.mai.is.tmp.students.kponomarev.Translit.src.test.java;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class testTransliterator extends TestCase {

    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        TestSuite suite = new TestSuite();
        suite.addTest(new testTransliterator("testMain"));
        runner.doRun(suite);
    }

    public testTransliterator(String testName) {
        super(testName);
    }

    public void testMain() {
        String primer = "Съешь ещё этих мягких французских булок, да выпей чаю.";
        ru.mai.is.tmp.students.kponomarev.Translit.src.main.java.Transliterator Translit = new ru.mai.is.tmp.students.kponomarev.Translit.src.main.java.Transliterator();
        //Transliterator Translit = new Transliterator()
        assertTrue(Translit.Primer(primer) == "S#esh' eshchyo etih myagkih frantsuzskih bulok, da vypei chayu.");
    }
}
