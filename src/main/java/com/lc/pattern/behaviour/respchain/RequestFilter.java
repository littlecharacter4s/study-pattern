package com.lc.pattern.behaviour.respchain;

public class RequestFilter implements Filter{
	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequestName(request.getRequestName() + "---RequestFilter");
		//一个精巧的设计逻辑，不明白的话去调试，看一步一步怎么走的
		chain.doFilter(request, response, chain);
		response.setResponseName(response.getResponseName() + "---RequestFilter");
	}
}
