import java.util.Scanner;
class Publications
{
    String Title;
    double Price;
    int Copies;
    public Publications()
    {
        Title = "";
        Price=0.0;
        Copies = 0;
    }
    public void saleCopy()
    {
        System.out.println("\nSeparate Sale Copy for Book and Magazine!!!");
    }
    public int get_Copies()
    {
        return Copies;
    }
    public void input()
    {
        Scanner in_obj = new Scanner(System.in);
        System.out.println("\nEnter Title:\t");
        Title = in_obj.nextLine();
        System.out.println("\nEnter Price:\t");
        Price = in_obj.nextDouble();
        in_obj.close();    
        System.out.println("\nEnter Number of copies sold:\t");
        Copies = in_obj.nextInt();
        in_obj.close();    
    }
    public void display()
    {
        System.out.println("\nTitle:\t"+Title);
        System.out.println("\nPrice:\t"+Price);
        System.out.println("\nNumber of Copies sold:\t"+Copies);
    }
}
class Book1 extends Publications
{
    String author;
    public Book1()
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
        System.out.println("\nTotal Sales for "+ author + "is" + total_sale);
    }
    public void orderCopies()
    {
        int n;
        Scanner in_obj = new Scanner(System.in);
        System.out.println("\nHow many Copies of book you want to order ?");
        n = in_obj.nextInt();
        Copies = Copies + n;
        in_obj.close();
    }
    public void input_book()
    {
        input();
        Scanner in_obj = new Scanner(System.in);
        System.out.println("\nEnter Book Author:");
        author = in_obj.nextLine();
        in_obj.close();
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
        total_sale = Price* Copies;
        System.out.println("\nTotal Sale Copy for Magazine!!!");
        display();
        System.out.println("\nTotal Sales for "+ issue + "is" + total_sale);
    }
    public void input_mag()
    {
        input();
        Scanner in_obj = new Scanner(System.in);
        System.out.println("\nEnter Magazine Issue:\t");
        issue = in_obj.nextInt();
        in_obj.close();
    }
    public void orderQty()
    {
        int n;
        Scanner in_obj = new Scanner(System.in);
        System.out.println("\nQuantity of magazine you want to order?");
        n = in_obj.nextInt();
        Copies = Copies + n;
        in_obj.close();
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
        Book1 b1 = new Book1();
        Magazine m1 = new Magazine();
        Publications p1 = new Book1();

        System.out.println("\n---------------Book Data-------------------------");
        b1.input_book();
        b1.display_book();
        b1.orderCopies();
        p1 = b1;
        p1.saleCopy();
        System.out.println("\nTotal Copies Sold : "+p1.get_Copies());

        System.out.println("\n--------------Magazine Data-----------------------");
        p1 = new Magazine();
        m1.input_mag();
        m1.display_mag();
        m1.orderQty();
        p1 = m1;
        p1.saleCopy();
        System.out.println("\nAbove information is for issue : "+m1.receiveissue());
    }
}

/*
Output :

---------------Book Data-------------------------

Enter Title:
Ancient History

Enter Price:
235

Enter Number of copies sold:
150

Enter Book Author:
Ram Sharma

Title: Anicent History

Price: 235

Number of Copies sold: 150

Book Author: Ram Sharma

How many Copies of book you want to order ?
50

Total Sale Copy for Book!!!

Title:  Ancient History

Price:  235.0

Number of Copies sold: 200

Book Author: Ram Sharma

Total Sale for Ram Sharma is 47000.0

Total Copies Sold : 200


--------------Magazine Data-----------------------

Enter Title :
Science and Fiction

Enter Price:
65

Enter Number of copies sold:
600

Enter Magazine Issue:
12

Title: Science and Fiction

Price: 65.0

Magazine Issue: 600

Quantity of magazine you want to order ?
50

Total Sale Copy For Magazine!!!

Title: Science and Fiction

Price: 65.0

Number of Copies sold: 650

Total Sale for 12 is 42250.0

Above Information is for issue:12




*/ 
