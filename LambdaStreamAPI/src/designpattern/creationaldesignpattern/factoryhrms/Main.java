package designpattern.creationaldesignpattern.factoryhrms;

/*
Factory Method :-
The simple factory pattern is a creational pattern that provides a static method for creating objects. The method can be used to create objects without
having to specify the exact class of the object that will be created. This is done by creating a factory class that contains a static method for creating objects.

Abstract Factory
The abstract factory pattern is a creational pattern that provides an interface for creating families of related or dependent objects without specifying
their concrete classes.

Advantages of Abstract Factory
Isolate concrete classes - The client code is not coupled to the concrete classes of the objects that it creates.
Easy to exchange product families - The client code can request an object from the factory class without having to know the class of the object that will
be returned. This makes it easy to exchange product families.
Promotes consistency among products - The client code can request an object from the factory class without having to know the class of the object
that will be returned. This makes it easy to maintain consistency among products.


 */

import designpattern.creationaldesignpattern.factoryhrms.model.PaySlip;

public class Main {
    public static void main(String[] args) {
        PaySlipFactory paySlipFactory = new PaySlipFactory();

        PaySlip paySlip1 = paySlipFactory.getPaySlip("pdf");
        paySlip1.generatePayslip();

        PaySlip paySlip2 = paySlipFactory.getPaySlip("excel");
        paySlip2.generatePayslip();

        PaySlip paySlip3 = paySlipFactory.getPaySlip("HTML");
        paySlip3.generatePayslip();
    }
}
