package com.example;

@javax.enterprise.context.ApplicationScoped
public class Bar extends Foo {

    public Bar(javax.sql.DataSource ds) {
        super(ds);
        System.out.println("Bar constructor is called: " + getClass().getName() + " with " + ds);
    }
}
