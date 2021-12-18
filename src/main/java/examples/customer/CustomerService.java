package examples.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
  private CustomerRepository repository;

  CustomerService(CustomerRepository repository) {
    this.repository = repository;
  }

  public List<Customer> getCustomersByCity(String city) {
    List<Customer> customers = new ArrayList<>();
    for(Customer customer: repository.findAll()) {
      if(customer.getCity().equalsIgnoreCase(city)) {
        customers.add(customer);
      }
    }
    return customers;
  }
}
