/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Book.java
 *
 */
package chap4.s3.q1.basic;

public class Book {

	// メンバ変数
	private String name;
	private String author;
	private int price;

	// 名前、著者、単価を引数に受け取るコンストラクタ
	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	// 書籍情報を表示する。
	public void showBook() {
		System.out.println("<書籍情報>");
		System.out.println("書籍名:" + name);
		System.out.println("著者:  " + author);
		System.out.println("単価:  " + price);
		System.out.println();
	}

}
