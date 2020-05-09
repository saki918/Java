package progate5;

public class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int run;
  private int fuel = 100;

  // メソッド
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }

  // インスタンスメソッド
  public void run(int run) {
    // this.distance += run;
    System.out.println(run + "km走ります");
    if (run > fuel) {
      System.out.println("ガソリンが足りません");
    } else {
      this.distance += run;
      this.fuel -= run;
    }
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  public void charge(int charge) {
    System.out.println(charge + "L給油します");
    if (charge < 0) {
      System.out.println("給油できません");
    } else if (this.fuel + charge >= 100) {
      System.out.println("満タンまで給油します");
      fuel = 100;
    } else {
      this.fuel += charge;
    }
    System.out.println("ガソリン量：" + this.fuel + "L");
  }

  // コンストラクタ
  Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

  // ゲッター
  public String getName() {
    return this.name = name;
  }

  public int getRun() {
    return this.run = run;
  }

  public int getFuel() {
    return this.fuel = fuel;
  }

  // セッター
  public void setName(String name) {
    this.name = name;
  }

  public void setRun(int run) {
    this.run = run;
  }
}