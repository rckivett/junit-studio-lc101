package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void imbalancedOpenBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void imbalancedClosedBracketsReturnsTrue() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void fullNestReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void imbalancedOpenCodeReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Code"));
    }
    @Test
    public void imbalancedClosedCodeReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Code]"));
    }
    @Test
    public void nestWithinWordReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void balancedBracketsBeforeTextReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void noBracketsReturnsTrue(){
    assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void closedBracketsBeforeOpenReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void openCloseReverseOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void onlyOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
}
