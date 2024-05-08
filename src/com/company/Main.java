package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Car> cars = Arrays
        .asList(new Car(Color.BLUE, "10"), new Car(Color.BLUE, "9"), new Car(Color.BLUE, "8"), new Car(Color.BLUE, "1"), new Car(Color.GREEN, "2"), new Car(Color.GREEN, "6"), new Car(Color.GREEN, "7"), new Car(Color.RAD, "3"), new Car(Color.RAD, "5"), new Car(Color.RAD, "6"), new Car(Color.YELLOW, "4"));

    cars.stream().filter(car -> car.getColor() == Color.RAD).forEach(car -> System.out.println(car.getColor()));
    cars.stream().filter(car -> "6".equals(car.getDescription()) && car.getColor() == Color.RAD)
        .forEach(car -> System.out.println(car.getDescription() + " " + car.getColor()));

    // машины дескрипшен больше 4 (если нужно выполнить больше одного действия в стриме то нужно использовать {}
    // и return для возвращаемого значения
    // например
    // .filter(car -> {
    //     return "6".equals(car.getDescription()) && car.getColor() == Color.RAD);
    // }
    // )

    // преобразовать список машин в список дескрипшенов и вывести все на экран

    // преобразовать список машин в список цветов и убрать повторяющиеся элементы

    // вывести количество элементов списка на экран

    // вывести первые 3 элемента списка

    // найти голубую машину с дескрипшеном 10 (вернуть вместо списка только 1 элемент)

    List<Car> cars2 = Arrays
        .asList(new Car(Color.BLUE, "10"), new Car(Color.BLUE, "9"), new Car(Color.BLUE, null), new Car(Color.BLUE, "1"), new Car(Color.GREEN, "2"), new Car(Color.GREEN, "6"), new Car(null, "7"), new Car(Color.RAD, "3"), new Car(Color.RAD, "5"), null, new Car(Color.YELLOW, "4"));

    // машины дескрипшен больше 4

    // преобразовать список машин в список дескрипшенов и вывести все на экран

    // преобразовать список машин в список цветов и убрать повторяющиеся элементы

    // вывести количество элементов списка на экран

    // вывести первые 3 элемента списка

    // найти голубую машину с дескрипшеном 10 (вернуть вместо списка только 1 элемент)

  }
}

class Car {
  private Color color;
  private String description;

  public Car() {
  }

  public Car(Color color, String description) {
    this.color       = color;
    this.description = description;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}

enum Color {
  RAD, BLUE, YELLOW, GREEN
}

