package org.zerock.service.ex02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.ex01.CustomerDto;
import org.zerock.domain.ex01.EmployeeDto;
import org.zerock.mapper.ex02.Ex02Mapper;

@Service
public class Ex04Service {
	
	@Autowired
	private Ex02Mapper mapper;
	

	public String getNameById(int id) {
		
		String name = mapper.selectNameById(id);
		
		return name;
	}
	
	public String getFirstNameById(int id) {
		
		String firstName = mapper.selectFirstNameById(id);
		
		return firstName;
	}

	public CustomerDto getCustomerInfoById(int id) {
		
		return mapper.selectCustomerById(id);
	}

	public EmployeeDto getEmlpoyeeInfoById(int id) {
	
		return mapper.selectEmployeeById(id);
	}

	public boolean addCustomer(CustomerDto customer) {
		int count = mapper.insertCustomer(customer);
		
		// mapper의 @insert 어노테이션이 잘 실행되면 1을 리턴해준다.
		// 이 리턴값 1은 mapper가 잘 실행되어 영향을 끼친 record의 갯수이다.
		// service가 리턴한 값이 1이면 성공했다고 판단한다. 
		return count == 1;
	}

	public boolean addEmployee(EmployeeDto employee) {
		int count = mapper.insertEmployee(employee);
		
		return count == 1;
	}
	
	

}
