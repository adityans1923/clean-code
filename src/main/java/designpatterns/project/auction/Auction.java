package designpatterns.project.auction;

import designpatterns.project.customer.Customer;

import java.time.LocalDateTime;

public class Auction {
  private String item;
  private String description;
  private LocalDateTime dueDate;

  private Customer seller;

  private double highestBid;
  private Customer buyer;

  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public Customer getSeller() {
    return seller;
  }

  public void setSeller(Customer seller) {
    this.seller = seller;
  }

  public double getHighestBid() {
    return highestBid;
  }

  public void setHighestBid(double highestBid) {
    this.highestBid = highestBid;
  }

  public Customer getBuyer() {
    return buyer;
  }

  public void setBuyer(Customer buyer) {
    this.buyer = buyer;
  }

  public Auction() {
  }

  public boolean bid(Customer buyer, double amount) {
    System.out.println("Bid buyer is: "+buyer.getFullName());
    if (getHighestBid() < amount) {
      setHighestBid(amount);
      setBuyer(buyer);
      return true;
    }
    return false;
  }

}
