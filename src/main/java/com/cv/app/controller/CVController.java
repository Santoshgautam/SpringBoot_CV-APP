package com.cv.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cv.app.constants.Constants;
import com.cv.app.model.CVModel;

@Controller
public class CVController {

    @GetMapping("/")
    public String index(CVModel post) {
        return Constants.INDEX;
    }

    @PostMapping("/submit")
    public String submitCV(@Valid CVModel cvModel, Model model) {

        model.addAttribute("firstName", cvModel.getFirstName());
        model.addAttribute("lastName", cvModel.getLastName());
        model.addAttribute("country", cvModel.getCountry());
        model.addAttribute("date", cvModel.getDate());
        return Constants.RESULT;
    }

}