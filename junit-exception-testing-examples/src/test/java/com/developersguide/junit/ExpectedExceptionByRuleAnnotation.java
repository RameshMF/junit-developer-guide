package com.developersguide.junit;


import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasProperty;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionByRuleAnnotation {
	@Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDivisionWithException() {

        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(containsString("/ by zero"));

        int i = 1 / 0;

    }

    @Test
    public void testNameNotFoundException() throws UserNotFoundException {

		//test type
        thrown.expect(UserNotFoundException.class);

		//test message
        thrown.expectMessage(is("Name is empty!"));

        //test detail
        thrown.expect(hasProperty("errCode"));  //make sure getters n setters are defined.
        thrown.expect(hasProperty("errCode", is(666)));

        UserService cust = new UserService();
        cust.findByName("");

    }
}
