package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {

    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        // Existing tests
        assertFalse("Expected false: un-cited publicly-available code",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
        
        // Additional tests
        assertTrue("Expected true: publicly available code cited",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, true, false));
        
        assertFalse("Expected false: coursework implementation required",
                RulesOf6005.mayUseCodeInAssignment(false, false, true, false, true));
    }
}
