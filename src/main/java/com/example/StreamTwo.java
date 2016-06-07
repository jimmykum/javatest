package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamTwo {

	private static final Logger LOGGER = LoggerFactory.getLogger(StreamTwo.class);
	public static void main(String[] args) {
		//one();
		two();
	}
	
	private static void two(){
		String t = "abcdefgh";
		char[] tt = t.toCharArray();
		t = new String(tt);
		LOGGER.info(t);
	}

	private static void one() {
		List<User> users = Arrays.asList(new User(1l, "Steve", 40), new User(4l, "Joe", 32), new User(3l, "Steve", 57),
				new User(9l, "Mike", 18), new User(10l, "George", 24), new User(2l, "Jim", 40),
				new User(8l, "Chuck", 34), new User(5l, "Jorje", 22), new User(6l, "Jane", 47),
				new User(7l, "Kim", 60));
		List<User> nl = users.stream().filter(u -> u.getAge() > 25).collect(Collectors.toList());
		LOGGER.debug("list {}",nl);
		users.forEach(p -> p.setAge(99));
		LOGGER.debug("list is {}",users);
		users.forEach(new Consumer<User>(){
			 public void accept(User t) {
	                t.setAge(12);
	            }
		});
		
		LOGGER.debug("list again is {}",users);
		try{
		int i = 9/0;
		}catch(Exception e){
			LOGGER.error("error ",e);
		}
	}

}
