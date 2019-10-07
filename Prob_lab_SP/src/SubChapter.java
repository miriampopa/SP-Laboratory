import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SubChapter {
   public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
private String Title;
   public SubChapter(String title){Title=title;};
   private List<Paragraph>listParagraph=new ArrayList<Paragraph>();
   private List<Image>listImage=new ArrayList<Image>();
   private List<Table>listTable=new ArrayList<Table>();
   public int CreateParagraph(String title)
   {
	   Paragraph chp=new Paragraph(title);
	   listParagraph.add(chp);
	   return listParagraph.indexOf(chp);
   }
   public int CreateImage(String title)
   {
	   Image chp=new Image(title);
	   listImage.add(chp);
	   return listImage.indexOf(chp);
   }
   public int CreateTable(String title)
   {
	   Table chp=new Table(title);
	   listTable.add(chp);
	   return listTable.indexOf(chp);
   }
   
}
