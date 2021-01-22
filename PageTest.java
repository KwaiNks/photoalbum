import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class PageTest{
    
   Page page;

@Before
public void setUP(){
    page = new Page(10);
}
@Test
public void shouldReturnTheNumberOfPhotosInAPage(){
    assertEquals(10, page.getNumberOfPhotosInPage());
}

@Test
public void shouldGetPhotoOnPage(){
    assertNotNull(page.getPhoto(0));
}

@Test
public void shouldBeAbleToAddPhotoToPage(){
    page.addPhoto(new Photo());
    assertEquals(11, page.getNumberOfPhotosInPage());
}

}
