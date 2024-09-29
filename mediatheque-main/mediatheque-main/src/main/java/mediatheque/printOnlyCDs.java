public class printOnlyBooks implements Visiteur{
    @Override
    void visit (CD cd){
        System.out.println("Imprimer les détails du CD : " + cd.getTitle());
    }
}