package com.company;

public class Substance {

    private String substanceName;
    private String elementsC;
    private String elementsH;
    private final int ArC=12;
    private final int ArH=1;
    private int n;
    private int amountElements;
    private int amountAtoms;
    private String stateAgregation;
    public Substance (int n, int amountElements, int amountAtoms){
        setN(n);
        setAmountElements(amountElements);
        setAmountAtoms(amountAtoms);
    }

    public String names(String polyethylene) {
        String substanceName = polyethylene;
        return substanceName;
    }
    public float calculationMolecularMass (int ArC, int ArH,int n) {
        float k;
        k=(ArC+ArH)*n;
        return k;
    }
    public int amounts ()

    public static void main(String[] args) {// write your code here
    }
}
