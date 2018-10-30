package com.lc.pattern.behaviour.respchain;

public class ResponseFilter implements Filter{
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequestName(request.getRequestName() + "---ResponseFilter");
		chain.doFilter(request, response, chain);
		response.setResponseName(response.getResponseName() + "---ResponseFilter");
	}
}
