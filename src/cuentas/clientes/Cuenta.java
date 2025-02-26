package cuentas.clientes;

public class Cuenta {


    private String nombre;
    private String cuenta;
    private double saldocuenta;
    private double tipoInteres;

    public Cuenta()
    {
        nombre ="";
        cuenta="";
        saldocuenta=0;
        tipoInteres=0;
    }

    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldocuenta=sal;
        tipoInteres=tipo;
    }

    public double estado()
    {
        return saldocuenta;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldocuenta = saldocuenta + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldocuenta = saldocuenta - cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldocuenta() {
        return saldocuenta;
    }

    public void setSaldocuenta(double saldocuenta) {
        this.saldocuenta = saldocuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
