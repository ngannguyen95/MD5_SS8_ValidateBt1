package ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.model.User;
import ra.service.IUserService;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("user", new User());
        return "/index";
    }

    @PostMapping("/create")
    public String create(@Valid  @ModelAttribute("user") User user,@RequestParam("rePassword") String str,Model model,  BindingResult bindingResult) {
            if (bindingResult.hasErrors()||!user.getPassword().equals(str)) {
                model.addAttribute("repassWord","password is not match");
                return "/index";
            }else {
                userService.save(user);
                return "/result";
            }
    }
}
