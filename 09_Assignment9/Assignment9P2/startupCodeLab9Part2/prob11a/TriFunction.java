package lesson9.labs.prob11a;

import lesson9.labs.prob11b.Employee;

import java.util.List;


public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);

	boolean apply(List<Employee> list, T m, U u);
}
