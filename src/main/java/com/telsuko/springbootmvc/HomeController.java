package com.telsuko.springbootmvc;

import com.telsuko.springbootmvc.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

       @ModelAttribute
       public void modelData(ModelMap model) {
            model.addAttribute("name", "Alien");
        }
        @RequestMapping("/")
        public String home() {
            //System.out.println("Home Page Requested");
            return "index";
        }

        @RequestMapping("hello")
        public String hello(@RequestParam ("num1") Integer num1, @RequestParam ("num2") Integer num2, ModelMap model) {
            Integer sum = num1 + num2;
            model.addAttribute("sum", sum);
            //System.out.println("Hello Page Requested");
            return "hello";
        }

        @RequestMapping("addAlien")
        public String addAlien(@ModelAttribute("a1") Alien alien) {
            return "result";
        }

        @GetMapping("getAliens")
          public String getAlien(ModelMap model) {
                List<Alien> aliens = Arrays.asList(new Alien(101, "Raj"), new Alien(102, "Ravi"));
                model.addAttribute("aliens", aliens);
                return "showAlien";
          }

}
