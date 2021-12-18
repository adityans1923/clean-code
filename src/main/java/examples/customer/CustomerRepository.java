package examples.customer;

import java.util.List;

public interface CustomerRepository {
  List<Customer> findAll();
}
