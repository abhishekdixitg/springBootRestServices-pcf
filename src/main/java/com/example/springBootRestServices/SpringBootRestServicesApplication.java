package com.example.springBootRestServices;

import java.util.Optional;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(scanBasePackages={"com.example.springBootRestServices.Repository"})
@RestController
@EnableSwagger2
public class SpringBootRestServicesApplication {
	
	/*@Autowired
	private TaskRepository taskRepository;
*/
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestServicesApplication.class, args);
	}
	
	@RequestMapping(value="/getAllUser",method=RequestMethod.GET)
	@ApiOperation(value = "Get the User details", notes = "User details does not require any input"
			+ "All failures would be logged for reporting purpose. ", response = SpringBootRestServicesApplication.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Bad Request. Please verify your input"),
			@ApiResponse(code = 404, message = "Service not available"),
			@ApiResponse(code = 500, message = "Unexpected Runtime error") })
	public String getAllUserDetails(){
		return "Abhishek";
	}
	@RequestMapping(value="/saveUserDetails",method=RequestMethod.POST)
	public String saveUserDetails(){
		return "Abhishek";
	}
	@RequestMapping(value="/updateUserDetails",method=RequestMethod.PUT)
	public String updateUserDetails(){
		return "Abhishek";
	}
	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
	public String deleteUserDetails(){
		return "Abhishek";
	}
	/*@RequestMapping(value="getTaskDetails",method=RequestMethod.GET,params={"taskId"})
	public String getTaskDetails(@RequestParam String taskId){
		
		TaskDetailVO taskDetailVO = taskRepository.findTask(taskId);
		return taskDetailVO.toString();
	}*/

	
}
