/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */
package chap4.s3.q3.standard;

public class StartUp {

	public static void main(String[] args) {

		// Companyオブジェクトを生成する。
		Company co = new Company("(株)FLMツアーズ","東京都大山区小山町11-22","000-8888-7777");

		// Employeeオブジェクトを生成し、Companyオブジェクトに追加する。
		Employee oga = new Employee("小川 大海","営業部",900);
		Employee tana = new Employee("田中 秀子","開発部",1000);
		Employee mura = new Employee("村田 佳代","人事部",850);




		// CompanyオブジェクトのshowInfo()メソッドを呼び出す。


		// CompanyオブジェクトのshowEmpList()メソッドを呼び出す。

	}
}
