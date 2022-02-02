package com.BS4.YMLproperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @ConfigurationPropertiesScan
public class Controller {

    @Value("${VAR1}")
    private String var1;

//    @Value("${VAR3}")
//    private String var3;

    @Value("${VAR_SISTEMA3:Default}")
    private String var3;

    @Autowired
    Variable variable;

    @GetMapping("/ValuesYML")
    public String getVar(){

        String var2 = variable.getVAR2();



        return "valor de var1 es :" + var1 +" valor de my.var2 es: "+ var2;

    }

    @GetMapping("/var3YML")
    public String getVar3(){

        return "valor de var3 es :" + var3;
    }


}
