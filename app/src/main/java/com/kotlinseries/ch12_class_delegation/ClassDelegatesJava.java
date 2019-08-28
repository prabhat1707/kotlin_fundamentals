package com.kotlinseries.ch12_class_delegation;

public class ClassDelegatesJava {

   void start(){
       JavaEmployee employee = new JavaEmployee(new Designer(),new Coders());
       employee.code();
       employee.design();
   }
}

class JavaEmployee implements WhoCanDesign, WhoCanCode {
    private WhoCanDesign whoCanDesign;
    private WhoCanCode whoCanCode;


    JavaEmployee(WhoCanDesign whoCanDesign, WhoCanCode whoCanCode) {
        this.whoCanCode = whoCanCode;
        this.whoCanDesign = whoCanDesign;
    }

    @Override
    public void design() {
        whoCanDesign.design();
    }

    @Override
    public void code() {
        whoCanCode.code();
    }
}
