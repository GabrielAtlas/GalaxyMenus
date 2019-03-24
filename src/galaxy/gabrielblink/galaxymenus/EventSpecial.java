package galaxy.gabrielblink.galaxymenus;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import galaxy.gabrielblink.galaxycash.General.CashAPI;

public class EventSpecial implements Listener{

	@EventHandler
	public void onClick(InventoryClickEvent event) {
		if(event.getInventory().getName().equalsIgnoreCase("Itens Especiais")) {
			event.setCancelled(true);
			Player p = (Player)event.getWhoClicked();
			int fireball_price = Main.getInstance().getConfig().getInt("BolaDeFogo.Preco")*Main.getInstance().getConfig().getInt("BolaDeFogo.Quantia");
			int reparador_price = Main.getInstance().getConfig().getInt("Reparador.Preco")*Main.getInstance().getConfig().getInt("Reparador.Quantia");
			int Raio_price = Main.getInstance().getConfig().getInt("Raio.Preco")*Main.getInstance().getConfig().getInt("Raio.Quantia");
			int SuperCreeper_price = Main.getInstance().getConfig().getInt("SuperCreeper.Preco")*Main.getInstance().getConfig().getInt("SuperCreeper.Quantia");
			int BauExtra_price = Main.getInstance().getConfig().getInt("BauExtra.Preco")*Main.getInstance().getConfig().getInt("BauExtra.Quantia");
			int Armadilha_price = Main.getInstance().getConfig().getInt("Armadilha.Preco")*Main.getInstance().getConfig().getInt("Armadilha.Quantia");
			int Lancador_price = Main.getInstance().getConfig().getInt("Lancador.Preco")*Main.getInstance().getConfig().getInt("Lancador.Quantia");
			int Purificador_price = Main.getInstance().getConfig().getInt("Purificador.Preco")*Main.getInstance().getConfig().getInt("Purificador.Quantia");
			if(event.getSlot() == 10) {
			if(CashAPI.getCash(p.getName()) >= fireball_price) {
				p.closeInventory();
				CashAPI.removeCash(p.getName(), fireball_price);
				p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveboladefogo gabriel_blink "+Main.getInstance().getConfig().getInt("BolaDeFogo.Quantia"));
			   p.sendMessage("§aItem comprado com sucesso.");
			}else {
				p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
				p.sendMessage("§cVocê não tem cash's suficientes para comprar este item.");
			}
		}
			if(event.getSlot() == 11) {
				if(CashAPI.getCash(p.getName()) >= BauExtra_price) {
					p.closeInventory();
					CashAPI.removeCash(p.getName(), BauExtra_price);
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givebauvirtual gabriel_blink "+Main.getInstance().getConfig().getInt("BauExtra.Quantia"));
				   p.sendMessage("§aItem comprado com sucesso.");
				}else {
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
					p.sendMessage("§cVocê não tem cash's suficientes para comprar este item.");
				}
			}
			if(event.getSlot() == 12) {
				if(CashAPI.getCash(p.getName()) >= Armadilha_price) {
					p.closeInventory();
					CashAPI.removeCash(p.getName(), Armadilha_price);
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givearmadilha gabriel_blink "+Main.getInstance().getConfig().getInt("Armadilha.Quantia"));
				   p.sendMessage("§aItem comprado com sucesso.");
				}else {
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
					p.sendMessage("§cVocê não tem cash's suficientes para comprar este item.");
				}
			}
			if(event.getSlot() == 13) {
				if(CashAPI.getCash(p.getName()) >= Lancador_price) {
					p.closeInventory();
					CashAPI.removeCash(p.getName(), Lancador_price);
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givelancador gabriel_blink "+Main.getInstance().getConfig().getInt("Lancador.Quantia"));
				   p.sendMessage("§aItem comprado com sucesso.");
				}else {
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
					p.sendMessage("§cVocê não tem cash's suficientes para comprar este item.");
				}
			}
			if(event.getSlot() == 14) {
				if(CashAPI.getCash(p.getName()) >= Purificador_price) {
					p.closeInventory();
					CashAPI.removeCash(p.getName(), Purificador_price);
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givepurificador gabriel_blink "+Main.getInstance().getConfig().getInt("Purificador.Quantia"));
				   p.sendMessage("§aItem comprado com sucesso.");
				}else {
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
					p.sendMessage("§cVocê não tem cash's suficientes para comprar este item.");
				}
			}
			if(event.getSlot() == 15) {
				if(CashAPI.getCash(p.getName()) >= Raio_price) {
					p.closeInventory();
					CashAPI.removeCash(p.getName(), Raio_price);
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "giveraiomestre gabriel_blink "+Main.getInstance().getConfig().getInt("Raio.Quantia"));
				   p.sendMessage("§aItem comprado com sucesso.");
				}else {
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
					p.sendMessage("§cVocê não tem cash's suficientes para comprar este item.");
				}
			}
			if(event.getSlot() == 16) {
				if(CashAPI.getCash(p.getName()) >= reparador_price) {
					p.closeInventory();
					CashAPI.removeCash(p.getName(), reparador_price);
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givereparador gabriel_blink "+Main.getInstance().getConfig().getInt("Reparador.Quantia"));
				   p.sendMessage("§aItem comprado com sucesso.");
				}else {
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
					p.sendMessage("§cVocê não tem cash's suficientes para comprar este item.");
				}
			}
			if(event.getSlot() == 19) {
				if(CashAPI.getCash(p.getName()) >= SuperCreeper_price) {
					p.closeInventory();
					CashAPI.removeCash(p.getName(), SuperCreeper_price);
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "givesuper gabriel_blink "+Main.getInstance().getConfig().getInt("SuperCreeper.Quantia"));
				   p.sendMessage("§aItem comprado com sucesso.");
				}else {
					p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1, 1);
					p.sendMessage("§cVocê não tem cash's suficientes para comprar este item.");
				}
			}
			if(event.getSlot() == 31) {
				p.chat("/kit");
			}
		}
	}
}
