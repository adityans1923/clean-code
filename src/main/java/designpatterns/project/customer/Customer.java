package designpatterns.project.customer;

import designpatterns.project.observer.Observer;

public class Customer implements Observer {
  private String fullName;

  public Customer(String fullName) {
    this.fullName = fullName;
  }

  public String getFullName() {
    return fullName;
  }

  @Override
  public void update() {
    System.out.println(fullName + " has been notified");
  }
}
