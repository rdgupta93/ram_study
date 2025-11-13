package designpattern.creationaldesignpattern.builder;
/*
Builder Design Patter
Complex object creation - There are multiple ways to create an object, but constructors are the primary technique used for creating instances of a class.
Validation and failing object creation - There are cases when you want to validate the parameters before creating an object. For example, you might
want to validate the parameters before creating a database connection. If the parameters are invalid, you might want to throw an exception However,
if we use the default constructor, we cannot fail object creation.


Validate like  - grad year < 2023
               - Validate phone number
               - name should be present      --> once all this validation pass then create the object


Possible Sol -
1) Validate in setter method - not possible
2) Validate in constructor -
                         i)difficult to manage so many attributes
                         ii) prone to errors
                         iii) if multiple constructors are present , validation logic will need to
                         be added in all of them.

  */

public class Main {
    public static void main(String[] args) {
      Student s = Student.builder()
              .phoneNumber("9873882999")
              .id(2)
              .gradYear(2014)
              .universityName("Delhi university")
              .psp(87)
              .name("null")
              .age(30)
              .build();

        System.out.println(s);
    }
}
