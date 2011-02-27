package physical.navigation.commands.nav;

import physical.navigation.commands.CommandPriority;
import physical.navigation.commands.NavigatorCommand;

public class CmdTravel extends NavigatorCommand
{
	private float distance;
	
	public CmdTravel(float distance)
	{
		setProperties(CommandPriority.MEDIUM, false, true);
		this.distance = distance;
	}
	
	@Override
	public void execute()
	{
		try
		{
			nav.travel(distance);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block BAD
			e.printStackTrace();
		}
	}
	
}
