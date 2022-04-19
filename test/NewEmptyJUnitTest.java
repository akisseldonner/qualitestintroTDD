/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import introqualitesttdd.Boleto;
import introqualitesttdd.Fatura;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
     ArrayList<Boleto> boletos = new ArrayList<>();
    public void adicionarBoletos(Boleto boleto){
        boletos.add(boleto);  
    }
    
    @Test
    public void teste1BoletoNaFatura(){
         // verificar se a fatura só tem 1 boleto
         // instanciar o objeto boleto
         // colocar o objeto boleto na fatura
         // realizar o teste
         Fatura faturaX = new Fatura();
         faturaX.setValor(25.00);
         Boleto boletoX = new Boleto();
         boletoX.setValor(25.00);
         processadorDeBoletos.processarBoleto(boletos);
         assertTrue(faturaX.isEstaPago());
         
         assertEquals(faturaX.getPagamentos().size(), 1);
         assertEquals(faturaX.getPagamentos().get(0).getTipo(),"boleto");
         
        
         
    }
    

}
