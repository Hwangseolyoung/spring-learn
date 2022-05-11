package org.zerock.mapper.ex02;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.ex01.CustomerDto;
import org.zerock.domain.ex01.EmployeeDto;

public interface Ex02Mapper {
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerId = #{id}")
	public String selectNameById(int id);
	
	@Select("SELECT FirstName FROM Employees WHERE EmployeeId = #{id}")
	public String selectFirstNameById(int id);
	
	// 테이블 컬럼명과 java beans의 set method와 이름이 같으면 그 같은 이름에 값을 넣어주는데
	// DB 컬럼명과 java beans의 set method명은 항상 일치하지 않을 수 있다. 
	// 그럴때는 sql의 별칭을 사용해서 작성해주면 된다.
	@Select("SELECT CustomerName AS name, Address, City, Country "
			+ "FROM Customers "
			+ "WHERE CustomerId = #{id}")
	public CustomerDto selectCustomerById(int id);
	
	@Select("SELECT FirstName, LastName, BirthDate FROM Employees WHERE EmployeeId = #{id}")
	public EmployeeDto selectEmployeeById(int id);
	
	@Insert("INSERT INTO Customers "
			+ " (CustomerName, ContactName, City, Country, Address, PostalCode) "
			+ " VALUES (#{customerName}, #{contactName}, #{city}, #{country}, #{address}, #{postalCode} ) ")
	public int insertCustomer(CustomerDto customer);
	
	@Insert("INSERT INTO Employees "
			+ " (LastName, FirstName, Photo, Notes) "
			+ " VALUE (#{lastName}, #{firstName}, #{Photo}, #{notes}) ")
	public int insertEmployee(EmployeeDto employee);
	
}
