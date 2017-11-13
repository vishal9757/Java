package com.avalia.learning.java.httpserver;

import java.io.IOException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.URLDecoder;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpServer;

public class HttpServerDemo {
	public static void main(String[] args) throws IOException {
		InetSocketAddress addr = new InetSocketAddress(8000);

		HttpServer server = HttpServer.create(addr, 0);

		server.createContext("/flights", new FlightSearchHandler());
		server.setExecutor(Executors.newCachedThreadPool());
		server.start();
		System.out.println("Server is listening on port 8000");
	}
}

class FlightSearchHandler implements HttpHandler {
	public static Map<String, String> splitQuery(String query) throws UnsupportedEncodingException {
		Map<String, String> query_pairs = new LinkedHashMap<String, String>();

		if (query != null) {
			String[] pairs = query.split("&");
			for (String pair : pairs) {
				int idx = pair.indexOf("=");
				query_pairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF-8"),
						URLDecoder.decode(pair.substring(idx + 1), "UTF-8"));
			}
		}
		return query_pairs;
	}

	@SuppressWarnings("restriction")
	public void handle(HttpExchange exchange) throws IOException {
		String requestMethod = exchange.getRequestMethod();
		if (requestMethod.equalsIgnoreCase("GET")) {
			Headers responseHeaders = exchange.getResponseHeaders();
			responseHeaders.set("Content-Type", "text/plain");
			exchange.sendResponseHeaders(200, 0);

			OutputStream responseBody = exchange.getResponseBody();

			Headers requestHeaders = exchange.getRequestHeaders();
			Set<String> keySet = requestHeaders.keySet();
			Iterator<String> iter = keySet.iterator();
			while (iter.hasNext()) {
				String key = iter.next();
				List values = requestHeaders.get(key);
				String s = key + " = " + values.toString() + "\n";
				responseBody.write(s.getBytes());
			}
			Map<String, String> query = splitQuery(exchange.getRequestURI().getQuery());
			for (String key : query.keySet()) {
				String s = key + " = " + query.get(key) + "\n";
				responseBody.write(s.getBytes());
			}
			responseBody.close();
		}
	}
}