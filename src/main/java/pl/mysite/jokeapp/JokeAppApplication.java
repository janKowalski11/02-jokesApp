package pl.mysite.jokeapp;

/*Maven sluzy do dodoawania bibliotek do javy
* zobacz dodanie chuck noris quotes w pom.xml*/

// ctrl + n przeszukiwanie bibliotek



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokeAppApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(JokeAppApplication.class, args);
    }


}
