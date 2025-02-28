public class Main {

    public static int ID = 0;



    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addNewEmployee(
                new Employee("Данна", "Кузнецова", "Леонидовна", 1342, 1));
        employeeBook.addNewEmployee(
                new Employee("Ирма", "Панова", "Оскаровна", 73827, 2));
        employeeBook.addNewEmployee(
                new Employee("Сильвия", "Мухина", "Святославовна", 342, 4));
        employeeBook.addNewEmployee(
                new Employee("Сильвия", "Шубина", "Еремеевна", 23423, 4));
        employeeBook.addNewEmployee(
                new Employee("Илона", "Емельянова", "Эльдаровна", 34435, 5));
        employeeBook.addNewEmployee(
                new Employee("Осип", "Баранов", "Вениаминович", 423432, 4));
        employeeBook.addNewEmployee(
                new Employee("Феликс", "Тихонов", "Юрьевич", 42342, 3));
        employeeBook.addNewEmployee(
                new Employee("Исак", "Нестеров", "Антонович", 345532, 2));
        employeeBook.addNewEmployee(
                new Employee("Степан", "Молчанов", "Демьянович", 123313, 4));
        employeeBook.addNewEmployee(
                new Employee("Венедикт", "Гаврилов", "Григорьевич", 234142, 5));


        employeeBook.removeEmployee(7);
        employeeBook.printAllEmployees();
        System.out.println();
        System.out.println(employeeBook.findEmployeeWithMaxSalary());


    }
}