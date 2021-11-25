import java.util.Scanner;

class Publications
{
    String Title;
    double Price;
    int Copies;
    
    // Publications Class Constructor for setting default values
    public Publications()
    {
        Title = "";
        Price=0.0;
        Copies = 0;
    }

    // Declaring a method which will get overridden by the inherited class
    public void saleCopy()
    {
        System.out.println("\nSeparate Sale Copy for Book and Magazine!!!");
    }

    // Declaring method to return no. of copies sold.
    public int get_Copies()
    {
        return Copies;
    }

    // Common method for taking input
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Title:\t");
        Title = sc.nextLine();
        System.out.println("\nEnter Price:\t");
        Price = sc.nextDouble();
        System.out.println("\nEnter Number of copies sold:\t");
        Copies = sc.nextInt();   
    }

    // Method to display data
    public void display()
    {
        System.out.println("\nTitle:\t"+Title);
        System.out.println("\nPrice:\t"+Price);
        System.out.println("\nNumber of Copies sold:\t"+Copies);
    }
}

class Book extends Publications
{
    String author;

    //Book Class Constructor for setting default values
    public Book()
    {
        super();
        author="";
    }

    @Override
    public void saleCopy()
    {
        double total_sale = 0;
        total_sale = Price* Copies;
        System.out.println("\nTotal Sale Copy for Book!!!");
        display_book();
        System.out.println("\nTotal Sales for "+ author + " is " + total_sale);
    }

    public void orderCopies()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow many Copies of book you want to order ?");
        n = sc.nextInt();
        Copies = Copies + n;
    }
    public void input_book()
    {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Book Author:");
        author = sc.nextLine();
    }
    public void display_book()
    {
        display();
        System.out.println("\nBook Author:\t" + author);
    }
}

class Magazine extends Publications
{
    int issue;
    public Magazine()
    {
        super();
        issue = 0;
    }
    @Override
    public void saleCopy()
    {
        double total_sale = 0;
        total_sale = Price*Copies;
        System.out.println("\nTotal Sale Copy for Magazine!!!");
        display();
        System.out.println("\nTotal Sales for "+ issue + " is " + total_sale);
    }
    public void input_mag()
    {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Magazine Issue:\t");
        issue = sc.nextInt();
        // sc.close();
    }
    public void orderQty()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nQuantity of magazine you want to order?");
        n = sc.nextInt();
        Copies = Copies + n;
    }
    public int receiveissue()
    {
        return issue;
    }
    public void display_mag()
    {
        display();
        System.out.println("\nMagazine Issue:\t"+issue);
    }
}
public class program {
    public static void main(String[] args) {

        Book b1 = new Book();
        Publications p1 = new Book();

        System.out.println("\n----------------------Book Data Entry-------------------------");
        b1.input_book();
        System.out.println("\n------------------Book Data Entry SuccessFul------------------");
        b1.display_book();
        System.out.println("\n--------------------------------------------------------------");
        b1.orderCopies();
        p1 = b1;
        System.out.println("\n------------------Modified Details of the Book----------------");
        p1.saleCopy();
        System.out.println("\nTotal Copies Sold : "+p1.get_Copies());


        Magazine m1 = new Magazine();
        Publications t1 = new Magazine();


        System.out.println("\n--------------------Magazine Data Entry-----------------------");
        // p1 = new Magazine();
        m1.input_mag();
        System.out.println("\n------------------Magazine Data Entry SuccessFul--------------");
        m1.display_mag();
        System.out.println("\n--------------------------------------------------------------");
        m1.orderQty();
        System.out.println("\n--------------------------------------------------------------");
        t1 = m1;
        System.out.println("\n--------------Modified Details of the Magazine----------------");
        t1.saleCopy();
        System.out.println("\nAbove information is for issue : "+m1.receiveissue());
        System.out.println("\n--------------------------------------------------------------");
    }
}
