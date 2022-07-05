package javacodechecker;

import java.util.regex.Pattern;

public class MultipleSpacesShouldBeAvoidedInRegularExpression {
    public void compiles() {
    	// EMB-ISSUE: CodeIssueNames.MULTIPLE_SPACES_SHOULD_BE_AVOIDED_IN_REGULAR_EXPRESSION
    Pattern  p = Pattern.compile("Hii  Good  Morning");
    Matcher matcher = p.matcher("");
    }
    public void nonCompiles() {	
    	// EMB-ISSUE: CodeIssueNames.MULTIPLE_SPACES_SHOULD_BE_AVOIDED_IN_REGULAR_EXPRESSION/no-detect
        Pattern  p = Pattern.compile("Hii {3}Good Morning");
        Matcher matcher = p.matcher("");
        }
    
    public void md() {
    	// EMB-ISSUE: CodeIssueNames.MULTIPLE_SPACES_SHOULD_BE_AVOIDED_IN_REGULAR_EXPRESSION
    	Pattern  p = Pattern.compile("Hii  Good Morning");	
    }
    public void mds() {
    	// EMB-ISSUE: CodeIssueNames.MULTIPLE_SPACES_SHOULD_BE_AVOIDED_IN_REGULAR_EXPRESSION
    	Pattern  p = Pattern.compile("Hii Good  Morning");	
    }
    public void tests() {
    // EMB-ISSUE: CodeIssueNames.MULTIPLE_SPACES_SHOULD_BE_AVOIDED_IN_REGULAR_EXPRESSION/no-detect	
    Pattern p = Pattern.compile("Hello, Have a nice day");
    }
}
