import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class Photoalbumtest {
    
   PhotoAlbum photoAlbum;
    int [] numberOfPagesInAlbum;

    @Before
	public void setUP() {
        numberOfPagesInAlbum = new int[10];
        photoAlbum = new PhotoAlbum();
    }
    
    @Test
    public void shouldReturnNameOfAlbum(){
       photoAlbum.setName("My Trip to New York");
        assertEquals("My Trip to New York", photoAlbum.getName());
    }

    @Test
    public void shouldReturnTheNumberOfPagesInAlbum(){
        assertEquals(10, numberOfPagesInAlbum.length);
    }

}
