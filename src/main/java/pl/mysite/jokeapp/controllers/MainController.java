package pl.mysite.jokeapp.controllers;
/*
Author: BeGieU
Date: 13.10.2018
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mysite.jokeapp.services.JokeService;

@Controller
public class MainController
{
    private JokeService jokeService;

    @Autowired
    public MainController(JokeService jokeService)
    {
        this.jokeService = jokeService;
    }

    /* spring automatycznie podaje Model jesli
    * ustawimyy go jjako parametr */

    @RequestMapping({"/",""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";
    }
}
