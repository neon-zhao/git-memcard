package cn.com.sandpay.myApp.webapp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.cn.com.sandpay.myApp.domain.User;
import org.cn.com.sandpay.myApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/add")
	public String hello(HttpServletRequest request){
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		userService.save(userName, password);
		return "list";
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<User> queryAll(HttpServletRequest request){
		return userService.queryAll();
	}
	
	
}
