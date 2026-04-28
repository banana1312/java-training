/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Employee.java
 *
 */
package chap4.s3.q3.standard;

public class Employee {

	// メンバ変数
	private String name;
	private String section;
	private int salary;

	// 引数を受け取らないコンストラクタを定義する。
	public Employee() {
	}

	// 名前、部署、給与を引数に受け取るコンストラクタを定義する。
	public Employee(String name, String section, int salary) {
		this.name = name;
		this.section = section;
		this.salary = salary;
	}

	// 従業員情報を表示する。
	public void showEmpInfo() {
		System.out.println("<従業員情報>");
		System.out.println("氏名:" + name);
		System.out.println("部署:" + section);
		System.out.println("給与:" + salary);
		System.out.println();
	}
}
