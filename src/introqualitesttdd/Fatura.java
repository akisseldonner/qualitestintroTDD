/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introqualitesttdd;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class Fatura {
    private double valor;
    private String data;
    private boolean estaPago;
    private String cliente;


    
    private ArrayList<Pagamento> pagamentos = new ArrayList<>();
    public void adicionarPagamentos(Pagamento pagamento){
        getPagamentos().add(pagamento);
        
    }
    
    
        
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the estaPago
     */
    public boolean isEstaPago() {
        return estaPago;
    }

    /**
     * @param estaPago the estaPago to set
     */
    public void setEstaPago(boolean estaPago) {
        this.estaPago = estaPago;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the pagamentos
     */
    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    /**
     * @param pagamentos the pagamentos to set
     */
    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
   
    
    
}
