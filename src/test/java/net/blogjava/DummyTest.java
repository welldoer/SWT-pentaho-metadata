package net.blogjava;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class DummyTest {
	Dummy dummy;

	@Before
	public void setUp() throws Exception {
		dummy = new Dummy();
	}

	@Test
	public void test() {
		assertThat(true).isTrue();
	}

}
