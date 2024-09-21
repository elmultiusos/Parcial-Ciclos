package edu.eci.cvds.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryApplicationTests {
    private Client testClient;
    private Product testUser;
	private AgentLog testAgentLog;
	private AgentWarn testAgentWarn;
	private Product testProduct;

	@Test
	void ShouldAgentLogWriteWhenModifyProductClient() {
		Client newClient = new Product("xbox one s", 10);
		assertTrue(testAgentLog.getMenssaje(), "xbox one s -> 10 unidades disponibles");
	}

	@Test
	void ShouldAgentWarningWhenAProductIsFiveOrLess() {
		Client newClient = new Product("xbox one s", 4);
		assertTrue(testAgentWarn.getMenssaje(), "ALERTA!!! El stock del Prodcto: xbox one s es muy bajo, solo quedan 4 unidades.");
	}

	@Test
	void ShouldClientAddAProduct() {
		Client newClient = new Product("xbox one s", 10);
		assertTrue(product.getProduct(), "xbox one s");
	}

	@Test
	void ShouldClientModifyProduct() {
		Client newClient = new Product("xbox one s", 10);
		newClient.setProduct("xbox one s", 15);
		assertTrue(product.getProduct("xbox one s"), 10);
	}
}
