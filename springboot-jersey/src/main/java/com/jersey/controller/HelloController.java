package com.jersey.controller;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jersey.bean.User;
@Controller
@Path("/test")
public class HelloController {
    @GET
    @Path("/hello/{id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> getHello(@PathParam("id") int id) {
		Map<String,Object> map = new HashMap<>();
		System.out.println("id="+id);
		if(id==1) {
			map.put("id", 1);
			map.put("name", "张三");
			map.put("age", 25);
		}else {
			map.put("id", 2);
			map.put("name", "李四");
			map.put("age", 30);
		}
    	return map;
	}
    
    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> getHello2(@QueryParam("id") int id) {
		Map<String,Object> map = new HashMap<>();
		System.out.println("id="+id);
		if(id==1) {
			map.put("id", 1);
			map.put("name", "张三");
			map.put("age", 25);
		}else {
			map.put("id", 2);
			map.put("name", "李四");
			map.put("age", 30);
		}
    	return map;
	}
    
    //x-www-form-urlencoded
    @POST
    @Path("/hi")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> getHello3(@FormParam("id") int id) {
		Map<String,Object> map = new HashMap<>();
		System.out.println("id="+id);
		if(id==1) {
			map.put("id", 1);
			map.put("name", "张三");
			map.put("age", 25);
		}else {
			map.put("id", 2);
			map.put("name", "李四");
			map.put("age", 30);
		}
    	return map;
	}
    
    @POST
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> getHello4(Map<String,Object> param) {
		Map<String,Object> map = new HashMap<>();
		int id = (int)param.get("id");
		System.out.println("id="+id);
		if(id==1) {
			map.put("id", 1);
			map.put("name", "张三");
			map.put("age", 25);
		}else {
			map.put("id", 2);
			map.put("name", "李四");
			map.put("age", 30);
		}
    	return map;
	}
    
    @POST
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> getHello5(User user) {
		Map<String,Object> map = new HashMap<>();
		int id = user.getId();
		System.out.println("id="+id);
		if(id==1) {
			map.put("id", 1);
			map.put("name", "张三");
			map.put("age", 25);
		}else {
			map.put("id", 2);
			map.put("name", "李四");
			map.put("age", 30);
		}
    	return map;
	}
    
    @PUT
    @Path("/put")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> getHello6(User user) {
		Map<String,Object> map = new HashMap<>();
		//System.out.println("id="+id);
		System.out.println("user="+user.toString());
		if(user.getId()==1) {
			map.put("id", 1);
			map.put("name", "张三");
			map.put("age", 25);
		}else {
			map.put("id", 2);
			map.put("name", "李四");
			map.put("age", 30);
		}
    	return map;
	}
    
    @PUT
    @Path("/put/{id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @Consumes(MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> getHello6(@PathParam("id")int id,User user) {
		Map<String,Object> map = new HashMap<>();
		System.out.println("id="+id);
		System.out.println("user="+user.toString());
		if(user.getId()==1) {
			map.put("id", 1);
			map.put("name", "张三");
			map.put("age", 25);
		}else {
			map.put("id", 2);
			map.put("name", "李四");
			map.put("age", 30);
		}
    	return map;
	}
    
    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public Map<String,Object> getHello7(@PathParam("id")int id) {
		Map<String,Object> map = new HashMap<>();
		System.out.println("id="+id);
		if(id==1) {
			map.put("id", 1);
			map.put("name", "张三");
			map.put("age", 25);
		}else {
			map.put("id", 2);
			map.put("name", "李四");
			map.put("age", 30);
		}
    	return map;
	}
    
}
