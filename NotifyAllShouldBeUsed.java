package javacodechecker;
public	class NotifyAllShouldBeUsed extends Thread{
       @Override
		  public void run(){
		    synchronized(this){
		    	// EMB-ISSUE: CodeIssueNames.NOTIFYALL_SHOULD_BE_USED
		      notify();  
		    }
		  }
		}
