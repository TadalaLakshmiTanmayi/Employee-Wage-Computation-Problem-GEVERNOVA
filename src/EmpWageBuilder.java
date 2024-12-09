public class EmpWageBuilder implements IEmpWageBuilder {
    private CompanyEmpWage[] companyEmpWages;
    private int numberOfCompanies;
    private int companyIndex = 0;

    // Constructor to initialize the array to store company objects
    public EmpWageBuilder(int numberOfCompanies) {
        this.numberOfCompanies = numberOfCompanies;
        companyEmpWages = new CompanyEmpWage[numberOfCompanies];
    }

    // Method to add company wage details to the array
    @Override
    public void addCompanyEmpWage(String companyName, int wagePerHr, int workingDaysPerMonth, int totalWorkingHrs) {
        companyEmpWages[companyIndex] = new CompanyEmpWage(companyName, wagePerHr, workingDaysPerMonth, totalWorkingHrs);
        companyIndex++;
    }

    // Method to calculate the wage for all companies
    @Override
    public void calculateWagesForAllCompanies() {
        for (int i = 0; i < numberOfCompanies; i++) {
            companyEmpWages[i].calculateEmployeeWage();
        }
    }
}
