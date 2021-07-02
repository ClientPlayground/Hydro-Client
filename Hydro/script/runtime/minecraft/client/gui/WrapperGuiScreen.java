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

import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;

import Hydro.script.runtime.minecraft.client.WrapperMinecraft;

public class WrapperGuiScreen extends WrapperGui {
    private GuiScreen real;

    public WrapperGuiScreen(GuiScreen var1) {
        super(var1);
        this.real = var1;
    }

    public static String getClipboardString() {
        return GuiScreen.getClipboardString();
    }

    public static void setClipboardString(String var0) {
        GuiScreen.setClipboardString(var0);
    }

    public static boolean isCtrlKeyDown() {
        return GuiScreen.isCtrlKeyDown();
    }

    public static boolean isShiftKeyDown() {
        return GuiScreen.isShiftKeyDown();
    }

    public static boolean isAltKeyDown() {
        return GuiScreen.isAltKeyDown();
    }

    public static boolean isKeyComboCtrlX(int var0) {
        return GuiScreen.isKeyComboCtrlX(var0);
    }

    public static boolean isKeyComboCtrlV(int var0) {
        return GuiScreen.isKeyComboCtrlV(var0);
    }

    public static boolean isKeyComboCtrlC(int var0) {
        return GuiScreen.isKeyComboCtrlC(var0);
    }

    public static boolean isKeyComboCtrlA(int var0) {
        return GuiScreen.isKeyComboCtrlA(var0);
    }

    public GuiScreen unwrap() {
        return this.real;
    }

    public void drawScreen(int var1, int var2, float var3) {
        this.real.drawScreen(var1, var2, var3);
    }

    public void sendChatMessage(String var1) {
        this.real.sendChatMessage(var1);
    }

    public void sendChatMessage(String var1, boolean var2) {
        this.real.sendChatMessage(var1, var2);
    }

    public void setWorldAndResolution(WrapperMinecraft var1, int var2, int var3) {
        this.real.setWorldAndResolution(var1.unwrap(), var2, var3);
    }

    public void initGui() {
        this.real.initGui();
    }

    public void handleInput() throws IOException {
        this.real.handleInput();
    }

    public void handleMouseInput() throws IOException {
        this.real.handleMouseInput();
    }

    public void handleKeyboardInput() throws IOException {
        this.real.handleKeyboardInput();
    }

    public void updateScreen() {
        this.real.updateScreen();
    }

    public void onGuiClosed() {
        this.real.onGuiClosed();
    }

    public void drawDefaultBackground() {
        this.real.drawDefaultBackground();
    }

    public void drawWorldBackground(int var1) {
        this.real.drawWorldBackground(var1);
    }

    public void drawBackground(int var1) {
        this.real.drawBackground(var1);
    }

    public boolean doesGuiPauseGame() {
        return this.real.doesGuiPauseGame();
    }

    public void confirmClicked(boolean var1, int var2) {
        this.real.confirmClicked(var1, var2);
    }

    public void onResize(WrapperMinecraft var1, int var2, int var3) {
        this.real.onResize(var1.unwrap(), var2, var3);
    }

    public int getWidth() {
        return this.real.width;
    }

    public void setWidth(int var1) {
        this.real.width = var1;
    }

    public int getHeight() {
        return this.real.height;
    }

    public void setHeight(int var1) {
        this.real.height = var1;
    }

    public boolean isAllowUserInput() {
        return this.real.allowUserInput;
    }

    public void setAllowUserInput(boolean var1) {
        this.real.allowUserInput = var1;
    }
}
