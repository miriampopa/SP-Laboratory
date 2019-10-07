import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Book {
     private String  Title;
     private List<Chapter>listChapter=new ArrayList<Chapter>();
     public Book(String title) {Title=title;};
     public int CreateChapter(String title)
     {
  	   Chapter chp=new Chapter(title);
  	   listChapter.add(chp);
  	   return listChapter.indexOf(chp);
     }
     private List<Author>listAuthor=new ArrayList<Author>();
     public void  addAuthor(Author author)
     {
  	   
  	   listAuthor.add(author);
  	   
     }
     Chapter getChapter(int indexOfChapter)
     {
    	 return listChapter.get(indexOfChapter);
     }
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
}
