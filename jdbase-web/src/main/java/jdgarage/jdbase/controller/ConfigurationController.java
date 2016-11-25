package jdgarage.jdbase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/configuration")
@Api(value = "Configuration API")
public class ConfigurationController {
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value="test endpoint", notes ="where notes go", response=String.class)
	public String index(){
		return "Hello JDBASE";
	}

}
