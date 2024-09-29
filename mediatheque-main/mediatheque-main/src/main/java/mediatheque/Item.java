package mediatheque;
public abstract class Item {
	private String title;
	public abstract visit(Visiteur visiteur)
	public abstract accept (Visiteur visiteur)
	protected Item(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void print();

	@Override
	public String toString() {
		return title;
	}
	
}
