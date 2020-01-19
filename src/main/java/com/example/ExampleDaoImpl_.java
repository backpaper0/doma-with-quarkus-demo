package com.example;

import org.seasar.doma.config.Config;

@javax.enterprise.context.ApplicationScoped
public class ExampleDao_ extends ExampleDao {

    ExampleDao_() {
        super(new Config() {
            public javax.sql.DataSource getDataSource() {
                return null;
            }
            public org.seasar.doma.jdbc.dialect.Dialect getDialect() {
                return null;
            }
        });
    }

    ExampleDao_(Config c) {
        super(c);
    }
}
