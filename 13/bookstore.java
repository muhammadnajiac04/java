import java.util.Scanner;
class publisher{
    String name;
    publisher(String name){
        this.name=name;
    }
}
class book extends publisher{
    String title;
    String author;
    book(String name, String title,String author){
        super(name);
        this.title=title;
        this.author=author;
    }
}
class literature extends book{
    literature(String name,String title,String author){
        super(name,title,author);
    }
    void display(){
        System.out.println("Category: Fiction");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Publisher: " + name);
        System.out.println("---------------------------");
    }
}
class fiction extends book{
    fiction(String name,String title,String author){
        super(name,title,author);
    }
    void display(){
        System.out.println("Category: Fiction");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Publisher: " + name);
        System.out.println("---------------------------");
    }
}
public class bookstore{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the no of literature");
    int n=s.nextInt();
    s.nextLine();
    literature []literatures=new literature[n];
            for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Literature book " + (i + 1));

            System.out.print("Title: ");
            String title = s.nextLine();

            System.out.print("Author: ");
            String author = s.nextLine();

            System.out.print("Publisher: ");
            String publisher = s.nextLine();
            literatures[i]=new literature(publisher, title, author);
}
        System.out.print("Enter number of fictyion books: ");
        int a = s.nextInt();
        s.nextLine();
    fiction []fictions=new fiction[a];
            for (int i = 0; i < a; i++) {

            System.out.println("\nEnter details for Literature book " + (i + 1));

            System.out.print("Title: ");
            String title = s.nextLine();

            System.out.print("Author: ");
            String author = s.nextLine();

            System.out.print("Publisher: ");
            String publisher = s.nextLine();
            fictions[i]=new fiction(publisher, title, author);
        }
        System.out.println("literatiure");
        for(literature book : literatures){
            book.display();
        }
              for(fiction book : fictions){
            book.display();
    }
    s.close();
}
}