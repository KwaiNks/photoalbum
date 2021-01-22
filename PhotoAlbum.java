import java.util.List;
import java.util.ArrayList;

public class PhotoAlbum{

    String name;
    private List<Page> pages;

public PhotoAlbum(int numberOfPages){
 pages = new ArrayList<Page>(numberOfPages);
for(int i = 0; i < numberOfPages; i++)
 pages.add(new Page(10));
}

    public PhotoAlbum(Page page1, Page page2) {
        pages = new ArrayList<Page>(2);
        pages.add(page1);
        pages.add(page2);
}

	public String getName() {
    return name;
}
public void setName(String name) {
     this.name = name;
 }
public int getNumberOfPagesInAlbum() {
    return pages.size();
}

public void add(Page page){
    pages.add(page);
}

public void movePhotoBetweenPages(int positionOfPhotoOnPage, 
                    int pageCurrentlyHoldingPhoto, 
                    int pageWherePhotoWillBeMovedTo) {
    Photo photo = pages.get(pageCurrentlyHoldingPhoto)
                             .getPhoto(positionOfPhotoOnPage);
    pages.get(pageWherePhotoWillBeMovedTo).addPhoto(photo);
}
}