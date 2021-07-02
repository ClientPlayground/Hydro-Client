/*
 * Copyright (c) 2018 superblaubeere27
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package Hydro.script.runtime.minecraft.client.multiplayer;

import Hydro.script.runtime.minecraft.block.state.WrapperIBlockState;
import Hydro.script.runtime.minecraft.entity.WrapperEntity;
import Hydro.script.runtime.minecraft.util.WrapperBlockPos;
import Hydro.script.runtime.minecraft.world.WrapperWorld;
import net.minecraft.client.multiplayer.WorldClient;

public class WrapperWorldClient extends WrapperWorld {
    private WorldClient real;

    public WrapperWorldClient(WorldClient var1) {
        super(var1);
        this.real = var1;
    }

    public WorldClient unwrap() {
        return this.real;
    }

    public void tick() {
        this.real.tick();
    }

    public void invalidateBlockReceiveRegion(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.real.invalidateBlockReceiveRegion(var1, var2, var3, var4, var5, var6);
    }

    public void doPreChunk(int var1, int var2, boolean var3) {
        this.real.doPreChunk(var1, var2, var3);
    }

    public boolean spawnEntityInWorld(WrapperEntity var1) {
        return this.real.spawnEntityInWorld(var1.unwrap());
    }

    public void removeEntity(WrapperEntity var1) {
        this.real.removeEntity(var1.unwrap());
    }

    public void addEntityToWorld(int var1, WrapperEntity var2) {
        this.real.addEntityToWorld(var1, var2.unwrap());
    }

    public WrapperEntity getEntityByID(int var1) {
        return new WrapperEntity(this.real.getEntityByID(var1));
    }

    public WrapperEntity removeEntityFromWorld(int var1) {
        return new WrapperEntity(this.real.removeEntityFromWorld(var1));
    }

    public boolean invalidateRegionAndSetBlock(WrapperBlockPos var1, WrapperIBlockState var2) {
        return this.real.invalidateRegionAndSetBlock(var1.unwrap(), var2.unwrap());
    }

    public void sendQuittingDisconnectingPacket() {
        this.real.sendQuittingDisconnectingPacket();
    }

    public void doVoidFogParticles(int var1, int var2, int var3) {
        this.real.doVoidFogParticles(var1, var2, var3);
    }

    public void removeAllEntities() {
        this.real.removeAllEntities();
    }

    public void playSoundAtPos(WrapperBlockPos var1, String var2, float var3, float var4, boolean var5) {
        this.real.playSoundAtPos(var1.unwrap(), var2, var3, var4, var5);
    }

    public void playSound(double param1, double param3, double param5, String param7, float param8, float param9, boolean param10) {
        real.playSound(param1, param3, param5, param7, param8, param9, param10);
    }

    public void setWorldTime(long var1) {
        this.real.setWorldTime(var1);
    }
}
