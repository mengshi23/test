package com.time.controller;

import com.time.entity.USER;
import com.time.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/UserController")
//这里用了@SessionAttributes，可以直接把model中的user(也就key)放入其中
//这样保证了session中存在user这个对象
//@SessionAttributes("user")
public class UserController {
   @Autowired
    private UserService userservice;

   public UserService getUserservice(){
       return userservice;
   }

   @Autowired
    public void setUserservice(UserService userservice){
       this.userservice=userservice;
   }

   @RequestMapping("/showuser")
   public String showPersons(Model model) {
       List<USER> userList =userservice.showUser();

       model.addAttribute("Users",userList);
       return "showuser";
   }
   @RequestMapping("/Regists")
   public String  Regist(){
       return "regist";
   }

    @RequestMapping(value="/Regist" ,method = RequestMethod.POST)
    @ResponseBody
    public void addUser(@RequestParam("password") String password,Model model, @RequestParam("username") String name){
      USER user=new USER();
      user.setName(name);
      user.setPwd(password);
       userservice.add(user);
   }

}
