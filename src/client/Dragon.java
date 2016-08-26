/*

package client;

import tools.MaplePacketCreator;

public class Dragon extends AnimatedMapleMapObject {

    private int owner;

    public Dragon(MapleCharacter owner) {
        super();
        this.owner = owner.getId();
        if (!GameConstants.is_evan_job(owner.getJob().getId())) {
            throw new RuntimeException("Trying to create a dragon for a non-Evan");
        }
        setPosition(owner.getTruePosition());
    }

    @Override
    public void sendSpawnData(MapleClient client) {
        client.getSession().write(MaplePacketCreator.OnDragonEnterField(this));
    }

    @Override
    public void sendDestroyData(MapleClient client) {
        client.getSession().write(MaplePacketCreator.OnDragonLeaveField(this));
    }

    public int getOwner() {
        return owner;
    }

    @Override
    public MapleMapObjectType getType() {
        return MapleMapObjectType.SUMMON;
    }
}  */