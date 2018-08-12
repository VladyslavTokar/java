package ua.pp.tokar;

public class Main {

    public static void main(String[] args) {

        BinaryPrinter my = new BinaryPrinter(18);
        my.setSize(22);

        System.out.println("Size value = " + my.getSize());

        my.print(16);
	// write your code here
    }
}
