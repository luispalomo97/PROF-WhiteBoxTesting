package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

public class Test_maxAbsolute {

	private Exercises exercise = new Exercises();
	
	@Test
	public void maxAbsolute_value3() {
		int [] valores = {1,2,3};
		assertEquals(3, exercise.maxAbsolute(valores));
		
	}
	
	@Test
	public void maxAbsolute_negativevalue3() {
		int [] valores = {-1,-2,-3};
		assertEquals(3, exercise.maxAbsolute(valores));
	}
	
	@Test
	public void maxAbsolute_value1() {
		int [] valores = {1,2,3,4,5,6};
		assertEquals(-1, exercise.maxAbsolute(valores));
	}
}