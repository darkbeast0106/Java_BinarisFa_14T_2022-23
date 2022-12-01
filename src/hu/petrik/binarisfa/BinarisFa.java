package hu.petrik.binarisfa;

public class BinarisFa<T extends Comparable<T>> {
    private BiFaELem<T> fej;

    public BinarisFa() {
        this.fej = null;
    }

    public void beszur(T ertek) {
        if (this.fej == null) {
            this.fej = new BiFaELem<>(ertek);
        } else {
            fej.beszur(ertek);
        }
    }

    @Override
    public String toString() {
        if (this.fej == null) {
            return "";
        }
        return this.fej.toString();
    }

    private class BiFaELem<T extends Comparable<T>> {
        private T ertek;
        private BiFaELem<T> bal;
        private BiFaELem<T> jobb;

        public BiFaELem(T ertek) {
            this.ertek = ertek;
            this.bal = null;
            this.jobb = null;
        }

        public T getErtek() {
            return ertek;
        }

        public void setErtek(T ertek) {
            this.ertek = ertek;
        }

        public BiFaELem<T> getBal() {
            return bal;
        }

        public void setBal(BiFaELem<T> bal) {
            this.bal = bal;
        }

        public BiFaELem<T> getJobb() {
            return jobb;
        }

        public void setJobb(BiFaELem<T> jobb) {
            this.jobb = jobb;
        }

        public void beszur(T ertek) {
            if (ertek.compareTo(this.ertek) < 0) {
                if (this.bal == null) {
                    this.bal = new BiFaELem<>(ertek);
                } else {
                    this.bal.beszur(ertek);
                }
            } else {
                if (this.jobb == null) {
                    this.jobb = new BiFaELem<>(ertek);
                } else {
                    this.jobb.beszur(ertek);
                }
            }
        }

        @Override
        public String toString() {
            String s = "";
            if (this.bal != null) {
                s += this.bal + ", ";
            }
            s += ertek;
            if (this.jobb != null) {
                s += ", " + this.jobb;
            }
            return s;
        }
    }
}
