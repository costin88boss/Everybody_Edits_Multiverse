package com.costin.eem.net.protocol.world.server;

import com.costin.eem.net.Packet;

public class ServerPlayerJoinPacket extends Packet {
    public String nickname;
    public float spawnX;
    public float spawnY;
    public int smileyID;
    public int auraID;
    public boolean goldMode;

    public ServerPlayerJoinPacket(String nickname, float spawnX, float spawnY, int smileyID, int auraID, boolean goldMode) {
        this.nickname = nickname;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.smileyID = smileyID;
        this.auraID = auraID;
        this.goldMode = goldMode;
    }
}
