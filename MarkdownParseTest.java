import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(11, 1 + 1);
    }

    @Test 
    public void testfile1() throws IOException{
        Path fileName = Path.of("./test-file.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
        ExpectedContent.add("https://something.com");
        ExpectedContent.add("some-thing.html");
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }
    
    @Test 
    public void testfile2() throws IOException{
        Path fileName = Path.of("./test-file2.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
        ExpectedContent.add("https://google.com");
        ExpectedContent.add("some-thing.html");
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }

    @Test
    public void testfile3() throws IOException{
        Path fileName = Path.of("./test-file3.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
        ExpectedContent.add("more text here");
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }

    @Test
    public void testfile4() throws IOException{
        Path fileName = Path.of("./test-file4.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }
    
     
    @Test 
    public void testfile5() throws IOException{
        Path fileName = Path.of("./test-file5.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
        ExpectedContent.add("page.com");
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }

    @Test 
    public void testfile6() throws IOException{
        Path fileName = Path.of("./test-file6.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
        ExpectedContent.add("page.com");
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }

    @Test
    public void testfile7() throws IOException{
        Path fileName = Path.of("./test-file7.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }
    @Test
    public void testfile8() throws IOException{
        Path fileName = Path.of("./test-file8.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
        ExpectedContent.add("a link on the first line");
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }

    @Test
    public void testSpaceAndImageinLink() throws IOException{
        Path fileName = Path.of("../markdown-parser/space-in-link-and-image-in-link.md");
        String ActualContent = Files.readString(fileName);
        ArrayList<String> ExpectedContent = new ArrayList<>();
        ExpectedContent.add("b.com");
        ExpectedContent.add("an-image.jpeg");
        ExpectedContent.add("a-link.html");
	    assertEquals(MarkdownParse.getLinks(ActualContent), ExpectedContent);
    }




}