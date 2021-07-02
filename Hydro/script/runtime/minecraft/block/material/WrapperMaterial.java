/*
 * Copyright (c) 2018 superblaubeere27
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package Hydro.script.runtime.minecraft.block.material;

import net.minecraft.block.material.Material;

public class WrapperMaterial {
    private Material real;

    public WrapperMaterial(Material var1) {
        this.real = var1;
    }

    public Material unwrap() {
        return this.real;
    }

    public boolean isLiquid() {
        return this.real.isLiquid();
    }

    public boolean isSolid() {
        return this.real.isSolid();
    }

    public boolean blocksLight() {
        return this.real.blocksLight();
    }

    public boolean blocksMovement() {
        return this.real.blocksMovement();
    }

    public boolean getCanBurn() {
        return this.real.getCanBurn();
    }

    public WrapperMaterial setReplaceable() {
        return new WrapperMaterial(this.real.setReplaceable());
    }

    public boolean isReplaceable() {
        return this.real.isReplaceable();
    }

    public boolean isOpaque() {
        return this.real.isOpaque();
    }

    public boolean isToolNotRequired() {
        return this.real.isToolNotRequired();
    }

    public int getMaterialMobility() {
        return this.real.getMaterialMobility();
    }

    public WrapperMaterial getAir() {
        return new WrapperMaterial(Material.air);
    }

    public WrapperMaterial getGrass() {
        return new WrapperMaterial(Material.grass);
    }

    public WrapperMaterial getGround() {
        return new WrapperMaterial(Material.ground);
    }

    public WrapperMaterial getWood() {
        return new WrapperMaterial(Material.wood);
    }

    public WrapperMaterial getRock() {
        return new WrapperMaterial(Material.rock);
    }

    public WrapperMaterial getIron() {
        return new WrapperMaterial(Material.iron);
    }

    public WrapperMaterial getAnvil() {
        return new WrapperMaterial(Material.anvil);
    }

    public WrapperMaterial getWater() {
        return new WrapperMaterial(Material.water);
    }

    public WrapperMaterial getLava() {
        return new WrapperMaterial(Material.lava);
    }

    public WrapperMaterial getLeaves() {
        return new WrapperMaterial(Material.leaves);
    }

    public WrapperMaterial getPlants() {
        return new WrapperMaterial(Material.plants);
    }

    public WrapperMaterial getVine() {
        return new WrapperMaterial(Material.vine);
    }

    public WrapperMaterial getSponge() {
        return new WrapperMaterial(Material.sponge);
    }

    public WrapperMaterial getCloth() {
        return new WrapperMaterial(Material.cloth);
    }

    public WrapperMaterial getFire() {
        return new WrapperMaterial(Material.fire);
    }

    public WrapperMaterial getSand() {
        return new WrapperMaterial(Material.sand);
    }

    public WrapperMaterial getCircuits() {
        return new WrapperMaterial(Material.circuits);
    }

    public WrapperMaterial getCarpet() {
        return new WrapperMaterial(Material.carpet);
    }

    public WrapperMaterial getGlass() {
        return new WrapperMaterial(Material.glass);
    }

    public WrapperMaterial getRedstoneLight() {
        return new WrapperMaterial(Material.redstoneLight);
    }

    public WrapperMaterial getTnt() {
        return new WrapperMaterial(Material.tnt);
    }

    public WrapperMaterial getCoral() {
        return new WrapperMaterial(Material.coral);
    }

    public WrapperMaterial getIce() {
        return new WrapperMaterial(Material.ice);
    }

    public WrapperMaterial getPackedIce() {
        return new WrapperMaterial(Material.packedIce);
    }

    public WrapperMaterial getSnow() {
        return new WrapperMaterial(Material.snow);
    }

    public WrapperMaterial getCraftedSnow() {
        return new WrapperMaterial(Material.craftedSnow);
    }

    public WrapperMaterial getCactus() {
        return new WrapperMaterial(Material.cactus);
    }

    public WrapperMaterial getClay() {
        return new WrapperMaterial(Material.clay);
    }

    public WrapperMaterial getGourd() {
        return new WrapperMaterial(Material.gourd);
    }

    public WrapperMaterial getDragonEgg() {
        return new WrapperMaterial(Material.dragonEgg);
    }

    public WrapperMaterial getPortal() {
        return new WrapperMaterial(Material.portal);
    }

    public WrapperMaterial getCake() {
        return new WrapperMaterial(Material.cake);
    }

    public WrapperMaterial getWeb() {
        return new WrapperMaterial(Material.web);
    }

    public WrapperMaterial getPiston() {
        return new WrapperMaterial(Material.piston);
    }

    public WrapperMaterial getBarrier() {
        return new WrapperMaterial(Material.barrier);
    }
}
