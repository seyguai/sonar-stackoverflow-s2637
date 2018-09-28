public enum Status {
    ALPHA, BETA, GAMMA;

    public boolean isAlpha() {
        return this == ALPHA;
    }

    public boolean isBeta() {
        return this == BETA;
    }
}
