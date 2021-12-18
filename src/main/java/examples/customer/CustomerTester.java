package examples.customer;

import java.util.List;

public class CustomerTester {

  public static void main(String[] args) {
    CustomerRepository repository = new CustomerRepositoryDb();
    CustomerService service = new CustomerService(repository);

    List<Customer> customers = service.getCustomersByCity("New Delhi");

    System.out.println(customers);
  }
}
