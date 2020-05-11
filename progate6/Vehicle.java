package progate6;

abstract public class Vehicle {
  private String name;
  private String color;
  // protected にすることでスーパークラスとサブクラスまでインスタンスフィールドを使用することができる。
  protected int distance = 0;
  // クラスをデータ型として持たせることが出来る。
  private Person owner;

  Vehicle(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }

  public int getDistance() {
    return this.distance;
  }

  public Person getOwner() {
    return this.owner;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setOwner(Person person) {
    this.owner = person;
  }

  public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
  }
  // 継承メソッド
  abstract public void run(int distance);
}