package com.javaNoobDeveloper.SpringBootJPA.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaNoobDeveloper.SpringBootJPA.Model.Model;


@RestController
public class NewController {
	
	@RequestMapping("/test")
	public List<Model> controller() {
		List<Model> ret = new ArrayList<Model>();
		ret.add(new Model("1", "luic", "luice12", "908765788"));
		return ret;
		
	}

}
