package org.zerock.mapper.ex02;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.ex01.CustomerDto;
import org.zerock.domain.ex01.EmployeeDto;

import lombok.Setter;

public interface Ex02Mapper {
	
	// myBatis가 제공하는 어노테이션
	// @Select, @Insert, @Param
	
	// 파라미터로 받는 id값을 쿼리에 작성해준다. #{id}
	@Select("SELECT CustomerName FROM Customers WHERE CustomerId = #{id}")
	public String selectNameById(int id);
	
	@Select("SELECT FirstName FROM Employees WHERE EmployeeId = #{id}")
	public String selectFirstNameById(int id);
	
	// 테이블 컬럼명과 java beans의 프로퍼티명이 같으면 그 같은 이름에 값을 넣어주는데
	// DB 컬럼명과 java beans의 프로퍼티명은 항상 일치하지 않을 수 있다. 
	// 그럴때는 sql의 별칭을 사용해서 작성해주면 된다.
	@Select("SELECT CustomerName AS name, Address, City, Country "
			+ "FROM Customers "
			+ "WHERE CustomerId = #{id}")
	public CustomerDto selectCustomerById(int id);
	
	@Select("SELECT FirstName, LastName, BirthDate FROM Employees WHERE EmployeeId = #{id}")
	public EmployeeDto selectEmployeeById(int id);
	
	// VALUES (?, ?, ?, ?)으로 입력할 필요가 없다.
	// @Insert 어노테이션을 이용하면
	// VALUES (#{프로퍼티명}, #{프로퍼티명}, #{프로퍼티명} ...) 작성하면 값이 입력됨
	@Insert("INSERT INTO Customers "
			+ " (CustomerName, ContactName, City, Country, Address, PostalCode) "
			+ " VALUES (#{customerName}, #{contactName}, #{city}, #{country}, #{address}, #{postalCode} ) ")
	public int insertCustomer(CustomerDto customer);
	
	@Insert("INSERT INTO Employees "
			+ " (LastName, FirstName, Photo, Notes, BirthDate) "
			+ " VALUE (#{lastName}, #{firstName}, #{Photo}, #{notes}, #{BirthDate}) ")
	public int insertEmployee(EmployeeDto employee);
	
	// 여러개의 컬럼 얻어올때는 List 타입으로 명시하고 작성하면된다.
	@Select("SELECT EmployeeID id, LastName, FirstName, Photo, Notes, BirthDate "
			+ "FROM Employees ORDER BY EmployeeID ")
	public List<EmployeeDto> listEmployee();
	
	@Select("SELECT CustomerID id, CustomerName, ContactName, Address, City, Postalcode, Country "
			+ "FROM Customers ORDER BY CustomerID ")
	public List<CustomerDto> listCustomer();
	
	@Select("SELECT CustomerID id, "
			+ "CustomerName, "
			+ "ContactName, "
			+ "Address,City, "
			+ "PostalCode, "
			+ "Country "
			+ "FROM Customers "
			+ "LIMIT #{from}, #{row} ") 
	// @Select는 파라미터 1개 이상은 사용불가, 컴파일시 파라미터명이 유지되지 않는다.
	// @Param("from") 어노테이션으로 파라미터명을 유지해야 한다.
	public List<CustomerDto> listCustomerPage(@Param("from")int page, @Param("row")int rowPerPage);

	@Select("SELECT Count(CustomerID) FROM Customers ")
	public int countCustomers();
												
}
