package com.top20.alg.lrucache;

public interface ICache {
	Integer get(String key);
	void put(String key, Integer value);
	void display();
}
