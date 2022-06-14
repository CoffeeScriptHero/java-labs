package labs.Lab7;

import labs.Lab6.Car.Car;

public class Node {
  private Car data;
  private Node next;

  public Node(Car data, Node next) {
    this.data = data;
    this.next = next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

}

