public class printOnlyBooks implements Visiteur{
    @Override
    void visit(Book book){
        System.out.println("Imprimer les détails du book : " + book.getTitle())
    }
   
}