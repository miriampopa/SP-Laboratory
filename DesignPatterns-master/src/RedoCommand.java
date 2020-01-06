
public class RedoCommand implements Command{

	
	public void execute() {
		// TODO Auto-generated method stub
		//DocumentManager.getInstance().getHistory().unexecute();
		//DocumentManager.getInstance().setHistory(DocumentManager.getInstance().getHistory());
		DocumentManager.getInstance().getHistory();
		DocumentManager.getInstance().getHistory().unexecute();
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}
	
}
