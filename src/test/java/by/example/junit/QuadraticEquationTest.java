package by.example.junit;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */

public class QuadraticEquationTest
{
    @Test
    public void TwoRootsQuadraticEquation(){
        assertArrayEquals(new double[]{-5,-1}, QuadraticEquation.quadraticEquation(1,6,5), 0 );
    }
    @Test
    public void OneRealRootQuadraticEquation(){
        assertArrayEquals(new double[]{0}, QuadraticEquation.quadraticEquation(1,0,0), 0);

    }
    @Test
    public void NoSolutionQuadraticEquation() {
        assertArrayEquals(new double[]{0,0}, QuadraticEquation.quadraticEquation(0,1,1), 0);
    }
}