package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		/*SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//TESTES DE OPERAÇÕES EM SELLER;
		 
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> sellerlist = sellerDao.findByDepartment(department);
		
		sellerlist.forEach(s -> System.out.println(s));
		
		System.out.println("=== TEST 3: seller findAll ===");
		sellerlist = sellerDao.findAll();
		
		sellerlist.forEach(s -> System.out.println(s));
		
		System.out.println("=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);		
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed!  ");
		
		System.out.println("=== TEST 6: seller delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");*/
		
		
		//TESTES DE OPERAÇÕES EM DEPARTAMENT;
		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("=== TEST 2: department findAll ===");
		List<Department> departmentList = departmentDao.findAll();
		
		departmentList.forEach(dL -> System.out.println(dL)); 
		
		/*System.out.println("=== TEST 3: department insert ===");		
		Department newDepartment = new Department(5, "dice");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		System.out.println("=== TEST 4: department update ===");
		department = departmentDao.findById(6);
		department.setName("swords");
		departmentDao.update(department);
		System.out.println("Update Completed!");
		
		System.out.println("=== TEST 5: department delete ===");
		System.out.println("Enter id for delete test");
		int id =sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
	
		sc.close();
	}
}
