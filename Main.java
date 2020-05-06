import java.util.Scanner;

// mainのクラス
class Main {
  // mainメソッド
  public static void main(String[] args) {
    //Person.hello();
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前： ");

    // 変数nameを定義し、コンソールから文字列を受け取って代入してください
    String name0 = scanner.next();

    // 「こんにちは◯◯さん」と出力してください
    System.out.println("こんにちは" + name0 + "さん");
    hello();
    // printDataメソッドを呼び出してください
    printData();
    // 引数に「Kate Jones」を渡してください
    printData("Kate Jones");

    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith",78);
    // それぞれ年齢に関する引数(仮引数で設定した順番通り)を追加してください
    printData("Kate Jones", 27);
    printData("John Christopher Smith", 65);
    // fullNameメソッドの結果を変数nameに代入してください
    String name = fullName("Kate", "Jones");
    // printDataの引数を書き換えてください
    printData(name, 27);
    printData(fullName("Kate", "Jones"), 27);

    // fullNameメソッドを用いて、printDataの引数を書き換えてください
    printData(fullName("John", "Christopher", "Smith"), 65);

    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

  // helloメソッド
  public static void hello() {
    // "Hello World"を、"Hello Java"に書き換えてください
    System.out.println("Hello Java");
  }

  // printDataメソッドを定義してください
  public static void printData() {
    System.out.println("私の名前はKate Jonesです");
  }
  
  // 引数を受け取るようにしてください
  public static void printData(String name) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は" + name + "です");
  }
  // 複数の仮引数を指定
  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は" + age + "歳です");
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");

    // 変数bmiに、bmiメソッドを用いてBMIを代入してください
    double bmi = bmi(height, weight);

    // 変数bmiを用いて、「BMIは◯◯です」と出力してください
    System.out.println("BMIは" + bmi + "です");

    // isHealthyメソッドの結果で条件分岐を行ってください
    if (isHealthy(bmi)) {
      System.out.println("健康です");
    } else {
      System.out.println("健康ではありません");
    }

  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String lastName) {
    // （" "を連結しているのは、姓と名の間に空白をあけるためです）
    return firstName + " " + lastName;
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  // bmiメソッドを定義してください
  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  // isHealthyメソッドを定義してください 健康である人の条件を処理に表記
  public static boolean isHealthy(double bmi) {
    return bmi >= 18.5 && bmi < 25;
  }
}