package progate5;

public class Bicycle {
  // インスタントフィールド
  private String name;
  private String color;
  private int distance = 0;
  private int run;

  // メソッド
  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");

  }

  // インスタンスメソッド
  public void run(int run) {
    this.distance += run;
    System.out.println(run + "km走ります");
    System.out.println("走行距離：" + this.distance + "km");
  }

  // コンストラクタ
  Bicycle(String name, String color) {
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

  // セッター
  public void setName(String name) {
    this.name = name;
  }

  public void setRun(int run) {
    this.run = run;
  }
}