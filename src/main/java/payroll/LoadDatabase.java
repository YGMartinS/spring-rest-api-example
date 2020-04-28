package payroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
    	System.out.println ("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
    	System.out.println ("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
    };
  }
}