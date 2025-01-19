package me.bunnky.slimevision.utility;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import me.bunnky.slimevision.items.GoldenSlimeFish;
import me.bunnky.slimevision.items.ParticleItem;
import me.bunnky.slimevision.items.slimeeyes.SlimeEyeGod;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import net.guizhanss.minecraft.guizhanlib.gugu.minecraft.ChatColors;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;


public class Utilities {


    public static void setGlow(@NotNull SlimefunItemStack i) {
        ItemMeta m = i.getItemMeta();
        if (m != null) {
            m.addEnchant(Enchantment.LURE, 1, true);
            m.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            i.setItemMeta(m);
        }
    }

    public static @NotNull String getColorName(@NotNull ChatColor c) {
        return ChatColors.fromChatColor(c).getChinese();
    }

    public static void placeBlock(@NotNull Block block, @NotNull BlockFace face, @NotNull Material material) {
        Block placeBlock = block.getRelative(face);
        placeBlock.setType(material);
    }

    public static boolean isGSF(ItemStack i) {
        SlimefunItem sfItem = SlimefunItem.getByItem(i);
        return sfItem instanceof GoldenSlimeFish;
    }

    public static boolean isSlimeEyeGod(ItemStack i) {
        SlimefunItem sfItem = SlimefunItem.getByItem(i);
        return sfItem instanceof SlimeEyeGod;
    }

    public static boolean isParticleItem(ItemStack i) {
        SlimefunItem sfItem = SlimefunItem.getByItem(i);
        return sfItem instanceof ParticleItem;
    }

    public static Vector getPlayerVector(Player p) {
        return p.getLocation().toVector();
    }

    public static boolean isAirOrLiquid(Block b) {
        return b.getType().isAir() || b.isLiquid();
    }

    public static boolean hasBlockStorage(Block b) {
        return BlockStorage.hasBlockInfo(b);
    }

    public static int getClampedCoordinate(int coordinate, int radius, int min, int max) {
        return Math.min(max, Math.max(min, coordinate + radius));
    }
}
