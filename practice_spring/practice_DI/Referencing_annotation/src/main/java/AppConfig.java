import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Country country() {
		Country con=new Country();
		con.setCountryName("INDIA");
		return con;
	}
	
	public Citizen citizen() {
		Citizen cit=new Citizen();
		cit.setCname("rajesh");
		cit.setCountry(country());
		return cit;
	}
}
