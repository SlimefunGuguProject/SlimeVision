package me.bunnky.slimevision.slimefun;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import me.bunnky.slimevision.SlimeVision;
import me.bunnky.slimevision.items.GoldenSlimeFish;
import me.bunnky.slimevision.items.ParticleItem;
import me.bunnky.slimevision.items.SFS;
import me.bunnky.slimevision.items.slimeeyes.SlimeEye;
import me.bunnky.slimevision.items.slimeeyes.SlimeCleaner;
import me.bunnky.slimevision.items.slimeeyes.SlimeEyeGod;
import me.bunnky.slimevision.items.slimeeyes.SlimeEyeInverted;
import me.bunnky.slimevision.items.slimeeyes.SlimeEyeNetworks;
import me.bunnky.slimevision.items.SlimeScribe;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import net.guizhanss.guizhanlib.minecraft.utils.compatibility.MaterialX;

@UtilityClass
public class Setup {


    public static void setup() {

        SlimeVision plugin = SlimeVision.getInstance();

        ItemStack groupItem = new CustomItemStack(Material.ENDER_EYE, "&b粘液可视化", "", "我希望它能成功运行!");
        NamespacedKey groupId = new NamespacedKey(SlimeVision.getInstance(), "slime_vision");
        ItemGroup group = new ItemGroup(groupId, groupItem);

        //########################
        //  ITEMS
        //########################

        //////////////////////////////////////////////
        /////////////// 粘液眼S ///////////////////
        //////////////////////////////////////////////

        SlimefunItemStack slimeEye = new SlimefunItemStack(
            "SV_SLIMEEYE",
            Material.ENDER_EYE,
            "&2粘液眼",
            "",
            "&e右击: &7激活粘液视域",
            "&7持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却时间: &760 秒",
            "&e范围: &720"
        );
        SlimefunItemStack slimeOrb = new SlimefunItemStack(
            "SV_SLIMEORB",
            Material.SLIME_BALL,
            "&a粘液珠",
            "",
            "&e右击: &7激活粘液视域",
            "&7持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &740 秒",
            "&e范围: &712"
        );
        SlimefunItemStack slimeGlob = new SlimefunItemStack(
            "SV_SLIMEGLOB",
            Material.LIME_DYE,
            "&b粘液团",
            "",
            "&e右击: &7激活粘液视域",
            "&7持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &725 秒",
            "&e范围: &77"
        );
        SlimefunItemStack slimeChunk = new SlimefunItemStack(
            "SV_SLIMECHUNK",
            MaterialX.TURTLE_SCUTE,
            "&3粘液块",
            "",
            "&e右击: &7激活粘液视域",
            "&7持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &710 秒",
            "&e范围: &73"
        );
        SlimefunItemStack slimeEyeNetworks = new SlimefunItemStack(
            "SV_SLIMEEYE_NETWORKS",
            Material.HONEYCOMB,
            "&d网络&2粘液眼",
            "",
            "&e右击: &7激活网络",
            "&7粘液视域持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &760 秒",
            "&e范围: &720"
        );
        SlimefunItemStack slimeOrbNetworks = new SlimefunItemStack(
            "SV_SLIMEORB_NETWORKS",
            Material.SUNFLOWER,
            "&d网络&a粘液珠",
            "",
            "&e右击: &7激活网络",
            "&7粘液视域持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &740 秒",
            "&e范围: &712"
        );
        SlimefunItemStack slimeGlobNetworks = new SlimefunItemStack(
            "SV_SLIMEGLOB_NETWORKS",
            Material.HORN_CORAL,
            "&d网络&b粘液团",
            "",
            "&e右击: &7激活网络",
            "&7粘液视域持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &725 秒",
            "&e范围: &77"
        );
        SlimefunItemStack slimeChunkNetworks = new SlimefunItemStack(
            "SV_SLIMECHUNK_NETWORKS",
            Material.YELLOW_DYE,
            "&d网络&3粘液块",
            "",
            "&e右击: &7激活网络",
            "&7粘液视域持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &710 秒",
            "&e范围: &73"
        );
        SlimefunItemStack slimeEyeInverted = new SlimefunItemStack(
            "SV_SLIMEEYE_INVERTED",
            Material.SNOWBALL,
            "&f反向&2粘液眼",
            "",
            "&e右击: &7激活反向",
            "&7粘液视域持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &760 秒",
            "&e范围: &720"
        );
        SlimefunItemStack slimeOrbInverted = new SlimefunItemStack(
            "SV_SLIMEORB_INVERTED",
            Material.CLAY_BALL,
            "&f反向&a粘液珠",
            "",
            "&e右击: &7激活反向",
            "&7粘液视域持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &740 秒",
            "&e范围: &712"
        );
        SlimefunItemStack slimeGlobInverted = new SlimefunItemStack(
            "SV_SLIMEGLOB_INVERTED",
            Material.WHITE_DYE,
            "&f反向&b粘液团",
            "",
            "&e右击: &7激活反向",
            "&7粘液视域持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &725 秒",
            "&e范围: &77"
        );
        SlimefunItemStack slimeChunkInverted = new SlimefunItemStack(
            "SV_SLIMECHUNK_INVERTED",
            Material.LIGHT_GRAY_DYE,
            "&f反向&3粘液块",
            "",
            "&e右击: &7激活反向",
            "&7粘液视域持续10秒",
            "&e潜行右击: &7改变",
            "&7显示的颜色",
            "",
            "&e冷却: &710 秒",
            "&e范围: &73"
        );

        //////////////////////////////////////////////
        //////////////// MATERIALS ///////////////////
        //////////////////////////////////////////////

        SlimefunItemStack particleBase = new SlimefunItemStack(
            "SV_PARTICLE_BASE",
            Material.CANDLE,
            "&f基础粒子"
        );
        SlimefunItemStack particleTop = new SlimefunItemStack(
            "SV_PARTICLE_TOP",
            Material.RED_CANDLE,
            "&c粒子: 顶"
        );
        SlimefunItemStack particleBottom = new SlimefunItemStack(
            "SV_PARTICLE_BOTTOM",
            Material.CYAN_CANDLE,
            "&3粒子: 底"
        );
        SlimefunItemStack particleEast = new SlimefunItemStack(
            "SV_PARTICLE_EAST",
            Material.YELLOW_CANDLE,
            "&e粒子: 东"
        );
        SlimefunItemStack particleWest = new SlimefunItemStack(
            "SV_PARTICLE_WEST",
            Material.GREEN_CANDLE,
            "&a粒子: 西"
        );
        SlimefunItemStack particleSouth = new SlimefunItemStack(
            "SV_PARTICLE_SOUTH",
            Material.ORANGE_CANDLE,
            "&6粒子: 南"
        );
        SlimefunItemStack particleNorth = new SlimefunItemStack(
            "SV_PARTICLE_NORTH",
            Material.PURPLE_CANDLE,
            "&5粒子: 北"
        );

        //////////////////////////////////////////////
        /////////////////// OTHER ////////////////////
        //////////////////////////////////////////////

        SlimefunItemStack slimeEyeCleaner = new SlimefunItemStack(
            "SV_SLIMECLEANER",
            Material.FIRE_CHARGE,
            "&4粘液清除器",
            "",
            "&e右击: &7破坏附近的粘液机器",
            "&7&并清除方块数据",
            "",
            "&e范围: &710",
            "",
            "&c\"&o我需要对此万分小心!\""
        );

        SlimefunItemStack slimeScribe = new SlimefunItemStack(
            "SV_SLIMESCRIBE",
            Material.BRUSH,
            "&f粘液记录仪",
            "",
            "&e右击: &7检查区域并记录",
            "&7不可见机器的位置",
            "&7在一本书中",
            "",
            "&e冷却: &730 秒",
            "&e范围: &730"
        );

        SlimefunItemStack slimeEyeGod = new SlimefunItemStack(
            "SV_SLIMEEYE_GOD",
            Material.SLIME_SPAWN_EGG,
            "&4&l粘液创世神",
            "",
            "&e右击: &7切换粘液创世视域",
            "&e潜行右击: &7切换成反向",
            "&7粘液创世视域",
            "&e左击: &7清楚方块数据",
            "&e潜行左击: &7放置方块",
            "",
            "&e[&a粘液创世视域将",
            "&a自动移除所有空数据机器&e]",
            "&e[&a拿在副手上使用会在",
            "&a不可见机器的位置放置一个方块&e]"

        );
        SlimefunItemStack goldenSlimeFish = new SlimefunItemStack(
            "SV_GOLDEN_SLIMEFISH",
            Material.PUFFERFISH,
            "&6黄金粘液鱼",
            "",
            "&e左击: &7立即破坏",
            "&7一个粘液方块",
            "&7并清除其方块数据",
            "",
            "&c\"&o我需要对此万分小心!\""
        );
        SlimefunItemStack sfsItem = new SlimefunItemStack(
            "SV_SFS",
            Material.BOOK,
            "&4SFS (╯°□°)╯︵ ┻━┻",
            "",
            "&e右击: &7立即保存",
            "&7粘液科技一次",
            "",
            "&c\"&o我需要对此万分小心!\""
        );


        //////////////////////////////////////////////
        ////////////////// GUIDES ////////////////////
        //////////////////////////////////////////////

        SlimefunItemStack basicsGuide = new SlimefunItemStack(
            "SV_GUIDE_BASIC",
            Material.BOOK,
            "&b粘液可视化指南",
            "",
            "&b粘液可视化&7 为玩家和管理员提供了一种",
            "&7可视化粘液设置的方法。 ",
            "&7粘液眼会释放出 &f粘液视域 &7。",
            "",
            "&f&n粘液视域&7 会使半径范围内的所有的粘液科技机器发光",
            "&7&o这种光甚至可以",
            "&7&o透过墙壁或障碍物!",
            ""
        );

        SlimefunItemStack basicsGuide2 = new SlimefunItemStack(
            "SV_GUIDE_BASIC2",
            Material.BOOK,
            "&b粘液可视化指南",
            "",
            "&f&n反向&7粘液视域会寻找包含粘液方块数据的空气方块",
            "&7并用红光标记该位置",
            "&7如果你的服务器崩溃了",
            "&7&o这真的很有帮助。",
            "",
            "&f&n网络&7粘液视域专用于网络附属",
            "&7并且只有在安装了网络附属的情况下才会启用",
            "&7工作原理类似于粘液视域",
            "&7&o但是仅对网络机器/方块生效",
            ""
        );

        SlimefunItemStack basicsGuide3 = new SlimefunItemStack(
            "SV_GUIDE_BASIC3",
            Material.BOOK,
            "&b粘液可视化指南",
            "",
            "&7&f&n粘液记录仪&7用于检查不可见机器",
            "&7如果发现了不可见机器",
            "&7就会将其位置信息记录在一本书上",
            "&7&o这是为自己或为报告机器保存位置的好方法。",
            "",
            "&f&n粒子&7主要作为合成材料",
            "&7但也可以用来发射短粒子束",
            "&7&o可用于指出机器位置",
            "&7&o或仅仅是为了好玩!",
            ""
        );

        SlimefunItemStack basicsGuide4 = new SlimefunItemStack(
            "SV_GUIDE_BASIC4",
            Material.BOOK,
            "&b粘液可视化指南",
            "",
            "&7&b粘液可视化&7真正的用途",
            "&7在于一些隐藏物品",
            "&7只有拥有/sf give权限的管理员才能使用",
            "&7这些物品包括&f&n粘液创世神&7, &f&n粘液清除器&7,",
            "&7&f&nSFS&7,和&f&n黄金粘液鱼&7。",
            "&7黄金史莱姆鱼是唯一不需要OP权限就可以使用的管理员物品",
            "&7这些工具是为服务器管理员设计的",
            "&7&o帮助玩家诊断",
            "&7&o和修复粘液方块数据问题",
            "",
            "&c&n所有管理员专用物品都有风险",
            "&c&n一定要慎用！",
            "&c&n在每个物品上都可以找到对它们的描述。",
            ""
        );
        //########################
        //  RECIPES
        //########################

        ItemStack[] slimeScribeRecipe = {
            null, null, null,
            null, slimeEyeInverted, null,
            null, null, null
        };
        ItemStack[] slimeEyeInvertedRecipe = {
            null, SlimefunItems.HEAVY_CREAM, null,
            null, slimeEye, null,
            null, null, null
        };
        ItemStack[] slimeOrbInvertedRecipe = {
            null, SlimefunItems.HEAVY_CREAM, null,
            null, slimeOrb, null,
            null, null, null
        };
        ItemStack[] slimeGlobInvertedRecipe = {
            null, SlimefunItems.HEAVY_CREAM, null,
            null, slimeGlob, null,
            null, null, null
        };
        ItemStack[] slimeChunkInvertedRecipe = {
            null, SlimefunItems.HEAVY_CREAM, null,
            null, slimeChunk, null,
            null, null, null
        };
        ItemStack[] slimeEyeNetworksRecipe = {
            null, null, null,
            null, slimeEye, null,
            null, null, null
        };
        ItemStack[] slimeOrbNetworksRecipe = {
            null, null, null,
            null, slimeOrb, null,
            null, null, null
        };
        ItemStack[] slimeGlobNetworksRecipe = {
            null, null, null,
            null, slimeGlob, null,
            null, null, null
        };
        ItemStack[] slimeChunkNetworksRecipe = {
            null, null, null,
            null, slimeChunk, null,
            null, null, null
        };
        ItemStack[] slimeEyeRecipe = {
            particleNorth, particleTop, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
            particleWest, slimeOrb, particleEast,
            SlimefunItems.ADVANCED_CIRCUIT_BOARD, particleBottom, particleSouth
        };
        ItemStack[] slimeOrbRecipe = {
            particleNorth, particleTop, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
            particleWest, slimeGlob, particleEast,
            SlimefunItems.ADVANCED_CIRCUIT_BOARD, particleBottom, particleSouth
        };
        ItemStack[] slimeGlobRecipe = {
            particleNorth, particleTop, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
            particleWest, slimeChunk, particleEast,
            SlimefunItems.ADVANCED_CIRCUIT_BOARD, particleBottom, particleSouth
        };
        ItemStack[] slimeChunkRecipe = {
            particleNorth, particleTop, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
            particleWest, SlimefunItems.NETHER_ICE, particleEast,
            SlimefunItems.ADVANCED_CIRCUIT_BOARD, particleBottom, particleSouth
        };
        ItemStack[] particleBaseRecipe = {
            SlimefunItems.AIR_RUNE, SlimefunItems.EARTH_RUNE, SlimefunItems.FIRE_RUNE,
            SlimefunItems.WATER_RUNE, new ItemStack(Material.CANDLE), SlimefunItems.LIGHTNING_RUNE,
            SlimefunItems.ESSENCE_OF_AFTERLIFE, SlimefunItems.RAINBOW_RUNE, SlimefunItems.SMALL_URANIUM
        };
        ItemStack[] particleTopRecipe = {
            null, new ItemStack(Material.RED_DYE), null,
            null, particleBase, null,
            SlimefunItems.STEEL_THRUSTER, SlimefunItems.FUEL_BUCKET, SlimefunItems.STEEL_THRUSTER
        };
        ItemStack[] particleBottomRecipe = {
            SlimefunItems.STEEL_THRUSTER, SlimefunItems.FUEL_BUCKET, SlimefunItems.STEEL_THRUSTER,
            null, particleBase, null,
            null, new ItemStack(Material.CYAN_DYE), null
        };
        ItemStack[] particleEastRecipe = {
            SlimefunItems.STEEL_THRUSTER, null, null,
            SlimefunItems.FUEL_BUCKET, particleBase, new ItemStack(Material.YELLOW_DYE),
            SlimefunItems.STEEL_THRUSTER, null, null
        };
        ItemStack[] particleWestRecipe = {
            null, null, SlimefunItems.STEEL_THRUSTER,
            new ItemStack(Material.GREEN_DYE), particleBase, SlimefunItems.FUEL_BUCKET,
            null, null, SlimefunItems.STEEL_THRUSTER
        };
        ItemStack[] particleSouthRecipe = {
            SlimefunItems.STEEL_THRUSTER, SlimefunItems.FUEL_BUCKET, SlimefunItems.STEEL_THRUSTER,
            null, particleBase, null,
            null, new ItemStack(Material.ORANGE_DYE), null
        };
        ItemStack[] particleNorthRecipe = {
            null, new ItemStack(Material.PURPLE_DYE), null,
            null, particleBase, null,
            SlimefunItems.STEEL_THRUSTER, SlimefunItems.FUEL_BUCKET, SlimefunItems.STEEL_THRUSTER
        };

        //########################
        //  INSTANTIATE
        //########################

        SlimeEye slimeeyegod = new SlimeEyeGod(group, slimeEyeGod, RecipeType.NULL, null, 30);
        GoldenSlimeFish goldenslimefish = new GoldenSlimeFish(group, goldenSlimeFish, RecipeType.NULL, null);
        SFS sfs = new SFS(group, sfsItem, RecipeType.NULL, null);
        SlimeCleaner slimeeyecleaner = new SlimeCleaner(group, slimeEyeCleaner, RecipeType.NULL, null);


        SlimefunItem basicguide = new SlimefunItem(group, basicsGuide, RecipeType.NULL, null);
        SlimefunItem basicguide2 = new SlimefunItem(group, basicsGuide2, RecipeType.NULL, null);
        SlimefunItem basicguide3 = new SlimefunItem(group, basicsGuide3, RecipeType.NULL, null);
        SlimefunItem basicguide4 = new SlimefunItem(group, basicsGuide4, RecipeType.NULL, null);

        SlimeEye slimeeye = new SlimeEye(group, slimeEye, RecipeType.MAGIC_WORKBENCH, slimeEyeRecipe, 20, 60000);
        SlimeEye slimeorb = new SlimeEye(group, slimeOrb, RecipeType.MAGIC_WORKBENCH, slimeOrbRecipe, 12, 40000);
        SlimeEye slimeglob = new SlimeEye(group, slimeGlob, RecipeType.MAGIC_WORKBENCH, slimeGlobRecipe, 7, 25000);
        SlimeEye slimechunk = new SlimeEye(group, slimeChunk, RecipeType.ENHANCED_CRAFTING_TABLE, slimeChunkRecipe, 3, 10000);

        SlimeEyeInverted slimeeyeinverted = new SlimeEyeInverted(group, slimeEyeInverted, RecipeType.MAGIC_WORKBENCH, slimeEyeInvertedRecipe, 20, 60000);
        SlimeEyeInverted slimeorbinverted = new SlimeEyeInverted(group, slimeOrbInverted, RecipeType.MAGIC_WORKBENCH, slimeOrbInvertedRecipe, 12, 40000);
        SlimeEyeInverted slimeglobinverted = new SlimeEyeInverted(group, slimeGlobInverted, RecipeType.MAGIC_WORKBENCH, slimeGlobInvertedRecipe, 7, 25000);
        SlimeEyeInverted slimechunkinverted = new SlimeEyeInverted(group, slimeChunkInverted, RecipeType.MAGIC_WORKBENCH, slimeChunkInvertedRecipe, 3, 10000);

        SlimeScribe slimescribe = new SlimeScribe(group, slimeScribe, RecipeType.MAGIC_WORKBENCH, slimeScribeRecipe, 30, 30000);

        SlimefunItem particlebase = new ParticleItem(group, particleBase, RecipeType.ENHANCED_CRAFTING_TABLE, particleBaseRecipe, Color.WHITE);
        SlimefunItem particletop = new ParticleItem(group, particleTop, RecipeType.MAGIC_WORKBENCH, particleTopRecipe, Color.RED);
        SlimefunItem particlebottom = new ParticleItem(group, particleBottom, RecipeType.MAGIC_WORKBENCH, particleBottomRecipe,  Color.AQUA);
        SlimefunItem particleeast = new ParticleItem(group, particleEast, RecipeType.MAGIC_WORKBENCH, particleEastRecipe,  Color.YELLOW);
        SlimefunItem particlewest = new ParticleItem(group, particleWest, RecipeType.MAGIC_WORKBENCH, particleWestRecipe,  Color.LIME);
        SlimefunItem particlesouth = new ParticleItem(group, particleSouth, RecipeType.MAGIC_WORKBENCH, particleSouthRecipe,  Color.ORANGE);
        SlimefunItem particlenorth = new ParticleItem(group, particleNorth, RecipeType.MAGIC_WORKBENCH, particleNorthRecipe,  Color.PURPLE);

        //########################
        //  REGISTER
        //########################

        basicguide.register(plugin);
        basicguide2.register(plugin);
        basicguide3.register(plugin);
        basicguide4.register(plugin);
        particlebase.register(plugin);
        particletop.register(plugin);
        particlebottom.register(plugin);
        particleeast.register(plugin);
        particlewest.register(plugin);
        particlesouth.register(plugin);
        particlenorth.register(plugin);
        slimechunk.register(plugin);
        slimeglob.register(plugin);
        slimeorb.register(plugin);
        slimeeye.register(plugin);
        slimechunkinverted.register(plugin);
        slimeglobinverted.register(plugin);
        slimeorbinverted.register(plugin);
        slimeeyeinverted.register(plugin);
        slimescribe.register(plugin);
        slimeeyegod.register(plugin);
        slimeeyegod.setHidden(true);
        goldenslimefish.register(plugin);
        goldenslimefish.setHidden(true);
        sfs.register(plugin);
        sfs.setHidden(true);
        slimeeyecleaner.register(plugin);
        slimeeyecleaner.setHidden(true);

        //########################
        //  NETWORKS STUFF
        //########################

        if (Bukkit.getPluginManager().isPluginEnabled("Networks")) {
            SlimeEyeNetworks slimeeyenetworks = new SlimeEyeNetworks(group, slimeEyeNetworks, RecipeType.PRESSURE_CHAMBER, slimeEyeNetworksRecipe, 20, 60000);
            SlimeEyeNetworks slimeorbnetworks = new SlimeEyeNetworks(group, slimeOrbNetworks, RecipeType.PRESSURE_CHAMBER, slimeOrbNetworksRecipe, 12, 40000);
            SlimeEyeNetworks slimeglobnetworks = new SlimeEyeNetworks(group, slimeGlobNetworks, RecipeType.PRESSURE_CHAMBER, slimeGlobNetworksRecipe, 7, 25000);
            SlimeEyeNetworks slimechunknetworks = new SlimeEyeNetworks(group, slimeChunkNetworks, RecipeType.PRESSURE_CHAMBER, slimeChunkNetworksRecipe, 3, 10000);

            slimechunknetworks.register(plugin);
            slimeglobnetworks.register(plugin);
            slimeorbnetworks.register(plugin);
            slimeeyenetworks.register(plugin);

            NamespacedKey slimeChunkNetworksResearch = new NamespacedKey(plugin, "slime_chunk_networks");
            NamespacedKey slimeGlobNetworksResearch = new NamespacedKey(plugin, "slime_glob_networks");
            NamespacedKey slimeOrbNetworksResearch = new NamespacedKey(plugin, "slime_orb_networks");
            NamespacedKey slimeEyeNetworksResearch = new NamespacedKey(plugin, "slime_eye_networks");

            Research slimechunknetworksresearch = new Research(slimeChunkNetworksResearch, 9, "这是黄色的? 黄色的粘液?", 20);
            Research slimeglobnetworksresearch = new Research(slimeGlobNetworksResearch, 8, "它仍在发光...", 40);
            Research slimeorbnetworksresearch = new Research(slimeOrbNetworksResearch, 7, "这是一种限制, 或者...", 60);
            Research slimeeyenetworksresearch = new Research(slimeEyeNetworksResearch, 6, "它正在发光!", 100);

            slimeeyenetworksresearch.addItems(slimeeyenetworks);
            slimeorbnetworksresearch.addItems(slimeorbnetworks);
            slimeglobnetworksresearch.addItems(slimeglobnetworks);
            slimechunknetworksresearch.addItems(slimechunknetworks);

            slimeeyenetworksresearch.register();
            slimeorbnetworksresearch.register();
            slimeglobnetworksresearch.register();
            slimechunknetworksresearch.register();
        }

        //########################
        //  RESEARCH
        //########################

        NamespacedKey slimeChunkResearch = new NamespacedKey(plugin, "slime_chunk");
        NamespacedKey slimeGlobResearch = new NamespacedKey(plugin, "slime_glob");
        NamespacedKey slimeOrbResearch = new NamespacedKey(plugin, "slime_orb");
        NamespacedKey slimeEyeResearch = new NamespacedKey(plugin, "slime_eye");
        NamespacedKey particleResearch = new NamespacedKey(plugin, "particle");

        Research slimechunkresearch = new Research(slimeChunkResearch, 1, "我不认为这是粘液...", 20);
        Research slimeglobresearch = new Research(slimeGlobResearch, 2, "为粘液创世神添加更多的奶奶也", 40);
        Research slimeorbresearch = new Research(slimeOrbResearch, 3, "它似乎在进化!", 60);
        Research slimeeyeresearch = new Research(slimeEyeResearch, 4, "我发现了什么??", 100);
        Research particleresearch = new Research(particleResearch, 5, "所有颜色!!", 10);

        slimechunkresearch.addItems(slimechunk, slimechunkinverted);
        slimeglobresearch.addItems(slimeglob, slimeglobinverted);
        slimeorbresearch.addItems(slimeorb, slimeorbinverted);
        slimeeyeresearch.addItems(slimeeye, slimeeyeinverted, slimescribe);
        particleresearch.addItems(particlebase, particletop, particlebottom, particleeast, particlenorth, particlesouth, particlewest);

        slimechunkresearch.register();
        slimeglobresearch.register();
        slimeorbresearch.register();
        slimeeyeresearch.register();
        particleresearch.register();
    }
}