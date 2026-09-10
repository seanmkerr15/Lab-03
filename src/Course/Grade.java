package Course;

public enum Grade {
    A, B, C, D, F, NOT_ASSIGNED;
    @Override
    public String toString() {
        if (this == NOT_ASSIGNED) {
            return "N/A";
        }
        return name();
    }
}
