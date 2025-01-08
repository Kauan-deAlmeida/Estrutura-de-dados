package school.sptech.sprint1_nota1.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioMedioController {

    @GetMapping("/ex-02/{numero}")
    public Boolean exercicioMedio(@PathVariable int numero) {
        if(numero <= 1){
            return false;
        } else if(numero != 2 && numero != 3){
            if(numero%2==0 || numero%3==0) {
                return false;
            } else{
                for (int i = 5; i * i <= numero; i+=6) {
                    if(numero%i==0 || numero%(i+2) == 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
