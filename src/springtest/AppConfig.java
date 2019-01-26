/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author max
 */
@Configuration
public class AppConfig {

    @Bean
    public DependsOnPrinter dependsOnPrinter() {
        return new DependsOnPrinter(printer());
    }

    @Bean
    public Printer printer() {
        return new Printer();
    }
}
