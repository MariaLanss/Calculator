package pro.sky.java.cource2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class  Controller {
    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String showGreeting() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/plus")
    public String calculateAddition (@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return number1 + " + " + number2 + " = " + calculatorService.getCalculateAddition(number1,number2);
    }

    @GetMapping(path = "/minus")
    public String calculateSubtraction (@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return number1 + " - " + number2 + " = " + calculatorService.getCalculateSubtraction(number1,number2);
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiplication (@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return number1 + " * " + number2 + " = " + calculatorService.getCalculateMultiplication(number1,number2);
    }

    @GetMapping(path = "/divide")
    public String calculateDivision (@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        if(number2 == 0) {
            return "Делить на 0 нельзя";
        }
        return number1 + " / " + number2 + " = " + calculatorService.getCalculateDivision(number1, number2);
    }


}