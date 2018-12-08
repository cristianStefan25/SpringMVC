/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.cristian.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author cnastase
 */
@Controller
public class MainController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String homeAction(Model model) {
        model.addAttribute("nume", "John");
        return "home";
    }
//
//    @RequestMapping(value = "/home", method = RequestMethod.GET)
//    public String homeAction(
//            @RequestParam(value = "nume", required = false) String nume, // iei informatia din link cu /home?nume=Gigel
//            Model model) {
//        if (nume == null) {
//            nume = "John";
//        }
//        model.addAttribute("nume", nume);
//        return "home";
//    }
//    @RequestMapping(value = "/home/{nume}", method = RequestMethod.GET)
//    public String homeAction(
//            @PathVariable("nume") String nume, // scrii /home/Cristian. E un link mai user friendly. Nu mai pui ?atribut
//            Model model) {
//        if (nume == null) {
//            nume = "John";
//        }
//        model.addAttribute("nume", nume);
//        return "home";
//    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String homeActionPost(String nume, Model model) {
        model.addAttribute("nume", nume);
        return "home";
    }

}
