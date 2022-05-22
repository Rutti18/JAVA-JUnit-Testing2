package com.example;
public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
        System.out.println(tacos);
    }

    @Override
    public int tacosRemaining() {

        return this.tacos;

    }

    @Override
    public void eat() {

        if (tacos != 0) {
            tacos--;
        }

    }
    public static void main(String[] args) {
    	TripleTacoBox tacos = new TripleTacoBox();
	}

}