
public class Main {
	
	public static void main(String args[]) {
    Book book=new Book("Disea Titanic");
    Author author=new Author("Radu Paul");
    book.addAuthor(author);
    int indexOfChapter=book.CreateChapter("Chapter1");
    Chapter chapt=book.getChapter(indexOfChapter);
    int indexOfSubChapter=chapt.CreateSubChapter("Chapter one");
    SubChapter Subchapt=chapt.getChapter(indexOfChapter);
    int indexParagraph=Subchapt.CreateParagraph("Paragraph");
    int indexImage=Subchapt.CreateImage("Image");
    int indexTable=Subchapt.CreateTable("Table");
    System.out.println(book.getClass());
    }
    
}
