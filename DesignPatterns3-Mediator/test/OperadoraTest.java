import static org.junit.Assert.*;

import org.junit.Test;

public class OperadoraTest {

	@Test
	public void test() {
		Operadora claro = new Operadora();
		
		MobileUser joao = new MobileUser(claro);
		MobileUser carlos = new MobileUser(claro);
		MobileUser tiago = new MobileUser(claro);
		
		joao.sendSMS("Oi tiago!", 3);
		tiago.receiveSMS();
		joao.sendSMS("Oi carlos!", 2);
		tiago.receiveSMS();
		carlos.sendSMS("Está funcionando?", 3);
		tiago.sendSMS("Hello World ;)", 2);
		carlos.receiveSMS();		
		
		claro.getStatus();
	}

}
