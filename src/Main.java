public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String  lastName = "Ivanov";

        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        System.out.printf("ФИО сотрудника -%s", fullName);
    }
    public static void task2(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String  lastName = "Ivanov";

        String fullName = String.format("%s %s %s,", lastName, firstName, middleName);
        String fullNameInUpperCase = fullName.toUpperCase();
        System.out.println(fullNameInUpperCase);
    }
    public static void task3(){
        String firsName = "Семён";
        String middleName = "Семёнович";
        String lasName = "Иванов";

        String fullName = String.format("%s %s %s", lasName, firsName, middleName);

        char incorectSymbol = 'ё';
        char correctSymbol = 'е';

        String correctFullName = fullName.replace(incorectSymbol,correctSymbol);
        System.out.println(correctFullName);


    }
}