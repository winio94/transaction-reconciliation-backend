package com.winio94.recruitment.transactionreconciliation;

import com.winio94.recruitment.transactionreconciliation.service.DummyService;
import com.winio94.recruitment.transactionreconciliation.service.DummyServiceImpl;
import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class AppConfig {

    @Bean
    public DummyService dummyService() {
        return new DummyServiceImpl();
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.ENGLISH);
        return slr;
    }
}