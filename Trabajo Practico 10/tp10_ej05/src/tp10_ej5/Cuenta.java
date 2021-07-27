/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp10_ej5;

/**
 * 
 * @author Adrian E. Camus
 */
public class Cuenta {
public String nroCuenta;
public float saldo;
public String banco;

    public void deposito(float deposito){
        this.saldo = this.saldo + deposito;
        System.out.println("Deposito recibido");
    }
    
    public void pago(float pago){
        this.saldo = this.saldo - pago;
        System.out.println("Pago Realizado");
    }

    public void transferencia(float monto, Cuenta c1, Cuenta c2){
        c1.pago(monto);
        c2.deposito(monto);
        System.out.println("Se debito de la cuenta "+c1.getNroCuenta()+" $ "+monto);
        System.out.println("Se deposito en la cuenta "+c2.getNroCuenta()+" $ "+monto);
        
    }
    
    
    //getters & setters
    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}
