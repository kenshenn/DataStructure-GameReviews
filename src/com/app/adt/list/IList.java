package com.app.adt.list;

//Author: Chong Ken Shen


import com.app.adt.IIterator;

public interface IList<E> {
	boolean isEmpty();

	int length();

	E get(int index);

	E set(int index, E element);

	boolean add(int index, E element);

	boolean add(E element);

	E remove(int index);

	void clear();
        
                  Object[] toArray();
                  
                  Object[] sort(Object[] data);
                  
                  IListIterator<E> listIterator();
                  
                  IListIterator<E> listIterator(int index);
                  
                  IIterator<E> iterator();

    public E[] toArray(E[] data);
}