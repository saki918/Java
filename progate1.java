import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.print("名前： ");
  
    // 変数nameを定義し、コンソールから文字列を受け取って代入してください
    String name0 = scanner.next();
  
    // 「こんにちは◯◯さん」と出力してください
    System.out.println("こんにちは" + name0 + "さん");

    System.out.println("Hello Java");
    System.out.println("こんにちは、Java");
    System.out.println(12/3);
    // "こんにちは"と"世界"を連結して出力してください
    System.out.println("こんにちは" + "世界");

    // "38"と"19"を連結して出力してください
    System.out.println("38" + "19");

    // 38と19を足して出力してください
    System.out.println(38 + 19);

    // String型の変数nameを定義してください
    String name;

    // 変数nameに"Wanko"を代入してください
    name = "Wanko";

    // 変数nameを出力してください
    System.out.println(name);

    // 変数の初期化
    int number1 = 3;

    // int型の変数number2を定義し、7を代入してください
    int number2 = 7;

    // number1 * number2を出力してください
    System.out.println(number1 * number2);

    // 変数textに「プログラミングを勉強しよう」を代入してください
    String text = "プログラミングを勉強しよう";

    // 「Progateで」と変数textを連結して出力してください
    System.out.println("Progateで" + text);

    int number = 11;
    String text1 = "Ruby";
    System.out.println(number);
    System.out.println(text1);

    // 変数numberを9で上書きしてください
    number = 9;

    // 変数numberを出力してください
    System.out.println(number);

    // 変数text1を「Java」で上書きしてください
    text1 = "Java";

    // 変数text1を出力してください
    System.out.println(text1);

    // 自己代入
    int number0 = 3;
    System.out.println(number);

    // 変数number0の値に7を足して、変数numberを上書きしてください
    number0 = number0 + 7;

    // 変数numberを出力してください
    System.out.println(number0);

    // 自己代入の省略
    int number3 = 8;

    // 変数numberに7をかけて、変数numberを上書きしてください
    number3 *= 7;

    // 変数numberを出力してください
    System.out.println(number3);

    // 変数numberの値に1を足して、変数numberを上書きしてください
    number3++;

    // 変数numberを出力してください
    System.out.println(number3);

    int length = 6;
    int height = 8;

    // 変数rectangleAreaに、四角形の面積を代入してください
    int rectangleArea = length * height;

    // 変数rectangleAreaを出力してください
    System.out.println(rectangleArea);

    // 変数triangleAreaに、三角形の面積を代入してください
    int triangleArea = length * height / 2;

    // 変数triangleAreaを出力してください
    System.out.println(triangleArea);

    // double型の変数number1を定義し、8.5を代入してください。
    double number5 = 8.5;

    // double型の変数number2を定義し、3.4を代入してください。
    double number6 = 3.4;

    // number1にnumber2を足した値を出力してください
    System.out.println(number5 + number6);

    // number1からnumber2を引いた値を出力してください
    System.out.println(number5 - number6);

    // 型の自動変換
    int month = 12;
    int date = 31;

    // 「12月31日」となるように変数と文字列を連結して出力してください
    System.out.println(month + "月" + date + "日");

    // 7を2で割った値を出力してください
    System.out.println(7 / 2);

    // 7.0を2.0で割った値を出力してください
    System.out.println(7.0 / 2.0);

    // 7を2.0で割った値を出力してください
    System.out.println(7 / 2.0);

    int number7 = 7;
    int number8 = 2;
    System.out.println(number7 / number8);

    // number1をdouble型にキャスト(強制型変換)し、number2で割った値を出力してください
    System.out.println((double) number7 / number8);
  }
}