package com.github.yi_ge_shuai_qi_de_kai_fa_zhe.Minecraft_MOD;

import com.github.yi_ge_shuai_qi_de_kai_fa_zhe.Minecraft_MOD.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author yi_ge_shuai_qi_de_kai_fa_zhe
 */
@Mod(modid = Minecraft_MOD.MODID, name = Minecraft_MOD.NAME, version = Minecraft_MOD.VERSION, acceptedMinecraftVersions = "1.12.2")
public class Minecraft_MOD
{
    public static final String MODID = "Minecraft_MOD";
    public static final String NAME = "FML Tutor";
    public static final String VERSION = "1.0.0";

    @Instance(Minecraft_MOD.MODID)
    public static Minecraft_MOD instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
    @SidedProxy(clientSide = "com.github.yi_ge_shuai_qi_de_kai_fa_zhe.Minecraft_MOD.client.ClientProxy",
            serverSide = "com.github.yi_ge_shuai_qi_de_kai_fa_zhe.Minecraft_MOD.common.CommonProxy")
    public static CommonProxy proxy;
}