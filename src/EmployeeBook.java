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
    public boolean addNewEmployee(Employee newEmploeed) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                employee[i] = newEmploeed;
                return true;
            }
        }
        return false;
    }

    //удаление сотрудника по ID
    public boolean removeEmployee(int forID) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getID() == forID) {
                employee[i] = null;
                return true;
            }
        }
        return false;
    }

    //поиск сотрудника по ID
    public Employee findEmployee(int forID) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getID() == forID) {
                    return employee[i];
                }
            }
        }
        return null;
    }

    //подсчет затрат на зарплату сотрудников
    public float getSalaryCosts() {
        float summ = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                summ += employee[i].getSalary();
            }
        }
        return summ;
    }

    //поиск сотрудника с минимальной зарплатой
    public Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employeeWithMinSalary == null) {
                employeeWithMinSalary = employee[i];
            }
            if (employee[i] != null && employee[i].getSalary() <= employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee[i];
            }
        }
        return employeeWithMinSalary;
    }

    //поиск сотрудника с максимальной зарплатой
    public Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employeeWithMaxSalary == null) {
                employeeWithMaxSalary = employee[i];
            }
            if (employee[i] != null && employeeWithMaxSalary != null
                    && employee[i].getSalary() >= employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee[i];
            }
        }
        return employeeWithMaxSalary;
    }

    //среднее значение зарплаты
    public float getAnAverageSalary() {
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
    public void printFullNameAllEmployees() {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i].toStringFullName());
            }
        }
    }

    //Индексация зарплаты
    public void makeSalaryIndexation(int percent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                employee[i].setSalary(employee[i].getSalary() * (100 + percent) / 100);
            }
        }
    }

    //подсчет затрат на зарплату сотрудников отдела
    public float getSalaryCostsForDepartment(int forDepartment) {
        float summ = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                summ += employee[i].getSalary();
            }
        }
        return summ;
    }

    //поиск сотрудника отдела с минимальной зарплатой
    public Employee findEmployeeWithMinSalaryForDepartment(int forDepartment) {
        Employee employeeWithMinSalary = null;

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employeeWithMinSalary == null && employee[i].getDepartment() == forDepartment) {
                employeeWithMinSalary = employee[i];
            }
            if (employee[i] != null && employeeWithMinSalary != null
                    && employee[i].getSalary() <= employeeWithMinSalary.getSalary()
                    && employee[i].getDepartment() == forDepartment) {
                employeeWithMinSalary = employee[i];
            }
        }
        return employeeWithMinSalary;
    }

    //поиск сотрудника отдела с максимальной зарплатой
    public Employee findEmployeeWithMaxSalaryForDepartment(int forDepartment) {
        Employee employeeWithMaxSalary = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employeeWithMaxSalary == null && employee[i].getDepartment() == forDepartment) {
                employeeWithMaxSalary = employee[i];
            }
            if (employee[i] != null && employeeWithMaxSalary != null
                    && employee[i].getSalary() >= employeeWithMaxSalary.getSalary()
                    && employee[i].getDepartment() == forDepartment) {
                employeeWithMaxSalary = employee[i];
            }
        }
        return employeeWithMaxSalary;
    }

    //среднее значение зарплаты отдела
    public float getAnAverageSalaryForDepartment(int forDepartment) {
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
    public void makeSalaryIndexationForDepartment(int forDepartment, int percent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                employee[i].setSalary(employee[i].getSalary() * (100 + percent) / 100);
            }
        }
    }

    //Печать всех сотрудников отдела
    public void printAllEmployeesForDepartment(int forDepartment) {

        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == forDepartment) {
                System.out.println(employee[i].toStringWithoutDepartment());
            }
        }
    }


}
