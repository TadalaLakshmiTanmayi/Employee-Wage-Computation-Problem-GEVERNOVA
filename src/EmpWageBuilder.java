import java.util.ArrayList;

public class EmpWageBuilder implements IEmpWageBuilder {
    private ArrayList<CompanyEmpWage> companyEmpWages;  // Use ArrayList instead of array

    // Constructor initializes the ArrayList
    public EmpWageBuilder() {
        companyEmpWages = new ArrayList<>();
    }

    // Method to add company wage details to the list
    @Override
    public void addCompanyEmpWage(String companyName, int wagePerHr, int workingDaysPerMonth, int totalWorkingHrs) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName, wagePerHr, workingDaysPerMonth, totalWorkingHrs);
        companyEmpWages.add(companyEmpWage);
    }

    // Method to calculate the wage for all companies
    @Override
    public void calculateWagesForAllCompanies() {
        for (CompanyEmpWage company : companyEmpWages) {
            company.calculateEmployeeWage();
        }
    }

    // Method to get the total wage by company name
    public int getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage company : companyEmpWages) {
            if (company.getCompanyName().equalsIgnoreCase(companyName)) {
                return company.getTotalWage();
            }
        }
        return -1;  // If company not found
    }
}
