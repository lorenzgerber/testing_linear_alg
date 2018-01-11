package se.loge.linalg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LinAlgTest
	extends TestCase {

	public LinAlgTest( String testName ) {
		super( testName );
	}

	public static Test suite() {
		return new TestSuite( LinAlgTest.class );
	}

	public void testLinAlg() {
		assertTrue( true );
	}
}
