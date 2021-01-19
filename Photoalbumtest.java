import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PhotoAlbumTest {
    
   PhotoAlbum photoAlbum;
    int [] numberOfPagesInAlbum = new int[10];

    @Before
	public void setUP() {
        photoAlbum = new PhotoAlbum();
    }
    
    @Test
    public void shouldReturnNameOfAlbum(){
       photoAlbum.setName("My Trip to New York");
        assertEquals("My Trip to New York", photoAlbum.getName());
    }

    @Test
    public void shouldReturnTheNumberOfPagesInAlbum(){
        assertEquals(10, photoAlbum.getNumberOfPagesInAlbum(numberOfPagesInAlbum));
    }

}
