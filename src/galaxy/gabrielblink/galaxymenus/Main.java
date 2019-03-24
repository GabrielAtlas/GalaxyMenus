package galaxy.gabrielblink.galaxymenus;

import java.io.File;
import java.nio.charset.Charset;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import com.google.common.io.Resources;



public class Main extends JavaPlugin{

	public static Main instance;
    public static Main getInstance() {
        return Main.instance;
    }
	public void onEnable() {
		saveDefaultConfig();
		try {
			  File file = new File(getDataFolder() + File.separator, "config.yml");
			  String allText = Resources.toString(file.toURI().toURL(), Charset.forName("UTF-8"));
			  getConfig().loadFromString(allText);
			} catch (Exception e) {
			  e.printStackTrace();
			}
		(Main.instance = this).saveDefaultConfig();
		new BukkitRunnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				HookSuperItens.setup();
			}
		}.runTaskLaterAsynchronously(this, 20L*1);
		getCommand("especiais").setExecutor(new EspeciaisCommand());
		getCommand("caixasmisteriosas").setExecutor(new CaixasMisteriosas());
		Bukkit.getPluginManager().registerEvents(new EventSpecial(), this);
		Bukkit.getPluginManager().registerEvents(new CaixasMisteriosasEvent(), this);
	}
	
	
	public void onDisable() {
	}
	
	
}
