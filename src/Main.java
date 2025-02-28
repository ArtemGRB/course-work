public class Main {

    public static int ID = 0;
    static Employee[] employee = new Employee[10];

    //вывод в консоль всех сотрудников
    static void printAllEmployees() {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i]);
            }
        }
    }

    //подсчет затрат на зарплату сотрудников
    static float amountOfCosts() {
        float summ = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                summ += employee[i].getSalary();
            }
        }
        return summ;
    }

    //поиск сотрудника с минимальной зарплатой
    static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        float minSalary = 0;
        float salary;
        for (int i = 0; i < employee.length; i++) {
            if (minSalary == 0 && employee[i] != null) {
                minSalary = employee[i].getSalary();
            }
            if (employee[i] != null) {
                salary = employee[i].getSalary();
                if (salary <= minSalary) {
                    minSalary = salary;
                    employeeWithMinSalary = employee[i];
                }
            }
        }
        return employeeWithMinSalary;
    }

    //поиск сотрудника с максимальной зарплатой
    static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        float maxSalary = 0;
        float salary;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                salary = employee[i].getSalary();
                if (salary >= maxSalary) {
                    maxSalary = salary;
                    employeeWithMaxSalary = employee[i];
                }
            }
        }
        return employeeWithMaxSalary;
    }

    //среднее значение зарплаты
    static float averageSalary() {
        float summ = 0;
        float count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                summ += employee[i].getSalary();
                count++;
            }
        }
        return summ / count;
    }

    //Вывод в консоль ФИО всех сотрудников
    static void printFullNameAllEmployees() {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].fullName());
            }
        }
    }

    //Индексация зарплаты
    static void salaryIndexation(int percent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                employee[i].setSalary(employee[i].getSalary() * (100 + percent) / 100);
            }
        }
    }

    //подсчет затрат на зарплату сотрудников отдела
    static float amountOfCosts(int forDepartment) {
        float summ = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                summ += employee[i].getSalary();
            }
        }
        return summ;
    }

    //поиск сотрудника отдела с минимальной зарплатой
    static Employee findEmployeeWithMinSalary(int forDepartment) {
        Employee employeeWithMinSalary = null;
        float minSalary = 0;
        float salary;
        for (int i = 0; i < employee.length; i++) {
            if (minSalary == 0 && employee[i] != null && employee[i].getDepartment() == forDepartment) {
                minSalary = employee[i].getSalary();
            }
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                salary = employee[i].getSalary();
                if (salary <= minSalary) {
                    minSalary = salary;
                    employeeWithMinSalary = employee[i];
                }
            }
        }
        return employeeWithMinSalary;
    }

    //поиск сотрудника отдела с максимальной зарплатой
    static Employee findEmployeeWithMaxSalary(int forDepartment) {
        Employee employeeWithMaxSalary = null;
        float maxSalary = 0;
        float salary;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                salary = employee[i].getSalary();
                if (salary >= maxSalary) {
                    maxSalary = salary;
                    employeeWithMaxSalary = employee[i];
                }
            }
        }
        return employeeWithMaxSalary;
    }

    //среднее значение зарплаты отдела
    static float averageSalary(int forDepartment) {
        float summ = 0;
        float count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                summ += employee[i].getSalary();
                count++;
            }
        }
        return summ / count;
    }

    //Индексация зарплаты отдела
    static void salaryIndexation(int forDepartment, int percent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                employee[i].setSalary(employee[i].getSalary() * (100 + percent) / 100);
            }
        }
    }

    //Печать всех сотрудников отдела
    static void printAllEmployees(int forDepartment) {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }



    public static void main(String[] args) {


        employee[0] = new Employee("Дэнна", "Кузнецова", "Леонидовна", 1342, 1);
        employee[1] = new Employee("Ирма", "Панова", "Оскаровна", 73827, 2);
        employee[2] = new Employee("Сильвия", "Мухина", "Святославовна", 342, 4);
        employee[3] = new Employee("Сильвия", "Шубина", "Еремеевна", 23423, 4);
        employee[4] = new Employee("Илона", "Емельянова", "Эльдаровна", 34435, 5);
        employee[5] = new Employee("Осип", "Баранов", "Вениаминович", 423432, 4);
        employee[6] = new Employee("Феликс", "Тихонов", "Юрьевич", 42342, 3);
        employee[7] = new Employee("Исак", "Нестеров", "Антонович", 345532, 2);
        employee[8] = new Employee("Степан", "Молчанов", "Демьянович", 123313, 4);
        employee[9] = new Employee("Венедикт", "Гаврилов", "Григорьевич", 234142, 5);

        printAllEmployees();
        System.out.println(amountOfCosts());
        System.out.println(findEmployeeWithMinSalary());
        System.out.println(findEmployeeWithMaxSalary());
        System.out.println(averageSalary());
        salaryIndexation(10);
        printFullNameAllEmployees();

        printAllEmployees(4);
        System.out.println(amountOfCosts(4));
        System.out.println(findEmployeeWithMinSalary(4));
        System.out.println(findEmployeeWithMaxSalary(4));
        System.out.println(averageSalary(4));
        salaryIndexation(4, 10);
        printAllEmployees(4);

    }
}