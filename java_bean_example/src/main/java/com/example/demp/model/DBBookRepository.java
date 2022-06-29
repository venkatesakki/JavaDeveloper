package com.example.demp.model;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class DBBookRepository implements CrudRepository<Book> {
	private Connection con;

	public DBBookRepository(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public Book add(Book t) {

		
		int rowAdded = 0;
		String sql = "insert into book values(?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getBookNumber());
			pstmt.setString(2, t.getBookName());
			pstmt.setString(3, t.getAuthorName());
			pstmt.setDouble(4, t.getPrice());

			rowAdded = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("row added" + rowAdded);
		return rowAdded == 1 ? t : null;
	}

	@Override
	public List<Book> findAll() {
		String sql = "select * from book";
		List<Book> bookList = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int bookNumber = rs.getInt("book_number");
				String bookName = rs.getString("book_name");
				String autherName = rs.getString("author_name");
				double price = rs.getDouble("price");

				Book eachBook = new Book(bookNumber, bookName, autherName, price);
				bookList.add(eachBook);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bookList;
	}
	
	@Override
	public List<Book> findByName(String bookName) {
		String sql = "select * from book where book_name=?;";
		List<Book> bookList = new ArrayList<>();
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1,bookName);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int bookNumber = rs.getInt("book_number");
				//String bookName = rs.getString("book_name");
				String autherName = rs.getString("author_name");
				double price = rs.getDouble("price");

				Book eachBook=new Book(bookNumber,bookName,autherName,price);
				bookList.add(eachBook);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}
	
	@Override
	public Book updateBook(Book t) {

		int rowUpadted = 0;
		String sql = "update book set book_name=?,author_name=?,price=? where book_number=?;";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setString(1, t.getBookName());
			pstmt.setString(2, t.getAuthorName());
			pstmt.setDouble(3, t.getPrice());

			pstmt.setInt(4, t.getBookNumber());

			rowUpadted = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowUpadted == 1 ? t : null;

	}

	

	@Override
	public Book removeById(int id) {

		int rowDeleted = 0;
		String sql = "delete from book where book_number=?;";
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setInt(1, id);

			rowDeleted = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rowDeleted == 1 ? findById(id) : null;

	}


	@Override
	public Book findById(int id) {
		String sql = "select * from book where book_number=?;";
		Book foundBook = null;
		try (PreparedStatement pstmt = con.prepareStatement(sql);) {

			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int bookNumber = rs.getInt("book_number");
				String bookName = rs.getString("book_name");
				String autherName = rs.getString("author_name");
				double price = rs.getDouble("price");

				foundBook = new Book(bookNumber, bookName, autherName, price);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foundBook;
	}

}
