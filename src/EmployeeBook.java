public class EmployeeBook {

    private Employee[] employee = new Employee[10];

    //вывод в консоль всех сотрудников
    void printAllEmployees() {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i]);
            }
        }
    }

    //Добавление нового сотрудника
    boolean addNewEmployee(Employee newEmploeed) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = newEmploeed;
                return true;
            }
        }
        return false;
    }

    //удаление сотрудника по ID
    boolean removeEmployee(int forID) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getID() == forID) {
                employee[i] = null;
                return true;
            }
        }
        return false;
    }

    //поиск сотрудника по ID
    Employee findEmployee(int forID) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null){
                if(employee[i].getID() == forID){
                    return employee[i];
                }
            }
        } return null;
    }

    //подсчет затрат на зарплату сотрудников
    float amountOfCosts() {
        float summ = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                summ += employee[i].getSalary();
            }
        }
        return summ;
    }

    //поиск сотрудника с минимальной зарплатой
    Employee findEmployeeWithMinSalary() {
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
    Employee findEmployeeWithMaxSalary() {
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
    float averageSalary() {
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
    void printFullNameAllEmployees() {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].fullName());
            }
        }
    }

    //Индексация зарплаты
    void salaryIndexation(int percent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                employee[i].setSalary(employee[i].getSalary() * (100 + percent) / 100);
            }
        }
    }

    //подсчет затрат на зарплату сотрудников отдела
    float amountOfCosts(int forDepartment) {
        float summ = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                summ += employee[i].getSalary();
            }
        }
        return summ;
    }

    //поиск сотрудника отдела с минимальной зарплатой
    Employee findEmployeeWithMinSalary(int forDepartment) {
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
    Employee findEmployeeWithMaxSalary(int forDepartment) {
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
    float averageSalary(int forDepartment) {
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
    void salaryIndexation(int forDepartment, int percent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                employee[i].setSalary(employee[i].getSalary() * (100 + percent) / 100);
            }
        }
    }

    //Печать всех сотрудников отдела
    void printAllEmployees(int forDepartment) {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }


}
