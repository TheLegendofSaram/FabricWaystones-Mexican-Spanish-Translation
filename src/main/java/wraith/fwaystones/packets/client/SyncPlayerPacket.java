package wraith.fwaystones.packets.client;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import wraith.fwaystones.FabricWaystones;

public record SyncPlayerPacket(NbtCompound tag) implements CustomPayload{
    public static final Id PACKET_ID = new Id<>(Identifier.of(FabricWaystones.MOD_ID, "sync_player"));
    public static final PacketCodec CODEC = PacketCodec.tuple(
            PacketCodecs.NBT_COMPOUND,
            SyncPlayerPacket::tag,
            SyncPlayerPacket::new
    );

    public Id getId() {
        return PACKET_ID;
    }
}
