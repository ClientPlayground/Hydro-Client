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

import net.minecraft.util.Vec4b;

public class WrapperVec4b {
    private Vec4b real;

    public WrapperVec4b(Vec4b var1) {
        this.real = var1;
    }

    public Vec4b unwrap() {
        return this.real;
    }

    public byte func_176110_a() {
        return this.real.func_176110_a();
    }

    public byte func_176112_b() {
        return this.real.func_176112_b();
    }

    public byte func_176113_c() {
        return this.real.func_176113_c();
    }

    public byte func_176111_d() {
        return this.real.func_176111_d();
    }

    public boolean equals(Object var1) {
        return this.real.equals(var1);
    }

    public int hashCode() {
        return this.real.hashCode();
    }
}
