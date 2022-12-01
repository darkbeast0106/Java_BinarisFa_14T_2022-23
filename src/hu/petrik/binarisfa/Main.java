package hu.petrik.binarisfa;

public class Main {
    public static void main(String[] args) {
        BinarisFa<Integer> bifa = new BinarisFa<>();
        int elemekSzama = 69;
        int legkisebb = 1;
        int legnagyobb = 420;
        System.out.println(bifa);
        for (int i = 0; i < elemekSzama; i++) {
            int ertek = (int)(Math.random() * (legnagyobb - legkisebb + 1)) + legkisebb;
            bifa.beszur(ertek);
        }
        System.out.println(bifa);
    }
}
