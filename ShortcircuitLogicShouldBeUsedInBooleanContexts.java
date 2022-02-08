package javacodechecker;

public class ShortcircuitLogicShouldBeUsedInBooleanContexts {
	public void logic() {
		// EMB-ISSUE: CodeIssueNames.SHORTCIRCUIT_LOGIC_SHOULD_BE_USED_IN_BOOLEAN_CONTEXTS
		if(getTrue() | getFalse()) {
		logger.info("This output"+"gets print");
        }
        else {
       logger.info("This output"+"will not be printed");
        }
		}
	
	public void logic1() {
		// EMB-ISSUE: CodeIssueNames.SHORTCIRCUIT_LOGIC_SHOULD_BE_USED_IN_BOOLEAN_CONTEXTS/no-detect
		if(getTrue() || getFalse()) {
			logger.info("This output"+"gets print");
	        }
	        else {
	       logger.info("This output"+"will not be printed");
	        }
			 
		}
	public void logic2() {
		// EMB-ISSUE: CodeIssueNames.SHORTCIRCUIT_LOGIC_SHOULD_BE_USED_IN_BOOLEAN_CONTEXTS
		if(getTrue() & getFalse()) {
		logger.info("This output"+"gets print");
        }
        else {
        logger.info("This output"+"will not be printed");
        }
		}
	
	public void logic3() {
		// EMB-ISSUE: CodeIssueNames.SHORTCIRCUIT_LOGIC_SHOULD_BE_USED_IN_BOOLEAN_CONTEXTS/no-detect
		if(getTrue() && getFalse()) {
			logger.info("This output"+"gets print");
	        }
	        else {
	        logger.info("This output"+"will not be printed");
	        }
			 
		}

	}
	
