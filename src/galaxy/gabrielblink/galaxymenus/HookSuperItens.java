package galaxy.gabrielblink.galaxymenus;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

import API.ItemBuilder;
import galaxy.gabrielblink.galaxysuperitens.Armadilha;
import galaxy.gabrielblink.galaxysuperitens.Main;

public class HookSuperItens {

	public static  ItemStack Reparador;
	public static  ItemStack Raio;
	public static  ItemStack SuperCreeper;
	public static  ItemStack BauExtra;
	public static ItemStack Armadilha;
	public static  ItemStack Lancador;
	public static  ItemStack Purificador;
	public static  ItemStack BolaDeFogo;
	
	public static void setup() {
		Armadilha = new ItemBuilder(Material.SNOW_BALL,galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Armadilha.Quantia")).setName(Main.getInstance().getConfig().getString("Armadilha.Nome").replace("&", "§"))
	    		.setLorefor(Main.getInstance().getConfig().getStringList("Armadilha.Lore")).toItemStack();
		Reparador = new ItemBuilder(Material.ANVIL,galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Reparador.Quantia")).setName(Main.getInstance().getConfig().getString("Reparador.Nome").replace("&", "§"))
	    		.setLorefor(Main.getInstance().getConfig().getStringList("Reparador.Lore")).toItemStack();
		if(Main.getInstance().getConfig().getBoolean("Raio.Glow")) {
		    Raio = new ItemBuilder(Material.BLAZE_ROD,galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Raio.Quantia")).setName(Main.getInstance().getConfig().getString("Raio.Nome").replace("&", "§"))
		    		.setLorefor(Main.getInstance().getConfig().getStringList("Raio.Lore")).addEnchant(Enchantment.ARROW_DAMAGE, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack();
			}else {
			    Raio = new ItemBuilder(Material.BLAZE_ROD,galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Raio.Quantia")).setName(Main.getInstance().getConfig().getString("Raio.Nome").replace("&", "§"))
			    		.setLorefor(Main.getInstance().getConfig().getStringList("Raio.Lore")).toItemStack();
			}
		SuperCreeper = new ItemBuilder(Material.MONSTER_EGG,galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("SuperCreeper.Quantia")).setDurability((short)50).addEnchant(Enchantment.DURABILITY, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setName(Main.getInstance().getConfig().getString("SuperCreeper.Nome").replace("&", "§"))
	    		.setLorefor(Main.getInstance().getConfig().getStringList("SuperCreeper.Lore")).toItemStack();
		BauExtra = new ItemBuilder(Material.CHEST,galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("BauExtra.Quantia")).setName(Main.getInstance().getConfig().getString("BauExtra.Nome").replace("&", "§"))
	    		.setLorefor(Main.getInstance().getConfig().getStringList("BauExtra.Lore")).toItemStack();
		Lancador = new ItemBuilder(Material.FIREWORK,galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Lancador.Quantia")).setName(Main.getInstance().getConfig().getString("Lancador.Nome").replace("&", "§"))
	    		.setLorefor(Main.getInstance().getConfig().getStringList("Lancador.Lore")).toItemStack();
		Purificador = new ItemBuilder(Material.getMaterial(373),galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("Purificador.Quantia")).setDurability((short)16422).setName(Main.getInstance().getConfig().getString("Purificador.Nome").replace("&", "§"))
	    		.setLorefor(Main.getInstance().getConfig().getStringList("Purificador.Lore")).toItemStack();
		BolaDeFogo = new ItemBuilder(Material.FIREBALL,galaxy.gabrielblink.galaxymenus.Main.getInstance().getConfig().getInt("BolaDeFogo.Quantia")).setName(Main.getInstance().getConfig().getString("BolaDeFogo.Nome").replace("&", "§"))
	    		.setLorefor(Main.getInstance().getConfig().getStringList("BolaDeFogo.Lore")).toItemStack();
	}

	/**
	 * @return the reparador
	 */
	public ItemStack getReparador() {
		return Reparador;
	}

	/**
	 * @param reparador the reparador to set
	 */
	public void setReparador(ItemStack reparador) {
		Reparador = reparador;
	}

	/**
	 * @return the raio
	 */
	public ItemStack getRaio() {
		return Raio;
	}

	/**
	 * @param raio the raio to set
	 */
	public void setRaio(ItemStack raio) {
		Raio = raio;
	}

	/**
	 * @return the superCreeper
	 */
	public ItemStack getSuperCreeper() {
		return SuperCreeper;
	}

	/**
	 * @param superCreeper the superCreeper to set
	 */
	public void setSuperCreeper(ItemStack superCreeper) {
		SuperCreeper = superCreeper;
	}

	/**
	 * @return the bauExtra
	 */
	public ItemStack getBauExtra() {
		return BauExtra;
	}

	/**
	 * @param bauExtra the bauExtra to set
	 */
	public void setBauExtra(ItemStack bauExtra) {
		BauExtra = bauExtra;
	}

	/**
	 * @return the armadilha
	 */
	public ItemStack getArmadilha() {
		return Armadilha;
	}

	/**
	 * @param armadilha the armadilha to set
	 */
	public void setArmadilha(ItemStack armadilha) {
		Armadilha = armadilha;
	}

	/**
	 * @return the lancador
	 */
	public ItemStack getLancador() {
		return Lancador;
	}

	/**
	 * @param lancador the lancador to set
	 */
	public void setLancador(ItemStack lancador) {
		Lancador = lancador;
	}

	/**
	 * @return the purificador
	 */
	public ItemStack getPurificador() {
		return Purificador;
	}

	/**
	 * @param purificador the purificador to set
	 */
	public void setPurificador(ItemStack purificador) {
		Purificador = purificador;
	}

	/**
	 * @return the bolaDeFogo
	 */
	public ItemStack getBolaDeFogo() {
		return BolaDeFogo;
	}

	/**
	 * @param bolaDeFogo the bolaDeFogo to set
	 */
	public void setBolaDeFogo(ItemStack bolaDeFogo) {
		BolaDeFogo = bolaDeFogo;
	}
	
}
