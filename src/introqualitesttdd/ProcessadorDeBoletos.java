package introqualitesttdd;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class ProcessadorDeBoletos {
    public void processarBoleto(ArrayList<Boleto> boleto){
        Fatura fatura = boleto.get(0).getFatura();
        if(fatura.getValor()== (boleto.get(0).getValor())){
            fatura.setEstaPago(true);
        }
        Pagamento pg = new Pagamento();
        pg.setTipo("boleto");
        fatura.adicionarPagamentos(pg);
    }
    
}
