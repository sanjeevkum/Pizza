package com.springmvc.pizzaapplication.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


//By implementing WebApplicationInitializer we can configure ServletContext
//Due to that we can it allow creation,configuration and registration of DispatcherServlet.

public class WebAppInitializer implements WebApplicationInitializer{
	//onStartup is to initialize web application
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//AnnotationConfigWebApplicationContext helps to registger annoted class
		AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
		appContext.register(SpringMvcConfig.class);
		
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(appContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");		
	}
	
}
