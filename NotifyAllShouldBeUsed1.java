package javacodechecker;
public	class NotifyAllShouldBeUsed1  implements Runnable{
    @Override
		  public void runs(){
		    synchronized(this){
		    	// EMB-ISSUE: CodeIssueNames.NOTIFYALL_SHOULD_BE_USED
		    	notify();   
		    }
		  }
		}
