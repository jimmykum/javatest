package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTwo {

	public static void main(String[] args) {
		one();
	}

	private static void one() {
		List<User> users = Arrays.asList(new User(1l, "Steve", 40), new User(4l, "Joe", 32), new User(3l, "Steve", 57),
				new User(9l, "Mike", 18), new User(10l, "George", 24), new User(2l, "Jim", 40),
				new User(8l, "Chuck", 34), new User(5l, "Jorje", 22), new User(6l, "Jane", 47),
				new User(7l, "Kim", 60));
		System.out.println(users);
		List<User> nl = users.stream().filter(u -> u.getAge() > 25).collect(Collectors.toList());
		System.out.println(nl);
		users.forEach(p -> p.setAge(99));
		System.out.println(users);
	}

}
