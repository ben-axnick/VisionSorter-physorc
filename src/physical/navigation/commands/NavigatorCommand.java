package physical.navigation.commands;

import physical.navigation.BetterNavigator;

public abstract class NavigatorCommand extends Command
{
	protected BetterNavigator nav;
	
	public void setNavigator(BetterNavigator nav)
	{
		this.nav = nav;
	}
}
