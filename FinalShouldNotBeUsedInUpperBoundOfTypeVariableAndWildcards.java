package javacodechecker;
public class FinalShouldNotBeUsedInUpperBoundOfTypeVariableAndWildcards {
	// EMB-ISSUE: CodeIssueNames.FINAL_SHOULD_NOT_BE_USED_IN_UPPER_BOUND_OF_TYPE_VARIABLE_AND_WILDCARDS
	public static <T extends String> T getMyString() {
		 
		}
	// EMB-ISSUE: CodeIssueNames.FINAL_SHOULD_NOT_BE_USED_IN_UPPER_BOUND_OF_TYPE_VARIABLE_AND_WILDCARDS/no-detect
	public static String getMyStrings() { 
		  
		}
	// EMB-ISSUE: CodeIssueNames.FINAL_SHOULD_NOT_BE_USED_IN_UPPER_BOUND_OF_TYPE_VARIABLE_AND_WILDCARDS
	public static void add(List<? extends String> list) {
		
	}
	// EMB-ISSUE: CodeIssueNames.FINAL_SHOULD_NOT_BE_USED_IN_UPPER_BOUND_OF_TYPE_VARIABLE_AND_WILDCARDS/no-detect
	private static double sum(List<? extends Number> list)  {
		
	}
}
