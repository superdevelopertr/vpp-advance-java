package com.ailhanli.ex2;

public class Book implements Comparable<Book> {
	private int id;
	private int numberOfPages;
	private String author;
	private String name;

	public Book() {
	}

	public Book(int numberOfPages, String author, String name) {
		super();
		this.numberOfPages = numberOfPages;
		this.author = author;
		this.name = name;
	}

	public Book(int id, int numberOfPages, String author, String name) {
		super();
		this.numberOfPages = numberOfPages;
		this.author = author;
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", numberOfPages=" + numberOfPages + ", author=" + author + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Book o) {
		// return -(numberOfPages-o.getNumberOfPages());
		// return name.compareTo(o.getName());
		return author.concat(name).compareTo(o.getAuthor().concat(o.getName()));
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Book other = (Book) obj;
		return other.getName().equals(name);
	}
}