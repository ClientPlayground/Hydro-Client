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

import Hydro.script.runtime.minecraft.util.WrapperIChatComponent;
import net.minecraft.client.gui.GuiIngame;

public class WrapperGuiIngame extends WrapperGui {
    private GuiIngame real;

    public WrapperGuiIngame(GuiIngame var1) {
        super(var1);
        this.real = var1;
    }

    public GuiIngame unwrap() {
        return this.real;
    }


    public void renderGameOverlay(float var1) {
        this.real.renderGameOverlay(var1);
    }

    public void renderHorseJumpBar(WrapperScaledResolution var1, int var2) {
        this.real.renderHorseJumpBar(var1.unwrap(), var2);
    }

    public void renderExpBar(WrapperScaledResolution var1, int var2) {
        this.real.renderExpBar(var1.unwrap(), var2);
    }

    public void renderDemo(WrapperScaledResolution var1) {
        this.real.renderDemo(var1.unwrap());
    }

    public void renderStreamIndicator(WrapperScaledResolution var1) {
        this.real.renderStreamIndicator(var1.unwrap());
    }

    public void updateTick() {
        this.real.updateTick();
    }

    public void setRecordPlayingMessage(String var1) {
        this.real.setRecordPlayingMessage(var1);
    }

    public void setRecordPlaying(String var1, boolean var2) {
        this.real.setRecordPlaying(var1, var2);
    }

    public void displayTitle(String var1, String var2, int var3, int var4, int var5) {
        this.real.displayTitle(var1, var2, var3, var4, var5);
    }

    public void setRecordPlaying(WrapperIChatComponent var1, boolean var2) {
        this.real.setRecordPlaying(var1.unwrap(), var2);
    }

    public WrapperGuiNewChat getChatGUI() {
        return new WrapperGuiNewChat(this.real.getChatGUI());
    }

    public int getUpdateCounter() {
        return this.real.getUpdateCounter();
    }

    public WrapperFontRenderer getFontRenderer() {
        return new WrapperFontRenderer(this.real.getFontRenderer());
    }


    public float getPrevVignetteBrightness() {
        return this.real.prevVignetteBrightness;
    }

    public void setPrevVignetteBrightness(float var1) {
        this.real.prevVignetteBrightness = var1;
    }
}
