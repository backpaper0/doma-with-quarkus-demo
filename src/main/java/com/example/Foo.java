package com.example;

public class Foo {

    private javax.sql.DataSource ds;

    public Foo() {
        System.out.println("Foo default constructor is called: " + getClass().getName());
    }

    public Foo(javax.sql.DataSource ds) {
        this.ds = ds;
    }

    public javax.sql.DataSource getDataSource() {
        return ds;
    }
}
