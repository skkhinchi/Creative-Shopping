package com.sumit.demo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.demo.Services.ProductService;
import com.sumit.demo.Services.UserService;
import com.sumit.demo.model.Product;
import com.sumit.demo.model.User;
@Controller


public class AppController 
{	
	@Autowired
	private UserService userService; 
	
	@Autowired
	private ProductService productService;
	
	
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request)
	{	
		request.setAttribute("mode","MODE_HOME");
		return "welcomepage";
	}
	
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest request)
	{
		request.setAttribute("mode","MODE_REGISTER");   
		return "welcomepage";
	}
	
	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute User user, BindingResult bindingResult,HttpServletRequest request)
	{
		userService.saveMyUser(user);  
		request.setAttribute("mode","MODE_HOME");
		return "welcomepage";
	}
	
	
	
	
	
	
	
	@GetMapping("/show-users")  
	public String showAllUsers(HttpServletRequest request) {   
		request.setAttribute("users", userService.showAllUsers());  
		request.setAttribute("mode", "ALL_USERS");
		return "welcomepage";
	}
	
	@RequestMapping("/delete-user")
	public String deleteUser(@RequestParam int id, HttpServletRequest request) {
		userService.deleteMyUser(id);
		request.setAttribute("users", userService.showAllUsers());
		request.setAttribute("mode", "ALL_USERS");
		return "welcomepage";
	}
	
	@RequestMapping("/edit-user")
	public String editUser(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("user", userService.editUser(id));
		request.setAttribute("mode", "MODE_UPDATE"); 
		return "welcomepage";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request)
	{	
		request.setAttribute("mode","MODE_LOGIN");
		return "welcomepage";
	}
	
	@RequestMapping ("/login-user")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) {  //
		if(userService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
			return "homepage";
		}
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcomepage";
			
		}
	}
	
	
	

	
	
	
	//----------------------------------------------------------
	@RequestMapping("/homeproduct")
	public String productwelcomepage(HttpServletRequest request)
	{	
		request.setAttribute("mode","MODE_PRODUCT_HOME");
		return "welcomeproduct";
	}
	
	@RequestMapping("/registerproduct")
	public String registrproduct(HttpServletRequest request)
	{
		request.setAttribute("mode","MODE_REGISTER_PRODUCT");
		return "welcomeproduct";
	}

	
	@PostMapping("/save-product")
	public String registerproduct(@ModelAttribute Product product, BindingResult bindingResult,HttpServletRequest request)
	{
		productService.saveMyProduct(product);
		request.setAttribute("mode","MODE_PRODUCT_HOME");
		return "welcomeproduct";
	}
	
	@GetMapping("/show-products")
	public String showAllProducts(HttpServletRequest request) {
		request.setAttribute("products", productService.showAllProducts());
		request.setAttribute("mode", "ALL_PRODUCTS");
		return "welcomeproduct";
	}
	
	@RequestMapping("/edit-product")
	public String editProduct(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("product", productService.editProduct(id));
		request.setAttribute("mode", "MODE_UPDATE_PRODUCT");
		return "welcomeproduct";
	}
	
	@RequestMapping("/cat_product")
	public String all_categary()
	{
		return "catpage";
	}
	
	@RequestMapping("/delete-product")
	public String deleteProduct(@RequestParam int id, HttpServletRequest request) {
		productService.deleteMyProduct(id);
		request.setAttribute("products", productService.showAllProducts());
		request.setAttribute("mode", "ALL_PRODUCTS");
		return "welcomeproduct";
	}	
	
}
