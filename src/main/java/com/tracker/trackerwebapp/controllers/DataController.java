package com.tracker.trackerwebapp.controllers;

import com.tracker.trackerwebapp.services.VirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {
    @Autowired
    VirusDataService virusDataService ;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("locationStats", virusDataService.getLocationStat());
        return "home";
    }
}
