package nl.seiferd.adventofcode.mmxvii;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class Day_1Test {

    private final Day_1 day_1 = new Day_1();

    @Test
    void partOne(){
        assertThat(day_1.partOne(new int[]{ +1, -2, +3, +1 }), is(3));
        assertThat(day_1.partOne(new int[]{ +1, +1, +1 }), is(3));
        assertThat(day_1.partOne(new int[]{ +1, +1, -2 }), is(0));
        assertThat(day_1.partOne(new int[]{ -1, -2, -3 }), is(-6));
    }

    @Test
    void partTwo(){
        assertThat(day_1.partTwo(new int[]{ +1, -2, +3, +1 }), is(2));
        assertThat(day_1.partTwo(new int[]{ +1, -1 }), is(0));
        assertThat(day_1.partTwo(new int[]{ +3, +3, +4, -2, -4 }), is(10));
        assertThat(day_1.partTwo(new int[]{ -6, +3, +8, +5, -6 }), is(5));
        assertThat(day_1.partTwo(new int[]{ +7, +7, -2, -7, -4 }), is(14));
    }
}
