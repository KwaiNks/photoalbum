import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class Photoalbumtest {
    
    String name;
    int [] numberOfPagesInAlbum;

    @Before
	public void setUP() {
		numberOfPagesInAlbum = new int[10];
    }
    
    @Test
    public void shouldReturnNameOfAlbum(){
        name = "My Trip to New York";
        assertEquals("My Trip to New York", name);
    }

    @Test
    public void shouldReturnTheNumberOfPagesInAlbum(){
        assertEquals(10, numberOfPagesInAlbum.length);
    }

}
