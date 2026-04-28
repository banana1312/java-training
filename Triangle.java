/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Triangle.java
 *
 */
package chap4.s3.q4.standard;

public class Triangle {
	// 三角形の底辺のメンバ変数base(int)を宣言する。
	private int base;
	// 三角形の高さのメンバ変数height(int)を宣言する。
	private int height;
	// 三角形の面積のメンバ変数area(int)を宣言する。
	private int area;

	// 底辺と高さを引数に受け取るコンストラクタを定義する。
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	// 三角形の面積を計算するcalculateArea()メソッドを定義する。
	public void calculateArea() {
		area = (base * height) / 2;
	}

	// 三角形の情報を表示するdisplay()メソッドを定義する。
	public void display() {
		System.out.println("    底辺:" + base);
		System.out.println("    高さ:" + height);
		System.out.println("    面積:" + area);
		System.out.println();
	}

}
