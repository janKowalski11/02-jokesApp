package controllers;
/*
Author: BeGieU
Date: 13.10.2018
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import services.JokeService;

@Controller
public class MainController
{
    private JokeService jokeService;

    @Autowired
    public MainController(JokeService jokeService)
    {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke()
    {
        return "main-page";
    }
}
