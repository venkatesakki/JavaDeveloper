package com.training.filters;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.*;
/**
 * Servlet Filter implementation class LoggingFilter
 */
@WebFilter(urlPatterns = "/validation",dispatcherTypes = DispatcherType.FORWARD)
public class LoggingFilter implements Filter {
	Logger log=Logger.getLogger(this.getClass().getName());
    /**
     * Default constructor. 
     */
    public LoggingFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req=(HttpServletRequest)request;
		
		String reqURL=req.getRequestURL().toString();
		
		log.info("URI====="+reqURL);
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		
		  HttpServletResponse resp=(HttpServletResponse)response;
		  
		  String contentType=resp.getContentType();
		  
		  log.info(contentType);
		 
		
		resp.getWriter().print("<h2>Transformed By Filter</h2>");
		
		resp.setHeader("custom","set By Filter");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
