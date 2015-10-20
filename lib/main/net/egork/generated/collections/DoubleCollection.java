package net.egork.generated.collections;

import java.util.NoSuchElementException;
import java.util.Iterator;

import net.egork.generated.collections.iterator.*;
import net.egork.generated.collections.list.*;
import net.egork.generated.collections.function.*;
import net.egork.generated.collections.comparator.*;

/**
 * @author Egor Kulikov
 */
public interface DoubleCollection extends DoubleStream {
	public int size();

	default public boolean isEmpty() {
		return size() == 0;
	}

	default public void add(double value) {
		throw new UnsupportedOperationException();
	}

	default public boolean remove(double value) {
	    for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
	        if (value == it.value()) {
	            it.remove();
	            return true;
	        }
	    }
	    return false;
	}

	default public double[] toArray() {
		int size = size();
		double[] array = new double[size];
		int i = 0;
		for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
			array[i++] = it.value();
		}
		return array;
	}

	default public void addAll(DoubleStream values) {
		for (DoubleIterator it = values.doubleIterator(); it.isValid(); it.advance()) {
			add(it.value());
		}
	}

	default public void removeAll(DoubleStream values) {
		for (DoubleIterator it = values.doubleIterator(); it.isValid(); it.advance()) {
			remove(it.value());
		}
	}

	default public void retainAll(DoubleCollection values) {
		for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
			if (!values.contains(it.value())) {
				it.remove();
			}
		}
	}

	default public DoubleCollection compute() {
		return this;
	}
}
