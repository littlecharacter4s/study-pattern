package com.lc.pattern.behaviour.respchain;

public class ResponsibilityChainDemo {
	public static void main(String[] args) {
		Request request = new Request();
		Response response = new Response();
		request.setRequestName("Request");
		response.setResponseName("Response");
		
		FilterChain fc = new FilterChain();
		fc.addFilter(new RequestFilter()).addFilter(new ResponseFilter());
		  
		fc.doFilter(request, response, fc);
		
		System.out.println(request.getRequestName());
		System.out.println(response.getResponseName());
	}
}
