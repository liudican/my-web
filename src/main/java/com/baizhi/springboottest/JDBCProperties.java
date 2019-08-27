package com.baizhi.springboottest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "jdbc")
public class JDBCProperties {

    private String url;
    private String driver;
    private String username;
    private String password;
}
