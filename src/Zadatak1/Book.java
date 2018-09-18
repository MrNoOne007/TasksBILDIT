package Zadatak1;

public class Book {

	private String Name;
	private Author Author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author Author, double price, int qtyInStock) {
		this.Name = name;
		this.Author = Author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Author getAuthor() {
		return Author;
	}

	public void setAuthor(Author author) {
		Author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return "Book [Name=" + Name + ", Author=" + Author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
	}

}
