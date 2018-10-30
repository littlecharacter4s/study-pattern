package com.lc.pattern.behaviour.respchain;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}
