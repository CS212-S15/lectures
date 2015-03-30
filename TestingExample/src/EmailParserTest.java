import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

/**
 * Parses an email into its local, domain, and top-level domain components.
 * Does not do full email validation.
 *
 * Demonstrates regular expressions and unit testing.
 *
 * @see EmailParser
 * @see EmailParserTest
 */
//Thanks to Sophie Engle for this example.
public class EmailParserTest {
	/*
	 * The following tests focus on a simple email, snrollins@usfca.edu,
	 * and make sure parsing works.
	 */
	
	@Test(timeout=60000)
	public void testSimpleIsValid() {
		EmailParser parser = new EmailParser("snrollins@usfca.edu");
		assertTrue(parser.debug(), parser.isValid());
	}
	
//	@Test
//	public void testSimpleIsValid() {
//		EmailParser parser = new EmailParser("snrollins@usfca.edu");
//
//	}
	
	
	

}