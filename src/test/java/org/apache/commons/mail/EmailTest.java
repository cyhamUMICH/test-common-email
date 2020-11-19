package org.apache.commons.mail;

import org.junit.After;
import org.junit.Before;

public class EmailTest {
	// Test Emails
	private static final String[] TEST_EMAILS = { "ab@cd.com", "a.b@c.org", 
			"abc@abc.com.uk", "test123@test.com", "anotherTest@test.edu"};
	
	// Concrete Email object to test with
	private EmailConcrete email;
	
	@Before
	public void setUpEmailTest() throws Exception {
		email = new EmailConcrete();
	} // END of the setup function
	
	@After
	public void tearDownEmailTest() throws Exception {
		// Do nothing on tear down
	} // END of the tear down function
}
