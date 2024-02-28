package com.example.estrellitasweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.estrellitasweb.services.NaveServices;
import com.example.estrellitasweb.model.Nave;



@Controller
@RequestMapping("/nave")
public class NaveController {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private NaveServices naveServicio;

    @GetMapping("/lista")
    public String listarPersonas(Model model) {
        List<Person> persons = personService.listarPersonas();
        model.addAttribute("persons", persons);
        return "person-list";
    }
}
