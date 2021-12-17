package examples.contact;

import java.util.Objects;

public class Contact {
  private String firstName;
  private String lastName;
  private String phoneNumber;

  public Contact(String firstName, String lastName, String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void validateFirstName() {
    if (this.firstName.isBlank())
      throw new RuntimeException("First Name Cannot be null or empty");
  }

  public void validateLastName() {
    if (this.lastName.isBlank())
      throw new RuntimeException("Last Name Cannot be null or empty");
  }

  public void validatePhoneNumber() {
    if (this.phoneNumber.isBlank()){
      throw new RuntimeException("Phone Name Cannot be null or empty");
    }

    if (this.phoneNumber.length() != 10) {
      throw new RuntimeException("Phone Number Should be 10 Digits Long");
    }
    if (!this.phoneNumber.matches("\\d+")) {
      throw new RuntimeException("Phone Number Contain only digits");
    }
    if (!this.phoneNumber.startsWith("0")) {
      throw new RuntimeException("Phone Number Should Start with 0");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Contact contact = (Contact) o;
    return Objects.equals(firstName, contact.firstName) && Objects.equals(lastName, contact.lastName) && Objects.equals(phoneNumber, contact.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, phoneNumber);
  }
}