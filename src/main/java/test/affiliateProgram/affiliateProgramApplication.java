package test.affiliateProgram;

import test.affiliateProgram.model.affiliateProgram;
import test.affiliateProgram.repository.affiliateProgram_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class affiliateProgramApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(affiliateProgramApplication.class, args);
	}


	@Autowired
	private affiliateProgram_Repo Client_Repo;
	@Override
	public void run(String... args) throws Exception {
//		client client = new client();
//		client.setFirstName("Mwita");
//		client.setLastName("Isaac");
//		client.setEmailId("julianhurricane8390@gmail.com");
//		Client_Repo.save(client);
//
//		client client1 = new client();
//		client1.setFirstName("Makene");
//		client1.setLastName("Isaac");
//		client1.setEmailId("julianhurricane8390@gmail.com");
//		Client_Repo.save(client1);
	}
}
