package com.xmichas.bus.controller;

import com.xmichas.bus.model.User;
import com.xmichas.bus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class homeController {

    @Autowired
    UserRepository userRepository;

    User userG=null;




    @RequestMapping(value="rejestracja", method = RequestMethod.GET)
    public ModelAndView rejestracjaFormularz(Model model) {
        User user= new User();
        model.addAttribute("user",user);
        return new ModelAndView("rejestracja");

    }

    @RequestMapping(value="rejestracja", method = RequestMethod.POST)
    public ModelAndView rejestracjaLog(User user) {
//        User UserDoBazy = new User(user.getImie(),user.getNazwisko(),user.getEmail(), user.getLogin(),user.getHaslo(),
               // user.getIloscPunktow());
        userRepository.save(user);
        return new ModelAndView("redirect:/rejestracja");
    }


    @RequestMapping(value="logowanie", method = RequestMethod.GET)
    public ModelAndView logowanieFormularz(Model model) {
        User user= new User();
        model.addAttribute("user",user);
        return new ModelAndView("rejestracja");

    }

    @RequestMapping(value="logowanie", method = RequestMethod.POST)
    public ModelAndView logowanieLog(User user) {
        List<User> listOfUser=userRepository.findAll();

        userG=userRepository.findByLogin(user.getLogin());
        userRepository.save(user);
        return new ModelAndView("redirect:/rejestracja");
    }

}
