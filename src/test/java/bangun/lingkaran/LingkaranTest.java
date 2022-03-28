package bangun.lingkaran;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LingkaranTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testLuas() {
		Lingkaran lingkaran = new Lingkaran(20);
		double LuasLingkaran = lingkaran.Luas();
		assertEquals(314,LuasLingkaran);
	}

}
