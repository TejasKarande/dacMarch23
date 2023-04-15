import java.util.Scanner;
class Book
{
    private String Title;
    private String Author;
    private String Publisher;
    private String ISBN;
    private int Year;
    private double Price;
    private int Quantity;

    public Book()
    {
    String Title = null;
    String Author = null;
    String Publisher = null;
    String ISBN = null;
    int Year = 0;
    double Price = 0.0;
    int Quantity = 0;
    }

    public void setTitle(String T)
    {
        this.Title = T;
    }
    public void setAuthor(String A)
    {
        this.Author = A;
    }
    public void setPublisher(String P)
    {
        this.Publisher = P;
    }
    public void setISBN(String n)
    {
        this.ISBN = n;
    }
    public void setYear(int y)
    {
        this.Year = y;
    }
    public void setPrice(double pr)
    {
        this.Price = pr;
    }
    public void setQuantity(int qty)
    {
        this.Quantity = qty ;
    }

    public String getTitle()
    {
        return this.Title;
    }
    public String getAuthor()
    {
        return this.Author;
    }
    public String getPublisher()
    {
        return this.Publisher;
    }
    public String getISBN()
    {
        return this.ISBN;
    }
    public int getYear()
    {
        return this.Year;
    }
    public double getPrice()
    {
        return this.Price;
    }
    public int getQuantity()
    {
        return this.Quantity;
    }
    public int increaseQty(int Quantity)
    {
       this.Quantity = Quantity + 1 ;
       return this.Quantity;
    }
    public int decreaseQty(int Quantity)
    {
       this.Quantity = Quantity - 1 ;
       return this.Quantity;
    }
    public double totalValue(int Quantity , double Price)
    {
        double totalValue = Quantity*Price;
        return totalValue;
    }
}

class BookTest
{ 
    private static Scanner sc = new Scanner(System.in);
    Book B = new Book();
    public void Data()
   {
    System.out.print("Enter the Title : ");
    String Str = sc.nextLine();
    B.setTitle(Str);
    System.out.print("Enter the Author : ");
    String Str1 = sc.nextLine();
    B.setAuthor(Str1);
    System.out.print("Enter the Publisher : ");
    String Str2 = sc.nextLine();
    B.setPublisher(Str2);
    System.out.print("Enter the ISBN : ");
    String Str3 = sc.nextLine();
    B.setISBN(Str3);
    System.out.print("Enter the Year : ");
    int Year = sc.nextInt();
    B.setYear(Year);
    System.out.print("Enter the  Price : ");
    double n = sc.nextDouble();
    B.setPrice(n);
    System.out.print("Enter the Quantity :");
    int Qty = sc.nextInt();
    B.setQuantity(Qty);
    int Q =Qty;

    int IQty = B.increaseQty(Q);
    int dQty = B.decreaseQty(Q);
    double Total_Value = B.totalValue(Q,n);

    System.out.println("Title = "+ B.getTitle());
    System.out.println("Author = "+ B.getAuthor());
    System.out.println("Publisher = "+ B.getPublisher());
    System.out.println("ISBN = "+ B.getISBN());
    System.out.println("Year = "+ B.getYear());
    System.out.println("Price = "+ B.getPrice());
    System.out.println("Quantity = "+ B.getQuantity());

    System.out.println("Total Qty = "+ IQty);
    System.out.println("Total Qty = "+ dQty);
    System.out.println("Total Value = "+ Total_Value);

   }
    
}


class Book_Inventory
{
    public static void main(String args[])
    {
        BookTest T = new BookTest();
        T.Data();
    }
}