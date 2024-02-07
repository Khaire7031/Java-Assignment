
/*
    7.	Implement the concepts of Abstract class, 
        Interface on Document class. Implement 
        multiple interface through interfaces.
*/

import java.util.*;

// Define an interface for printable documents
interface Printable {
    void print();
}

// Define an interface for editable documents
interface Editable {
    void edit();
}

// Define an abstract class for documents
abstract class FilledDocument {
    private String title;
    private String author;
    
    public FilledDocument(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    // Abstract method for displaying document content
    abstract void display();
}

// Define a concrete class for text documents
class TextDocument extends FilledDocument implements Printable, Editable {
    private String content;
    
    public TextDocument(String title, String author, String content) {
        super(title, author);
        this.content = content;
    }
    
    @Override
    void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + content);
    }
    
    @Override
    public void print() {
        System.out.println("Printing text document...");
        System.out.println("Content: " + content);
    }
    
    @Override
    public void edit() {
        System.out.println("Editing text document Here...");
        /*
          Complete This with your own Logic
        */
    }
}



public class Assignment7 {
    public static void main(String[] args) {
        
        System.out.println("    Assignment No : 7");
        int choice = 0;
        Scanner pk = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        Queue<TextDocument> q = new LinkedList<>();

        do{

            System.out.println("\n--------------------------------------------------\n");
            System.out.println("\n          Menu");
            System.out.println(" 1) Create Document");
            System.out.println(" 2) Display Document");
            System.out.println(" 3) Edit Document");
            System.out.println(" 4) Exit");
            System.out.print("\n Enter your Choice : ");
            choice = pk.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Title : ");
                    String title = scan.nextLine();
                    System.out.print("\nEnter Author : ");
                    String author = scan.nextLine();
                    System.out.print("\nEnter Content : ");
                    String Content = scan.nextLine();

                    TextDocument Doc = new TextDocument(title, author, Content);
                    q.add(Doc);
                    break;
                case 2:
                    int n = q.size();
                    for(int i=0;i<n;i++){
                        TextDocument txt = q.remove();
                        System.out.println("\n--------------------------------------------------\n");
                        System.out.println("Document Number : "+(i+1));
                        txt.display();
                        System.out.println("\n--------------------------------------------------\n");
                        q.add(txt);
                    }
                    break;
                case 3:
                    System.out.println("Edit Your Document");

                    break;
            
                default:
                    break;
            }
            
        }while(choice!=4);

        System.out.println("\n  --------  End ------- \n");
    }
}



/*
 
        Assignment No : 7

    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 1

    Enter Title : Computer

    Enter Author : Pranav

    Enter Content : This is computer Document

    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 2

    --------------------------------------------------

    Document Number : 1
    Title: Computer
    Author: Pranav
    Content: This is computer Document

    --------------------------------------------------


    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 1

    Enter Title : IT

    Enter Author : Swapnil Dhumal

    Enter Content : This is IT Document

    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 2

    --------------------------------------------------

    Document Number : 1
    Title: Computer
    Author: Pranav
    Content: This is computer Document

    --------------------------------------------------


    --------------------------------------------------

    Document Number : 2
    Title: IT
    Author: Swapnil Dhumal
    Content: This is IT Document

    --------------------------------------------------


    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 1

    Enter Title : AIDC

    Enter Author : Sarvesh

    Enter Content : This is AIDS Document

    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 3
    Edit Your Document

    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 2

    --------------------------------------------------

    Document Number : 1
    Title: Computer
    Author: Pranav
    Content: This is computer Document

    --------------------------------------------------


    --------------------------------------------------

    Document Number : 2
    Title: IT
    Author: Swapnil Dhumal
    Content: This is IT Document

    --------------------------------------------------


    --------------------------------------------------

    Document Number : 3
    Title: AIDC
    Author: Sarvesh
    Content: This is AIDS Document

    --------------------------------------------------


    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 3
    Edit Your Document

    --------------------------------------------------


            Menu
    1) Create Document
    2) Display Document
    3) Edit Document
    4) Exit

    Enter your Choice : 4

    --------  End -------

    PS C:\Users\Pranav\Downloads\6 Companies 30 Days\Assignment> 
 */