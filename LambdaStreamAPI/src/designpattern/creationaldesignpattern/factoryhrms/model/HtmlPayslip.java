package designpattern.creationaldesignpattern.factoryhrms.model;

public class HtmlPayslip implements PaySlip{
    @Override
    public void generatePayslip() {
        System.out.println("Generating Html payslip");
    }
}
