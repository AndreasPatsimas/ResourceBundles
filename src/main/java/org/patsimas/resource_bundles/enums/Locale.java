package org.patsimas.resource_bundles.enums;

public enum Locale {

    EL_GR("gr"),
    EN_US("en");

    private final String code;

    Locale(String v) {
        code = v;
    }

    public String code() {
        return code;
    }

    public static Locale fromValue(String v) {
        for (Locale c: Locale.values()) {
            if (c.code == v) {
                return c;
            }
        }
        throw new IllegalArgumentException(String.valueOf(v));
    }
}
