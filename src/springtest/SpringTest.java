/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springtest;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

/**
 *
 * @author max
 */
public class SpringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        DependsOnPrinter dependsOnPrinter = applicationContext.getBean(DependsOnPrinter.class);

        System.out.println(dependsOnPrinter.getPrinterText());
    }

}
