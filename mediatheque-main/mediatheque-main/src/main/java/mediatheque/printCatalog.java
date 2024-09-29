public class printCatalog implements Visiteur{
    public void visit() {
		for (Item i : items)
			i.print();
	}
}