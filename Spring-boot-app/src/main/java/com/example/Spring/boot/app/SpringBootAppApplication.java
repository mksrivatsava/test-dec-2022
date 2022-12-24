package com.example.Spring.boot.app;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner
{
 
    @Override
    public void run(String args[]) throws Exception
    {

        System.out.println("Hello world");
    }

    public static void main(String[] args)
    {
   
        SpringApplication.run(SpringBootAppApplication.class, args);
    }
}
