/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Rectangle.java
 *
 */
package chap4.s3.q4.standard;

public class Rectangle {

	// 四角形の幅のメンバ変数width(int)を宣言する。
	private int width;

	// 四角形の高さのメンバ変数height(int)を宣言する。
	private int height;

	// 四角形の面積のメンバ変数area(int)を宣言する。
	private int area;

	// 幅と高さを引数に受け取るコンストラクタを定義する。
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 四角形の面積を計算するcalculateArea()メソッドを定義する。
	public void calculateArea() {
		area = width * height;
	}

	// 四角形の情報を表示するdisplay()メソッドを定義する。
	public void display() {
		System.out.println("    幅:" + width);
		System.out.println("    高さ:" + height);
		System.out.println("    面積:" + area);
		System.out.println();
	}
}
