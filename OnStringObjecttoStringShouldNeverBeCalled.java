package javacodechecker; 
public class OnStringObjecttoStringShouldNeverBeCalled {
	String msg = "HEY";
	
	public void methods() {
	String message = "HEY THERE";
	// EMB-ISSUE: CodeIssueNames.ON_STRING_OBJECT_TOSTRING_SHOULD_NEVER_BE_CALLED
	System.out.println(message.toString());
	}

	public void methods1() {
	String messages = "HEY THERE";
	// EMB-ISSUE: CodeIssueNames.ON_STRING_OBJECT_TOSTRING_SHOULD_NEVER_BE_CALLED/no-detect
	System.out.println(messages);
	}
	public void method2() {
		// EMB-ISSUE: CodeIssueNames.ON_STRING_OBJECT_TOSTRING_SHOULD_NEVER_BE_CALLED
		System.out.println(msg.toString());
	}
	public void method3() {
		// EMB-ISSUE: CodeIssueNames.ON_STRING_OBJECT_TOSTRING_SHOULD_NEVER_BE_CALLED/no-detect
		System.out.println(msg);
	}
	public void method4(){
	messages = "HEY THERE";
	// EMB-ISSUE: CodeIssueNames.ON_STRING_OBJECT_TOSTRING_SHOULD_NEVER_BE_CALLED/no-detect
	System.out.println(messages);
	}
}
