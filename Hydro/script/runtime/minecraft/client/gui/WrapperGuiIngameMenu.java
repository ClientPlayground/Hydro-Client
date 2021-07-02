/*
 * Copyright (c) 2018 superblaubeere27
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package Hydro.script.runtime.minecraft.client.gui;

import net.minecraft.client.gui.GuiIngameMenu;

public class WrapperGuiIngameMenu extends WrapperGuiScreen {
    private GuiIngameMenu real;

    public WrapperGuiIngameMenu(GuiIngameMenu var1) {
        super(var1);
        this.real = var1;
    }

    public GuiIngameMenu unwrap() {
        return this.real;
    }

    public void initGui() {
        this.real.initGui();
    }

    public void updateScreen() {
        this.real.updateScreen();
    }

    public void drawScreen(int var1, int var2, float var3) {
        this.real.drawScreen(var1, var2, var3);
    }
}
