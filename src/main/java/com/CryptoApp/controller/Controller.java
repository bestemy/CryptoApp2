package com.CryptoApp.controller;


import com.CryptoApp.model.RoleName;
import com.CryptoApp.model.User;
import com.CryptoApp.service.UserService;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//import javax.validation.Valid;
//
//@RestController
//public class Controller  {
//
//    @GetMapping("/")
//    public String home(){
//        return("<h1>Home</h1>");
//    }
//
//    @GetMapping("/user")
//    public String user(){
//        return("<h1>Home User</h1>");
//    }
//
//    @GetMapping("/admin")
//    public String admin(){
//        return("<h1> Home Admin</h1>");
//    }
//    @RequestMapping(value="/registration", method = RequestMethod.GET)
//    public ModelAndView registration(){
//        ModelAndView modelAndView = new ModelAndView();
//        User user = new User();
//        modelAndView.addObject("user", user);
//        modelAndView.setViewName("registration");
//        return modelAndView;
//    }
//
////    @RequestMapping(value = "/registration", method = RequestMethod.POST)
////    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
////        ModelAndView modelAndView = new ModelAndView();
////        User userExists = userService.findUserByEmail(user.getEmail());
////        if (userExists != null) {
////            bindingResult
////                    .rejectValue("email", "error.user",
////                            "There is already a user registered with the email provided");
////        }
////        if (bindingResult.hasErrors()) {
////            modelAndView.setViewName("registration");
////        } else {
////            userService.saveUser(user, roleRepository.findByRole(RoleName.USER));
////            modelAndView.addObject("successMessage", "User has been registered successfully");
////            modelAndView.addObject("user", new User());
////            modelAndView.setViewName("registration");
////
////        }
////        return modelAndView;
////    }
//
//}
