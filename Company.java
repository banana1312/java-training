/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Company.java
 *
 */
package chap4.s3.q3.standard;

import java.util.ArrayList;

public class Company {

	// メンバ変数を宣言する。
	private String name;
	private String address;
	private String tel ;
	private ArrayList<Employee> empList;

	// 名前、住所、電話番号を引数に受け取るコンストラクタを定義する。
	public Company(String name,String address,String tel)
	{
		this.name = name;
		this.address = address;
		this.tel = tel ;
		this.empList = new ArrayList<Employee>();
	}

	// 従業員情報を追加するaddEmp()メソッドを定義する。
	public void addEmp(Employee emp)
	{
		empList.add(emp);
	}



	// 会社情報を表示するshowInfo()メソッドを定義する。

	public void showInfo()
	{
		System.out.println("<会社情報>");
		System.out.println("社名：　　" + name +"\n" + "住所：　　" + address +"\n"+ "電話番号：" + tel);
	}

	// 従業員情報を表示するshowEmpList()メソッドを定義する（操作の委譲）。

	public void showEmpList()

	{
		for(Employee emp : empList )
		{
			emp.showEmpInfo();
		}
	}


}
