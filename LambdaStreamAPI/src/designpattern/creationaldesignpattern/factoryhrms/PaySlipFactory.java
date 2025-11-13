package designpattern.creationaldesignpattern.factoryhrms;

import designpattern.creationaldesignpattern.factoryhrms.model.ExcelPayslip;
import designpattern.creationaldesignpattern.factoryhrms.model.HtmlPayslip;
import designpattern.creationaldesignpattern.factoryhrms.model.PaySlip;
import designpattern.creationaldesignpattern.factoryhrms.model.PdfPayslip;

public class PaySlipFactory {

    public PaySlip getPaySlip (String format){
        if(format==null) return null;

        switch (format.toLowerCase()){
            case "pdf":return new PdfPayslip();
            case "excel": return new ExcelPayslip();
            case "html" : return new HtmlPayslip();

            default: throw new IllegalArgumentException("Unsupported payslip format: "+format);
        }
    }
}
