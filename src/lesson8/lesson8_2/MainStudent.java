package lesson8.lesson8_2;/*
 * Created by BASARAB EUGEN on 09.07.2018
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента наличием некой научной работы.
 *  а) Класс Student содержит переменные: String firstName, lastName, group. А также  double averageMark, содержащую среднюю оценку.
 *  б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
 *  в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80.
 *  Переопределить этот метод в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
 *  г) Создать массив типа Student, содержащий объекты класса Student и Aspirant. Вызвать метод getScholarship() для каждого элемента массива.  (Задание с урока)
 */

public class MainStudent {
    public static void main(String[] args) {

        Student Student1 = new Student("Basarab", "Eugen", "A", 4);
        Student Student2 = new Aspirant("Basarab", "Andrei", "B", 5, "MyJob");
        Aspirant Aspirant1 = new Aspirant("Basarab", "Alex", "C", 5, "MyWork");

        Student[] students = {Student1, Student2, Aspirant1};
        for (Student s : students) {
            System.out.println(s.getLastName() + " " + s.getScholarship());

        }
    }
}
