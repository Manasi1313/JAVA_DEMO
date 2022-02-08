
package javacodechecker;

public class DoNotCallSystemExit {
	 
	public static void m() {
		// EMB-ISSUE: CodeIssueNames.DO_NOT_CALL_SYSTEM_EXIT
	System.exit(1);
		}
	public static void m2() {
		// EMB-ISSUE: CodeIssueNames.DO_NOT_CALL_SYSTEM_EXIT
	Runtime.exit(1);
		}
}
	
	
	
