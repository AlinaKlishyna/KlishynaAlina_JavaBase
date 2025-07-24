package com.gmail.alinakotova102.corsoRanstad.classe_oggetti.getter_setter;

public class ContoBancario {
    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo>=0)
            this.saldo = saldo;
    }

    public void deposita(int soldi) {
        if (soldi>0)
            setSaldo(getSaldo() + soldi);
    }

    public void preleva(int soldi) {
        if (soldi<=getSaldo())
            setSaldo(getSaldo() - soldi);
    }
}
