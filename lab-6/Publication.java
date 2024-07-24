class Book{
	 private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

	 public void displayPublication() {
        System.out.println("Author: " + authorName);
    }

}
class BookPublication extends Book{
	private String title;

	 public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

	public void displayPublication(){
		System.out.println("---------------Book detail------------------");
		super.displayPublication();
        System.out.println("Title: " + title);
	}

}
class PaperPublication extends Book {
	private String title;

	public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

	public void displayPublication(){
		System.out.println("---------------Paper detail------------------");
		 super.displayPublication();
        System.out.println("Title: " + title);
	}

}

public class Publication{
	public static void main(String[] args) {
		if(args.length==3){
			Book bookDetails;
			if(args[1].equalsIgnoreCase("Book")){
				bookDetails = new BookPublication(args[0],args[2]);
			}
			else if(args[1].equalsIgnoreCase("Paper")){
				bookDetails = new PaperPublication(args[0],args[2]);
			}
			else{
				bookDetails = new Book(args[0]);
			}
			bookDetails.displayPublication();
		}
		else{
			System.out.println("please enter sifficent data:");
		}
	}
}