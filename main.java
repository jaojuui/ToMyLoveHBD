class main {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            System.out.println("°  .   '   ,   :  H a p p y    b i r t h d a y ! °  .   '   ,   :");
            Thread.sleep(3000);
            System.out.println("- - - - -    H A V E    A    G O O D   Y E A R   N A   K U B - - - - -");
            System.out.println("\n");
            for (int i = 0; i < 1000; i++) {
                Thread.sleep(100);
                message jaojui = new message(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}