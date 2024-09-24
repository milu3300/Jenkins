import org.junit.Assert;
import org.junit.Test;


public class ReverseStringTests {
    ReverseString reverseString = new ReverseString();
@Test
    public void checkTrue() {
    String word = "apple";
   String result =  reverseString.reversString(word);
    Assert.assertEquals("elppa", result);
}

@Test
    public void checkFalse(){
    String word = "word1";
    String result= reverseString.reversString(word);
    Assert.assertEquals("1drow", result);
}
@Test
    public void test3(){
    String word = "true";
    String result = reverseString.reversString(word);
    Assert.assertEquals("eurt", result);
}
}
