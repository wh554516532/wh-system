package cn.com.wangh.system.user.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/user")
public class UserController {

	@RequestMapping("/{id}/get")
	public User get(@PathVariable String id, HttpServletRequest request) {
		return new User();
	}
}
