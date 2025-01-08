package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        ExercicioDificilResponse exd = new ExercicioDificilResponse();
        int fib = 1;
        int termo = 0;
        int soma = 0;
        if(n > 0){
            for(int i = 1; i <= n; i++) {
                soma += fib;
                fib += termo;
                termo = fib - termo;
            }
        }
        exd.setEnesimoTermo(termo);
        exd.setSoma(soma);
        return exd;
    }
}
