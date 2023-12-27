package com.hinbernate.RunTest;

import com.hinbernate.Dao.CRUD.EmployeeDaoCRUD;
import com.hinbernate.Entity.Employee;

public class RunTest {

	public static void main(String[] args) {
		try {
			// Create and insert
//			if (EmployeeDaoCRUD.InsertintoEmployee("Chandan", "Mallick")) {
//				System.out.println("Successfully inserted");
//			} else {
//				System.out.println("Insertion failed");
//			}

			// select the specific
//			if (EmployeeDaoCRUD.selectSpecificEmployee() != null) {
//				System.out.println(EmployeeDaoCRUD.selectSpecificEmployee());
//			} else {
//				System.out.println("Nothing Found");
//			}
			
			//updateAll
//			if (EmployeeDaoCRUD.updateSpecific("Chandan", "Mallick")) {
//				System.out.println("Successfully updated");
//			} else {
//				System.out.println("Updation failed");
//			}
			
			//delete
			if (EmployeeDaoCRUD.deleteSpecific(102)) {
				System.out.println("Successfully deleted");
			} else {
				System.out.println("Deletion failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
