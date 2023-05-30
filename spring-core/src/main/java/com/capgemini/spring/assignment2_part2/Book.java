package com.capgemini.spring.assignment2_part2;

public class Book {
	int Bookcode;
	String booktitle;
	String bookauthor;
	double bookprice;
	public Book(int bookcode, String booktitle, String bookauthor, double bookprice) {
		super();
		Bookcode = bookcode;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
	}
	public void display()
	{
		System.out.println(Bookcode);
		System.out.println(booktitle);
		System.out.println(bookauthor);
		System.out.println(bookprice);
	}
}
