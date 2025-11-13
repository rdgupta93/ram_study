package designpattern.creationaldesignpattern.factoryhrms.model;

public class PdfPayslip implements PaySlip{

    @Override
    public void generatePayslip() {
        System.out.println("Generating pdf payslip");
    }
}
