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

import net.minecraft.util.Vec3;

public class WrapperVec3 {
    private Vec3 real;

    public WrapperVec3(Vec3 var1) {
        this.real = var1;
    }

    public Vec3 unwrap() {
        return this.real;
    }

    public WrapperVec3 subtractReverse(WrapperVec3 var1) {
        return new WrapperVec3(this.real.subtractReverse(var1.unwrap()));
    }

    public WrapperVec3 normalize() {
        return new WrapperVec3(this.real.normalize());
    }

    public double dotProduct(WrapperVec3 var1) {
        return this.real.dotProduct(var1.unwrap());
    }

    public WrapperVec3 crossProduct(WrapperVec3 var1) {
        return new WrapperVec3(this.real.crossProduct(var1.unwrap()));
    }

    public WrapperVec3 subtract(WrapperVec3 var1) {
        return new WrapperVec3(this.real.subtract(var1.unwrap()));
    }

    public WrapperVec3 subtract(double param1, double param3, double param5) {
        return new WrapperVec3(real.subtract(param1, param3, param5));
    }

    public WrapperVec3 add(WrapperVec3 var1) {
        return new WrapperVec3(this.real.add(var1.unwrap()));
    }

    public WrapperVec3 addVector(double param1, double param3, double param5) {
        return new WrapperVec3(real.addVector(param1, param3, param5));
    }

    public double distanceTo(WrapperVec3 var1) {
        return this.real.distanceTo(var1.unwrap());
    }

    public double squareDistanceTo(WrapperVec3 var1) {
        return this.real.squareDistanceTo(var1.unwrap());
    }

    public double lengthVector() {
        return this.real.lengthVector();
    }

    public WrapperVec3 getIntermediateWithXValue(WrapperVec3 var1, double var2) {
        return new WrapperVec3(this.real.getIntermediateWithXValue(var1.unwrap(), var2));
    }

    public WrapperVec3 getIntermediateWithYValue(WrapperVec3 var1, double var2) {
        return new WrapperVec3(this.real.getIntermediateWithYValue(var1.unwrap(), var2));
    }

    public WrapperVec3 getIntermediateWithZValue(WrapperVec3 var1, double var2) {
        return new WrapperVec3(this.real.getIntermediateWithZValue(var1.unwrap(), var2));
    }

    public String toString() {
        return this.real.toString();
    }

    public WrapperVec3 rotatePitch(float var1) {
        return new WrapperVec3(this.real.rotatePitch(var1));
    }

    public WrapperVec3 rotateYaw(float var1) {
        return new WrapperVec3(this.real.rotateYaw(var1));
    }

    public double getXCoord() {
        return this.real.xCoord;
    }

    public double getYCoord() {
        return this.real.yCoord;
    }

    public double getZCoord() {
        return this.real.zCoord;
    }
}
