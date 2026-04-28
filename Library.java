/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Library.java
 *
 */
package chap4.s3.q1.basic;

public class Library {

	// 1.名前のメンバ変数name(String)を宣言する。
	private String name;

	// 2.住所のメンバ変数address(String)を宣言する。
	private String address;

	// 3.電話番号のメンバ変数tel(String)を宣言する。
	private String tel ;

	// 4.本のメンバ変数book(Book)を宣言する(集約)。
	public Book book;

	// 5.名前、住所、電話番号、本を引数に受け取るコンストラクタを定義する。

	public Library(String name,String address,String tel,Book book)
	{
		this.name =name;
		this.address  = address;
		this.tel = tel;
		this.book 	= book ;
	}

	// 6.図書館情報を表示するshowInfo()メソッドを定義する。

	public void showInfo()
	{
		System.out.println("<図書館情報>");
		System.out.println("図書館名:"+name +"\n" +"住所 :" +address +"\n" +"電話番号 :"+tel +"\n");
	}


	// 7.書籍情報を表示するshowBook()メソッドを定義する(操作の委譲)。
	public void showBook()
	{
		book.showBook();
	}


}
