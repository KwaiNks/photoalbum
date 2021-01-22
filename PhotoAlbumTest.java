import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class PhotoAlbumTest {
    
   PhotoAlbum photoAlbum;
   Page page0;
   Page page1;

    @Before
	public void setUP() {
        photoAlbum = new PhotoAlbum(10);
        page0 = new Page(1);
        page1 = new Page(0);
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


    // This is the BIG end to end test describing what we are trying to achieve
    @Test
    public void shouldBeAbleToMovePhotoFromOnePageToAnother(){

        // Arrange the test with test data
        photoAlbum = new PhotoAlbum(Arrays.asList(page0, page1));

        // Act- perform the operation under test
        photoAlbum.movePhotoBetweenPages(0, 0, 1);

        // Assert that the state is now as expected
        assertEquals(0, page0.getNumberOfPhotosInPage());
        assertEquals(1, page1.getNumberOfPhotosInPage());
    }


    // This is setting up the next test for Richmond
    @Test
    public void shouldBeAbleToRemoveAllPagesFromAnAlbumWithTenPages(){

        //TODO
    }

}
