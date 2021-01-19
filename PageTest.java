import static org.junit.Assert.assertEquals;

import java.util.List;

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

}
