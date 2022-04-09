package com.example.starter.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Class StarterProperties that responsible for
 *
 * @author Mykola.Matsishin <br> created on 09 April 2022
 * @since 5.5
 */
@ConfigurationProperties(prefix = "my.custom")
public class StarterProperties {
    private String panda;
    private String secret;
    private Long number;
    private boolean useDefault;

    public String getPanda() {
        return panda;
    }

    public void setPanda(String panda) {
        this.panda = panda;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public boolean isUseDefault() {
        return useDefault;
    }

    public void setUseDefault(boolean useDefault) {
        this.useDefault = useDefault;
    }
}
