package services;
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

    @Autowired
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes)
    {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }

    public static void main(String[] args)
    {

    }
}
