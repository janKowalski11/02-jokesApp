package pl.mysite.jokeapp.services;
/*
Author: BeGieU
Date: 13.10.2018
*/

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService
{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl( )
    {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
