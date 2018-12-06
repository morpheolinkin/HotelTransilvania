package teste;

import dominio.Lider;
import persistencia.LiderBD;

public class TesteFonte {
    public static void main(String[] args) {
        Lider lider = new Lider();
        lider.setCpf("028931");
        lider.setNome("Paulo matias");
        LiderBD.inserir(lider);

        System.out.println("Cadastrado com sucesso!");
    }
}
