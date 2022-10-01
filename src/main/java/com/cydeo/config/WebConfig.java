package com.cydeo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/welcome").setViewName("welcome");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("login");
    }

}
/*
I don't have controller package, and yet when I type localhost:8080 I still get result without
controller. Above items can be created with controller class. But why did we do it with above way?
We are not passing any data when we type localhost:8080. Or when we click login welcome page comes
we are not passing any data either. Or when I type www.cydeo.com page comes, we are not passing any data.

So what Spring people did it, they said if we are trying to access to end point and end point is
returning view then we don't need to create controller or method for each of them. We can just create
Controller class implementing interface and override addViewController method like above.
so this is like shortcut

 */