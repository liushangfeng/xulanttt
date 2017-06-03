package org.coach.tdd.template;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    @Test
    public void shouldSomeLibraryMethodReturnTrue() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test
    public void cellRealizeTestThreeAlive(){
        Library cell =  new Library();
        assertTrue(cell.haveThreeAlive(1,3,3));
    }

    @Test
    public void cellRealizeTestTwoKeep() throws Exception {
        Library cell =  new Library();
        assertTrue(cell.haveTwokeep(1,3,2));
    }

    @Test
    public void cellRealizeTestDead() throws Exception {
        Library cell =  new Library();
        assertTrue(cell.haveDead(1,3));
    }

    @Test
    public void demon() throws Exception {
        Library cell =  new Library();
        assertTrue(cell.resolve(4,5));
    }


}


