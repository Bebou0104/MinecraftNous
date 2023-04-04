
package net.mcreator.lesthonsrouges.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.lesthonsrouges.world.inventory.XeathermakerMenu;
import net.mcreator.lesthonsrouges.procedures.ThunderProcedure;
import net.mcreator.lesthonsrouges.procedures.RainProcedure;
import net.mcreator.lesthonsrouges.procedures.NightProcedure;
import net.mcreator.lesthonsrouges.procedures.DayProcedure;
import net.mcreator.lesthonsrouges.procedures.ClearProcedure;
import net.mcreator.lesthonsrouges.LesThonsRougesMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class XeathermakerButtonMessage {
	private final int buttonID, x, y, z;

	public XeathermakerButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public XeathermakerButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(XeathermakerButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(XeathermakerButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = XeathermakerMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			DayProcedure.execute(world, x, y, z);
		}
		if (buttonID == 1) {

			NightProcedure.execute(world, x, y, z);
		}
		if (buttonID == 2) {

			ClearProcedure.execute(world, x, y, z);
		}
		if (buttonID == 3) {

			RainProcedure.execute(world, x, y, z);
		}
		if (buttonID == 4) {

			ThunderProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		LesThonsRougesMod.addNetworkMessage(XeathermakerButtonMessage.class, XeathermakerButtonMessage::buffer, XeathermakerButtonMessage::new, XeathermakerButtonMessage::handler);
	}
}
