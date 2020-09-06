
import java.util.Scanner;
class Book{
    String name,author,publisher;
    int isbno;
    public Book(String name, String author, String publisher, int isbno){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.isbno=isbno;
    }
    void setName(String name){
        this.name=name;
    }
    void setAuthor(String author){
        this.author=author;
    }
    void setPublisher(String publisher){
        this.publisher=publisher;
    }
    void setIsbno(int isbno){
        this.isbno=isbno;
    }
    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }
    String getPublisher(){
        return publisher;
    }
    int getIsbno(){
        return isbno;
    }
    public String getBookInfo(){
        String res="";
        
        res+=name+" "+author+" "+publisher+" "+isbno;
        return res;
    }
    
}
public class Exp4 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Book BookTest[]=new Book[30];
        //Book("The alchemist","Savi Sharma","Penguin",8237);
        for(int i=0;i<30;i++){
            BookTest[i]=new Book(s.next(),s.next(),s.next(),s.nextInt());
        }
        for(int i=0;i<BookTest.length;i++){
            System.out.println(BookTest[i].getBookInfo());
        }
        
    }
}




