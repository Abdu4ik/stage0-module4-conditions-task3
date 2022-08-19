package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        if (salary<=0){

            System.out.println("wrong input");

        }

        if (salary <= 10000){

            System.out.println("Salary Tax = " + (salary/100)*15);

        }
        if (salary <= 20000 && salary > 10000){

            System.out.println("Salary Tax = " + (salary/100)*18);

        }
        if (salary > 20000){

            System.out.println("Salary Tax = " + (salary/10)*2);

        }

    }
}
