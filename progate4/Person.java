package progate4;

public class Person {
  // int型のクラスフィールドcountを定義し、0を代入してください
  public static int count = 0;
  public String name;
  public String firstName;
  // インスタンスフィールドmiddleNameを定義してください
  public String middleName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  // コンストラクタを定義してください
  Person(String name) {
    System.out.println("インスタンスが生成されました");
    this.name = name;
  }
  // コンストラクタの定義
  Person(String firstName, String lastName, int age, double height, double weight) {
    // 変数countに1を足してください
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    // 下のコメントアウト５行分を１行に略す
    this(firstName, lastName, age, height, weight);
    Person.count++;
    this.middleName = middleName;
    // this.firstName = firstName;
    // this.lastName = lastName;
    // this.age = age;
    // this.height = height;
    // this.weight = weight;
  }

  // middleNameフィールドのゲッターを定義してください privateのインスタントフィールドをMainで呼び出す
  // フィールドの値を取得するために、フィールドの値を返すだけのメソッド
  public String getMiddleName() {
    return this.middleName;
  }

  // middleNameフィールドのセッターを定義してください フィールドの値を変更するメソッド
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  // fullNameメソッドを定義してください
  public String fullName() {
    // return this.firstName + " " + this.lastName;
    // 以下を、middleNameがない場合とある場合で条件分岐を行ってください
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  // bmiメソッドを定義してください
  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public void hello() {
    // 「こんにちは」と出力されるように書き換えてください
    System.out.println("こんにちは");
    // thisを用いて、「こんにちは、私は◯◯です」で出力するように以下を書き換えてください
    System.out.println("こんにちは、私は" + this.name + "です");
  }

  // printDataメソッドを定義してください
  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    // Math.round()で引数の小数点以下を四捨五入して返すroundメソッド
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  // クラスメソッドprintCount()を定義してください
  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}