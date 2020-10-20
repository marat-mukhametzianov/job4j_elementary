package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void rookWayIs6() {
        int way = ChessBoard.rookWay(0, 0, 0, 6);
        assertThat(way, is(6));
    }

    @Test
    public void rookWayIs5() {
        int way = ChessBoard.rookWay(0, 0, 5, 0);
        assertThat(way, is(5));
    }

    @Test
    public void rookWayIs0() {
        int way = ChessBoard.rookWay(0, 0, 5, 6);
        assertThat(way, is(0));
    }

    @Test
    public void knightWayIs5() {
        int way = ChessBoard.knightWay(0, 10, 5, 5);
        assertThat(way, is(5));
    }

    @Test
    public void knightWayIs0() {
        int way = ChessBoard.knightWay(1, 10, 5, 5);
        assertThat(way, is(0));
    }

    @Test
    public void knightWayNegativeValueIs0() {
        int way = ChessBoard.knightWay(-1, 10, 5, 5);
        assertThat(way, is(0));
    }
}