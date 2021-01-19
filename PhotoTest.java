import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PhotoTest{

    Photo photo;

@Before
public void setUp() {
    photo  = new Photo();
}

@Test
public void shouldReturnLocationWherePhotoWasTaken() {
    photo.setLocation("London");
  assertEquals("London", photo.getLocation() );
}
}
