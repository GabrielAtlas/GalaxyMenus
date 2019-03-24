package galaxy.gabrielblink.galaxymenus;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EspeciaisCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(cmd.getName().equalsIgnoreCase("especiais")) {
			if(sender instanceof Player) {
				Player p = (Player)sender;
				Especiais.open(p);
			}
		}
		return false;
	}

}
