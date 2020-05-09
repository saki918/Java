package progate5;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle = new Bicycle("ビアンキ", "緑");
    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");

    bicycle.setRun(scanner.nextInt());
    bicycle.run(bicycle.getRun());

    System.out.println("=================");
    Car car = new Car("フェラーリ", "赤");
    System.out.println("【車の情報】");
    car.printData();
    System.out.println("ガソリン量：" + car.getFuel() + "L");
    System.out.println("-----------------");
    System.out.print("走る距離を入力してください：");
    car.setRun(scanner.nextInt());
    car.run(car.getRun());

    System.out.println("-----------------");
    System.out.print("給油する量を入力してください：");
    car.charge(scanner.nextInt());

  }
}