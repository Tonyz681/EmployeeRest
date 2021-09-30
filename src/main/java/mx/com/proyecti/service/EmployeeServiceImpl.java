package mx.com.proyecti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.repository.EmployeeRepository;

@Service
//Registra  la clase como un componente dentro de la capa de servicios para poder ser utilizada por Spring
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.getOne(id);
	}

	public Long insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee).getId();
	}

	public Boolean updateEmployee(Employee employee) {
		Employee emp = employeeRepository.getOne(employee.getId());
		if (emp!=null) {
			emp.setFirstname(employee.getFirstname());
			emp.setFirstname(employee.getLastname());
			emp.setBirthdate(employee.getBirthdate());;
			emp.setSalary(employee.getSalary());
			employeeRepository.save(emp);
			return true;
		}else return false;
		

	}

	public Boolean deleteEmployee(Long id) {
		employeeRepository.delete(id);
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}





}
