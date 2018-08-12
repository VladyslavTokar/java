package ua.pp.tokar;

class BinaryPrinter {
    private int size;

    BinaryPrinter(){
        this.size = 10;
    }

    BinaryPrinter(int size){
        this.size = size;
    }

    void print(long value) {
        for(int i = size - 1; i >= 0; i--){
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
        //or
        //System.out.println(long.toBinaryString(value));
    }

    int getSize(){
        return size;
    }

    void setSize(int size){
        this.size = size;
    }
}
