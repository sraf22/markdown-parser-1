import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test 
    public void testfile1() throws IOException{
        Path fileName = Path.of("./test-file.md");
        String ActualContent = Files.readString(fileName);
        List<String> ExpectedContent = List.of("https://something.com", "some-thing.html");
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }
    

}