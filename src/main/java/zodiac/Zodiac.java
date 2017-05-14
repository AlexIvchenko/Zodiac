package zodiac;

public enum Zodiac {
    AQUARIUS(18),
    PISCES(20),
    ARIES(19),
    TAURUS(20),
    GEMINI(20),
    CANCER(22),
    LEO(22),
    VIRGO(22),
    LIBRA(22),
    SCORPIO(21),
    SAGITTARIUS(21),
    CAPRICORN(19);

    private final int lastDay;

    Zodiac(final int lastDay) {
        this.lastDay = lastDay;
    }

    public static Zodiac from(final int month, final int dayOfMonth) {
        checkArgs(month, dayOfMonth);
        Zodiac first = Zodiac.values()[((month - 1) + 11) % 12];
        Zodiac second = Zodiac.values()[month - 1];
        if (dayOfMonth <= first.lastDay) {
            return first;
        } else {
            return second;
        }
    }

    public static void checkArgs(final int month, final int dayOfMonth) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException(String.format("month (%s) must be in [1..12]", month));
        }
        if (dayOfMonth < 1 || dayOfMonth > 31) {
            throw new IllegalArgumentException(String.format("day of month (%s) must be in [1..31]", dayOfMonth));
        }
    }
}
