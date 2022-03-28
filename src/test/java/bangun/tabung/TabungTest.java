package bangun.tabung;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import bangun.lingkaran.Lingkaran;

class TabungTest {
	private Tabung tabung;
	
	@BeforeEach
	void setUp(){
		Lingkaran lingkaran = new Lingkaran(20);
		this.tabung = new Tabung(lingkaran,10);
	}

	@Test
	void testVolTabung() {
		double VolTabung = tabung.volTabung();
		assertEquals(3140.0,VolTabung);
	}

	@Test
	void testLuasTabung() {
		double LuasTabung = tabung.luasTabung();
		assertEquals(1256.0,LuasTabung);
	}

}
