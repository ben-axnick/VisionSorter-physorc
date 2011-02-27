package physical.navigation.commands.nav;

import physical.navigation.commands.CommandPriority;
import physical.navigation.commands.NavigatorCommand;
import lejos.robotics.Pose;

public class CmdSetPose extends NavigatorCommand
{
	private static final long acceptableDelay = 50; //ms
	
	private Pose newPose;
	private long timeReceived;
	private boolean success = false;
	
	public CmdSetPose(Pose newPose, long timeReceived)
	{
		this.setProperties(CommandPriority.HIGH, true, false);
		this.newPose = newPose;
	}

	public Pose getPose()
	{
		return newPose;
	}
	
	@Override
	public void execute()
	{
		if (System.currentTimeMillis() - timeReceived < acceptableDelay)
		{
			nav.setPose(newPose);
			success = true;
		}
	}
	
	public boolean wasSuccessful()
	{
		return success;
	}
}
