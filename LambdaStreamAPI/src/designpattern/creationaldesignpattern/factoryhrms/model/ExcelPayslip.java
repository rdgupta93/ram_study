package designpattern.creationaldesignpattern.factoryhrms.model;

public class ExcelPayslip implements PaySlip{
    @Override
    public void generatePayslip() {
        System.out.println("Generating excel payslip");
    }
}
