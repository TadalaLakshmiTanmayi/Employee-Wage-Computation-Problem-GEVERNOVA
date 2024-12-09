public interface IEmpWageBuilder {
    void addCompanyEmpWage(String companyName, int wagePerHr, int workingDaysPerMonth, int totalWorkingHrs);
    void calculateWagesForAllCompanies();
}
