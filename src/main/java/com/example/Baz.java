package com.example;

@javax.enterprise.context.Dependent
public class Baz extends com.example.sub.Foo {

    public Baz(javax.sql.DataSource ds) {
        super(ds);
        System.out.println("Baz constructor is called: " + getClass().getName() + " with " + ds);
    }
}
