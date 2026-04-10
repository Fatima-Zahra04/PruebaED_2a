package instituto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {

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
	void testConstructorCurso() {
	    Curso c = new Curso("DAM");
	    assertEquals("DAM", c.getNombre());
	}

	@Test
	void testToStringCurso() {
	    Curso c = new Curso("DAM");

	    String texto = c.toString();

	    assertTrue(texto.contains("DAM"));
	}

	@Test
	void testAniadirAlumno() {
	    Curso c = new Curso("DAM");
	    Persona p = new Persona(12345678, "Juan Perez", 'M', 1, 1, 2000);

	    c.aniadirAlumno(p);

	    assertFalse(c.toString().contains("Juan Perez"));
	}

}
