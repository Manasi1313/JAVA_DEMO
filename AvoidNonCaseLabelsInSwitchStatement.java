package javacodechecker;

public class AvoidNonCaseLabelsInSwitchStatement{
public void m() {
	//EMB-ISSUE: CodeIssueNames.AVOID_NON_CASE_LABELS_IN_SWITCH_STATEMENT
switch (month) {
case MONDAY:
case TUESDAY:
     WEDNESDAY:   
 system.out.println("it is wednesday");
  break;
}
}
}
