package javacodechecker;

public class PublicMethodReturnPrivateDataStructure {
	private String[] colors;
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE
	public String[] getColor() {	
	return colors;
	}
	//EMB-ISSUE: CodeIssueNames.PUBLIC_METHOD_RETURN_PRIVATE_DATA_STRUCTURE/no-detect
	private String[] getColors() {
	return colors;
	}
}
