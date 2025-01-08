package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        String palavraInverdida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInverdida += palavra.charAt(i);
        }
        if(palavra.equalsIgnoreCase(palavraInverdida)){
            return true;
        }
        return false;
    }

//    OU
//    @GetMapping("/ex-01-segunda-forma/{palavra-desejada}")
//    public Boolean exercicioFacilSegundoForma(@PathVariable String palavra) {
//        if(palavra.equalsIgnoreCase(new StringBuilder(palavra).reverse().toString())){
//            return true;
//        }
//        return false;
//    }
}
