/*
 * Copyright (c) 2018 superblaubeere27
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package Hydro.script.runtime.minecraft.util;

import net.minecraft.util.BlockPos;

public class WrapperBlockPos extends WrapperVec3i {
    private BlockPos real;

    public WrapperBlockPos(BlockPos var1) {
        super(var1);
        this.real = var1;
    }

    public static WrapperBlockPos fromLong(long var0) {
        return new WrapperBlockPos(BlockPos.fromLong(var0));
    }

    public static Iterable getAllInBox(WrapperBlockPos var0, WrapperBlockPos var1) {
        return BlockPos.getAllInBox(var0.unwrap(), var1.unwrap());
    }

    public static Iterable getAllInBoxMutable(WrapperBlockPos var0, WrapperBlockPos var1) {
        return BlockPos.getAllInBoxMutable(var0.unwrap(), var1.unwrap());
    }

    public BlockPos unwrap() {
        return this.real;
    }

    public WrapperBlockPos add(double param1, double param3, double param5) {
        return new WrapperBlockPos(real.add(param1, param3, param5));
    }

    public WrapperBlockPos add(int var1, int var2, int var3) {
        return new WrapperBlockPos(this.real.add(var1, var2, var3));
    }

    public WrapperBlockPos add(WrapperVec3i var1) {
        return new WrapperBlockPos(this.real.add(var1.unwrap()));
    }

    public WrapperBlockPos subtract(WrapperVec3i var1) {
        return new WrapperBlockPos(this.real.subtract(var1.unwrap()));
    }

    public WrapperBlockPos up() {
        return new WrapperBlockPos(this.real.up());
    }

    public WrapperBlockPos up(int var1) {
        return new WrapperBlockPos(this.real.up(var1));
    }

    public WrapperBlockPos down() {
        return new WrapperBlockPos(this.real.down());
    }

    public WrapperBlockPos down(int var1) {
        return new WrapperBlockPos(this.real.down(var1));
    }

    public WrapperBlockPos north() {
        return new WrapperBlockPos(this.real.north());
    }

    public WrapperBlockPos north(int var1) {
        return new WrapperBlockPos(this.real.north(var1));
    }

    public WrapperBlockPos south() {
        return new WrapperBlockPos(this.real.south());
    }

    public WrapperBlockPos south(int var1) {
        return new WrapperBlockPos(this.real.south(var1));
    }

    public WrapperBlockPos west() {
        return new WrapperBlockPos(this.real.west());
    }

    public WrapperBlockPos west(int var1) {
        return new WrapperBlockPos(this.real.west(var1));
    }

    public WrapperBlockPos east() {
        return new WrapperBlockPos(this.real.east());
    }

    public WrapperBlockPos east(int var1) {
        return new WrapperBlockPos(this.real.east(var1));
    }

    public WrapperBlockPos offset(WrapperEnumFacing var1) {
        return new WrapperBlockPos(this.real.offset(var1.unwrap()));
    }

    public WrapperBlockPos offset(WrapperEnumFacing var1, int var2) {
        return new WrapperBlockPos(this.real.offset(var1.unwrap(), var2));
    }

    public WrapperBlockPos crossProduct(WrapperVec3i var1) {
        return new WrapperBlockPos(this.real.crossProduct(var1.unwrap()));
    }

    public long toLong() {
        return this.real.toLong();
    }

    public WrapperBlockPos getORIGIN() {
        return new WrapperBlockPos(BlockPos.ORIGIN);
    }
}
