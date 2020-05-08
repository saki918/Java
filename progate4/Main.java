package progate4;

public class Main {
  public static void main(String[] args) {
    // // インスタンスの生成
    // Person person = new Person();
    // person.hello();
    
    // Personクラスのインスタンスを生成し、変数person1に代入してください
    Person person0 = new Person("Kate Jones");

    // person1のインスタンスフィールドnameに「Kate Jones」をセットしてください
    // person1.name = "Kate Jones";
    
    // person1に対して、helloメソッドを呼び出してください
    person0.hello();

    // person1のインスタンスフィールドnameの値を出力してください
    System.out.println(person0.name);

    // Personクラスのインスタンスを生成し、変数person2に代入してください
    Person person2 = new Person("John Christopher Smith");

    // person2のインスタンスフィールドnameに「John Christopher Smith」をセットしてください
    // person2.name = "John Christopher Smith";

    // person2に対して、helloメソッドを呼び出してください
    person2.hello();


    // person2のインスタンスフィールドnameの値を出力してください
    System.out.println(person2.name);

    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);

    System.out.println(person1.firstName);
    System.out.println(person1.lastName);
    System.out.println(person1.age);
    System.out.println(person1.height);
    System.out.println(person1.weight);

    Person person3 = new Person("Kate", "Jones", 27, 1.6, 50.0);

    System.out.println(person3.fullName());
    System.out.println(person3.age);
    System.out.println(person3.bmi());
    person3.printData();
    // 「合計◯◯人です」と出力してください
    System.out.println("合計" + Person.count + "人です");

    // printCountメソッドを呼び出してください
    Person.printCount();

    Person person4 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person4.printData();

    // middleNameとして「Christopher」を渡してください
    Person person5 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person5.printData();

    Person.printCount();

    // person2に対して、getMiddleNameメソッドを呼び出し、「person2のミドルネームは◯◯です」と出力してください
    System.out.println("person5のミドルネームは" + person5.getMiddleName() + "です");
    // person1のmiddleNameフィールドの値を「Claire」にしてください
    person5.setMiddleName("Claire");
    System.out.println("ミドルネームを" + person5.getMiddleName() + "に変更しました");
    person5.printData();
  }
}