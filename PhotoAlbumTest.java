import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class PhotoAlbumTest {
    
   PhotoAlbum photoAlbum;

    @Before
	public void setUP() {
        photoAlbum = new PhotoAlbum(10);
    }
    
    @Test
    public void shouldReturnNameOfAlbum(){
       photoAlbum.setName("My Trip to New York");
        assertEquals("My Trip to New York", photoAlbum.getName());
    }

    @Test
    public void shouldReturnTheNumberOfPagesInAlbum(){
        assertEquals(10, photoAlbum.getNumberOfPagesInAlbum());
    }

    @Test
    public void shouldBeAbleToAddAnotherPageToTheAlbum(){
        photoAlbum.add(new Page(10));
        assertEquals(11, photoAlbum.getNumberOfPagesInAlbum());
    }

    @Test
    public void shouldBeAbleToMovePhotoFromOnePageToAnother(){

        Page page0 = new Page(1);
        Page page1 = new Page(0);
        photoAlbum = new PhotoAlbum(Arrays.asList(page0, page1));
        photoAlbum.movePhotoBetweenPages(0, 0, 1);
        assertEquals(0, page0.getNumberOfPhotosInPage());
        assertEquals(1, page1.getNumberOfPhotosInPage());
    }

}
