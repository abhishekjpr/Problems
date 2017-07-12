package com.top20.alg.listimplementation;

public class ArrayList implements IList {

	private Integer[] in;
	private int size = 0;

	public ArrayList() {
		in = new Integer[10];
		size = 0;
	}

	public ArrayList(int size) {
		in = new Integer[size];
	}

	@Override
	// TC: O(1)amortized
	public boolean add(Integer e) {
		if (!isFull()) {
			in[size++] = e;
			return true;
		}
		doubleArray();
		// System.out.println(in.length+" "+size+" "+e);
		in[size++] = e;
		return true;
	}

	private void doubleArray() {
		// TODO Auto-generated method stub
		int newSize = in.length * 2;
		Integer[] newIn = new Integer[newSize];
		int i = 0;
		for (; i < size; i++)
			newIn[i] = in[i];
		in = newIn;
		newIn = null;
	}

	//TC: O(1)
	private boolean isFull() {
		// TODO Auto-generated method stub
		return (in.length == size);
	}

	@Override
	public boolean add(Integer index, Integer e) {
		if (index > size) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		if (!isFull()) {
			if (index == size) {
				in[index] = e;
				++size;
			}else{
				addElement(index, e);
			}
			return true;
		}
		doubleArray();
		addElement(index, e);
		return true;
	}
	
	private void addElement(int index, Integer e){
		int i = 0;
		for (i = size + 1; i > index; --i) {
			in[i] = in[i - 1];
		}
		in[i] = e;
		++size;
	}

	@Override
	//TC: O(n)
	public void display() {
		for (int i = 0; i < size; i++)
			System.out.print(in[i] + " ");
		System.out.println();
	}

	@Override
	//TC: O(1)
	public boolean set(Integer index, Integer e) {
		if (index > size + 1) {
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		in[index] = e;
		return true;
	}

	@Override
	//TC: O(n)
	public boolean contains(Integer e) {
		for (int i = 0; i < size; i++) {
			if (in[i] == e)
				return true;
		}
		return false;
	}

	@Override
	public boolean remove(Integer index) {
		if (index > size)
			throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		for (int i = index; i < size; i++) {
			in[i] = in[i + 1];
		}
		--size;
		return true;
	}

	@Override
	public void sort(Object array) {

	}

	@Override
	//TC: O(1)
	public Integer get(Integer index) {
		return in[index];
	}

	@Override
	//TC: O(1)
	public Integer size() {
		return size;
	}
	
	//TC: O(1)
	public Integer capacity(){
		return in.length;
	}

}
