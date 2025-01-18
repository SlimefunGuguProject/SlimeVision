package me.bunnky.slimevision;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;

import org.bstats.bukkit.Metrics;
import org.bstats.charts.AdvancedPie;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.Bukkit;
import fr.skytasul.glowingentities.GlowingBlocks;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import net.guizhanss.guizhanlibplugin.updater.GuizhanUpdater;
import me.bunnky.slimevision.items.slimeeyes.SlimeEye;
import me.bunnky.slimevision.slimefun.Setup;

public class SlimeVision extends JavaPlugin implements SlimefunAddon {
    private static SlimeVision instance;
    private final String username;
    private final String repo;
    private GlowingBlocks glowingBlocks;

    public SlimeVision() {
        this.username = "Bunnky";
        this.repo = "SlimeVision";
    }

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("    .-=-.    .-=-.     ");
        getLogger().info("   ( 0   )  ( 0   )    ");
        getLogger().info("    `-=-'    `-=-'     ");
        getLogger().info("       粘液可视化       ");
        getLogger().info("      作者： Bunnky     ");

        saveDefaultConfig();
        tryUpdate();

        glowingBlocks = new GlowingBlocks(this);

        Setup.setup();
        setupMetrics();
    }

    public void setupMetrics (){
        Metrics metrics = new Metrics(this, 23251);

        AdvancedPie playersChart = new AdvancedPie("slimeeye_users", () -> {
            Map<String, Integer> vmap = new HashMap<>();
            SlimeEye.getUsers().forEach(users -> vmap.put(users, 1));
            return vmap;
        });

        AdvancedPie eyeChart = new AdvancedPie("slimeeye_types", SlimeEye::getSlimeEyeUsage);

        metrics.addCustomChart(playersChart);
        metrics.addCustomChart(eyeChart);
    }

    public void tryUpdate() {
        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build")) {
            if (Bukkit.getPluginManager().isPluginEnabled("GuizhanLibPlugin")) {
                try {
                    GuizhanUpdater.start(this, getFile(), "SlimefunGuguProject", "SlimeVision", "master");
                } catch (NoClassDefFoundError e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void consoleMsg(@Nonnull String string) {
        instance.getLogger().info(string);
    }

    public static SlimeVision getInstance() {
        return instance;
    }

    public GlowingBlocks getGlowingBlocks() {
        return glowingBlocks;
    }

    @Override
    public void onDisable() {
        if (glowingBlocks != null) {
            glowingBlocks.disable();
        }
    }

    @Override
    public String getBugTrackerURL() {
        return MessageFormat.format("https://github.com/SlimefunGuguProject/SlimeVision/issues", this.username, this.repo);
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }
}
