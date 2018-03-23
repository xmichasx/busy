package com.xmichas.bus.controller;

import com.xmichas.bus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {



    @RequestMapping("rejestracje")
    @ResponseBody
    //@ResponseBody // mówi że metoda zwróci ciało. to co zostanie zwrócone zostanie przesłąne do przeglądarki
    public ModelAndView index() {

            return new ModelAndView("index");


    }

}
