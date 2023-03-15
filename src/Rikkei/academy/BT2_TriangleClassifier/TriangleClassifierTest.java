package Rikkei.academy.BT2_TriangleClassifier;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/main/resources/data.csv",numLinesToSkip = 1)
    public  void test(int a, int b, int c, String result){
        TriangleClassifier triangle=new TriangleClassifier();
        assertEquals(triangle.triangleSide(a,b,c),result);
    }

}
