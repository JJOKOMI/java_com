package chapter19;



@FunctionalInterface
public interface Modification<T> {
	T modify(T oldData, T newData);
	
//	void example();
}
