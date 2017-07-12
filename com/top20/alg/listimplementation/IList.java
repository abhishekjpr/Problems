package com.top20.alg.listimplementation;

public interface IList {
	
	public boolean add(Integer e);
	public boolean add(Integer index, Integer e);
	public void display();
	public boolean set(Integer index, Integer e);
	public boolean contains(Integer e);
	public boolean remove(Integer index);
	public void sort(Object array);
	public Integer get(Integer index);
	public Integer size();
}
