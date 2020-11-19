package org.apache.commons.mail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	
	// Test for addBcc(String... emails) function
	@Test
	public void testAddBcc() throws Exception {
		// Call addBcc with TEST_EMAILS
		email.addBcc(TEST_EMAILS);
		// Check if the number of BCC'd emails is 5
		assertEquals(5, email.getBccAddresses().size());
	} // END of Test for addBcc(String... emails)
}
