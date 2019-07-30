package com.codewars.kata.kyu8;

/**
 * @see <a href="https://www.codewars.com/kata/596c55fc7bd5476bf60000d5">FIXME: Static electrickery</a>
 */
class Dinglemouse
{
    private static int ONE_HUNDRED = 100;
    static final Dinglemouse INST = new Dinglemouse();

    private final int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}