package arrays;

class Test {

 

    void print() {

 

        System.out.println(“Test”);

 

    }

 

}

 

 

 

class Main extends Test {

 

    void print() {

 

        super.print();

 

        System.out.println(“Main”);

 

    }

 

 

 

    public static void main(String[] args) {

 

        Main obj = new Main();

 

        obj.print();

 

    }

 

}

	