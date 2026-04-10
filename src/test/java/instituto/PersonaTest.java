package instituto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPersona() {
		 Persona p = new Persona();

		    assertEquals("", p.getNombre());
	}

	@Test
	void testPersonaInt() {
		Persona p = new Persona(12345678);

	    assertEquals(12345678, Integer.parseInt(p.getNif().toString().split("-")[0]));

	}

	@Test
	void testPersonaIntStringCharIntIntInt() {
		Persona p = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);

	    assertEquals("Juan Perez", p.getNombre());
	    assertEquals('M', p.getGenero());
	    assertEquals(2000, p.getNacimiento().getYear());
	}

	@Test
	void testToString() {
		Persona p = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);

	    String texto = p.toString();

	    assertFalse(texto.contains("Juan Perez"));
	}

}
