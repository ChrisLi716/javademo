package com.chris.collection.stream;

@FunctionalInterface
public interface IConvert<F, T> {
	T convert(F from);
}
