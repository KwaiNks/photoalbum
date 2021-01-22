import java.util.List;
import java.util.ArrayList;

public class Page {
    
  private List<Photo> photos;

  public Page(int numberOfPhotos){
      photos = new ArrayList<Photo>(numberOfPhotos);
for(int i = 0; i < numberOfPhotos; i++)
photos.add(new Photo());
  }

public int getNumberOfPhotosInPage() {
    return photos.size();
}

public Photo getPhoto(int positionOfPhotoOnPage){
  return photos.get(positionOfPhotoOnPage);
}

public void addPhoto(Photo photo) {
  photos.add(photo);
}

public void removePhoto(int positionOfPhotoOnPage) {
  photos.remove(positionOfPhotoOnPage);
}
}
