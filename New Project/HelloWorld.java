public class HelloWorld
{
    public static void main(String[] args)
    {
        Book[] book = 
        {
            new Book("Where The Wild Things Are", "P.J. Pants"),
            new Book("The Hobbit","JRR Tolkien"),
            new Book("How to be President", "A. Nonothing"),
            new Book("Star Wars", "George Lucas")
        };
        for (Book letterBook : book)
        System.out.println(letterBook);
    }
}