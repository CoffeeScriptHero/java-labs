package labs.Lab7;

import labs.Lab6.Car.Car;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class CustomSet<T> implements Set<Car> {
  private Node head;
  private Node tail;
  private int size;

  public CustomSet() {
  }

  public CustomSet(Node head) {
    this.head = head;
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  @Override
  public Iterator<Car> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }

  @Override
  public boolean add(Car car) {
    Node node = new Node(car, null);
    if (head == null) {
      head = node;
    }

    size++;
    return true;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Car> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public void clear() {

  }
}
