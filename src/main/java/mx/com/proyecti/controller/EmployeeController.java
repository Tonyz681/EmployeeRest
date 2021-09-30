package mx.com.proyecti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.proyecti.entity.Employee;
import mx.com.proyecti.service.EmployeeService;

@RestController
//La clase que estoy definiendo se encuentra en la capa controller 
//La clase va a fungir como mi servicio REST para definir sus operaciones

//http://localhost:8090/api/...
@RequestMapping ("api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	//http://localhost:8090/api/employees GET
	List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("/employees")
	//http://localhost:8090/api/employees POST
	Long insertEmployee(@RequestBody Employee employee) {
		return employeeService.insertEmployee(employee);
	}
	
	@GetMapping("employees/{id}")
	//http://localhost:8090/api/employees/1 GET
	Employee getEmployee(@PathVariable Long id) {
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/employees")
	//http://localhost:8090/api/employees PUT
	Boolean updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	//http://localhost:8090/api/employees/1 DELETE
	Boolean deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}
}
