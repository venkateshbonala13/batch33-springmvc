package com.java.cis;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class BMIRestController {

    @PostMapping("/bmirest")
    public String calculateBMI(@RequestParam("height") double height, @RequestParam("weight") double weight) {
        // Calculate BMI
        double bmi = weight / (height * height)* 703;

        // Format BMI as String
        String bmiResult = String.format("%.2f", bmi);

        return "BMI: " + bmiResult;
}
}