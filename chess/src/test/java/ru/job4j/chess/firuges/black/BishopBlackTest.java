package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlackTest {

    @Test
    public void whenPositionC8() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Assert.assertEquals(bishopBlack.position(), Cell.C8);
    }

    @Test
    public void whenMoveToE6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure figure = bishopBlack.copy(Cell.E6);
        Assert.assertEquals(figure.position(), Cell.E6);
    }

    @Test
    public void whenMoveDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F4);
        Assert.assertTrue(bishopBlack.isDiagonal(Cell.F4, Cell.H2));
    }

    @Test
    public void whenMoveNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F4);
        Assert.assertFalse(bishopBlack.isDiagonal(Cell.F4, Cell.D5));
    }

    @Test
    public void whenWayFromC1ToG5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = bishopBlack.way(Cell.G5);
        Cell[] expected = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenWayFromE5ToB2() {
        Figure bishopBlack = new BishopBlack(Cell.E5);
        Cell[] rsl = bishopBlack.way(Cell.B2);
        Cell[] expected = new Cell[] {Cell.D4, Cell.C3, Cell.B2};
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenWayFromC7ToG3() {
        Figure bishopBlack = new BishopBlack(Cell.C7);
        Cell[] rsl = bishopBlack.way(Cell.G3);
        Cell[] expected = new Cell[] {Cell.D6, Cell.E5, Cell.F4, Cell.G3};
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenWayFromF2ToB6() {
        Figure bishopBlack = new BishopBlack(Cell.F2);
        Cell[] rsl = bishopBlack.way(Cell.B6);
        Cell[] expected = new Cell[] {Cell.E3, Cell.D4, Cell.C5, Cell.B6};
        Assert.assertEquals(expected, rsl);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayFromF2ToC3() {
        Figure bishopBlack = new BishopBlack(Cell.F2);
        bishopBlack.way(Cell.C3);
    }
}
