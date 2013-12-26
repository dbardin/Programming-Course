package ru.mai.is.tmp.students.dmyagkov.coursework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CourseWorkTest {

    Education testEducation;

    @Before
    public void init() {
        testEducation = new Education();
    }

    @Test
    public void testopenFileOtveti() throws IOException {
        Scanner pir = testEducation.openFile("src\\main\\resources\\Otveti.txt");
        Assert.assertNotNull(pir);
        pir.close();
    }

    @Test
    public void testopenFileSlova() throws IOException {
        Scanner fir = testEducation.openFile("src\\main\\resources\\Slova.txt");
        Assert.assertNotNull(fir);
        fir.close();
    }

    @Test
    public void testopenFiletestOtveti() throws IOException {
        Scanner pirTest = testEducation.openFile("src\\main\\resources\\testOtveti.txt");
        Assert.assertNotNull(pirTest);
        pirTest.close();
    }

    @Test
    public void testGo() throws IOException {
        testEducation.setSelector(false);
        int tg = testEducation.go();
        int tgTest = 10;
        Assert.assertEquals(tgTest, tg);
    }
}
