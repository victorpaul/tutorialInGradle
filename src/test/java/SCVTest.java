import org.junit.Test;
import readcsv.MyCSVReader;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SCVTest {

    @Test
    public void method1() throws IOException {
        //int amountOfLineInCSV = MyCSVReader.method1("C:\\Users\\victor\\Downloads\\convertcsv.csv", ",");
        //assertEquals(102, amountOfLineInCSV);
    }

    @Test
    public void method2() throws IOException {
        int amountOfLineInCSV = MyCSVReader.method2("C:\\Users\\victor\\Downloads\\convertcsv.csv");
        assertEquals(102, amountOfLineInCSV);
    }

    @Test
    public void method3() throws IOException {
        int amountOfLineInCSV = MyCSVReader.method3("C:\\Users\\victor\\Downloads\\newfile.csv", '\t');
        assertEquals(5, amountOfLineInCSV);
    }
}
