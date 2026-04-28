/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */
package chap4.s3.q1.basic;

public class StartUp {

	public static void main(String[] args) {

//		// Bookオブジェクトを生成する。
		Book book = new Book("Python", "山口ヒロシ", 2500);
//
//		// Libraryオブジェクトを生成する。
		Library lib = new Library("天空図書館", "東京都千代田区天空町1-1-1", "999-9876-1234", book);
//
//		// LibraryオブジェクトのshowInfo()メソッドを呼び出す。
		lib.showInfo();
//
//		// LibraryオブジェクトのshowBook()メソッドを呼び出す。
		lib.showBook();
	}
}
