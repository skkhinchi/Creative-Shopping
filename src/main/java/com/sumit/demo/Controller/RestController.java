package com.sumit.demo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sumit.demo.Services.ProductService;
import com.sumit.demo.Services.UserService;
import com.sumit.demo.model.Product;
import com.sumit.demo.model.User;


@Controller
public class RestController 
{		@Autowired
		private  UserService userService; 


		@Autowired
        private ProductService productService;
		
		
		@RequestMapping("/")		
		public String welcome(HttpServletRequest request)
		{	
			request.setAttribute("mode","MODE_HOME");
			return "welcomepage";
		}
		
		@GetMapping("/saveuser") 
		public String saveUser(@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname, @RequestParam int age,@RequestParam String password)
		{	
			User user=new User(username,firstname,lastname,age,password);
			
			userService.saveMyUser(user); 
			return "User Saved";
		}
		
		
//	---------------------------------------------
//		@RequestMapping(value= {"/homeproduct"}, method=RequestMethod.POST)
//		public String welcomeProduct(HttpServletRequest request)
//		{	
//			request.setAttribute("mode","MODE_PRODUCT_HOME");
//			return "welcomeproduct";
//		}
//------------------------------------------------jsp page ko shift kr liya Rest controller m		
		
		
		
		
		@GetMapping("/saveproduct")
		public String saveProduct(@RequestParam String productname,@RequestParam double price)
		{
			Product product= new Product(productname,price);
			productService.saveMyProduct(product); 
			return "welcomepage";
		}
		
		
		
		
}
