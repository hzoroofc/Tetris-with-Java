public class Salary {
    long income;

    Salary(long income) {
        this.income = income;
    }
}

public class Promotion {
    Salary salary;

    Promotion(Salary salary) {
        this.salary = salary;
    }

    public void promote() {
        salary.income += 1500;
    }
}