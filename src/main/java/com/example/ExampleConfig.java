package com.example;

@javax.enterprise.context.ApplicationScoped
public class ExampleConfig implements org.seasar.doma.jdbc.Config {

    @javax.inject.Inject
    javax.sql.DataSource dataSource;

    public javax.sql.DataSource getDataSource() {
        return dataSource;
    }

    public org.seasar.doma.jdbc.dialect.Dialect getDialect() {
        return new org.seasar.doma.jdbc.dialect.H2Dialect();
    }
}
