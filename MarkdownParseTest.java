import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinksTester() throws IOException {
        Path filePath = Path.of("/Users/winniechen/Documents/GitHub/markdown-parse/test-file.md");
        // have direct path because when you use junit, it changes the directory you are in
        String contents = Files.readString(filePath);
        assertEquals(MarkdownParse.getLinks(contents), new ArrayList<String>(List.of("https://something.com", "some-page.html")));
    }
}