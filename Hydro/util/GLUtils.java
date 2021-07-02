package Hydro.util;

import org.lwjgl.opengl.*;
import java.util.*;

public final class GLUtils
{
    private static final List<Integer> depth;

    public static void pre() {
        if (GLUtils.depth.isEmpty()) {
            GL11.glClearDepth(1.0);
            GL11.glClear(256);
        }
    }

    public static void mask() {
        GLUtils.depth.add(0, GL11.glGetInteger(2932));
        GL11.glEnable(6145);
        GL11.glDepthMask(true);
        GL11.glDepthFunc(513);
        GL11.glColorMask(false, false, false, true);
    }

    public static void render() {
        render(514);
    }

    public static void render(final int gl) {
        GL11.glDepthFunc(gl);
        GL11.glColorMask(true, true, true, true);
    }

    public static void post() {
        GL11.glDepthFunc((int)GLUtils.depth.get(0));
        GLUtils.depth.remove(0);
    }

    public static double interpolate(final double current, final double old, final double scale) {
        return old + (current - old) * scale;
    }

    public static void startSmooth() {
        GL11.glEnable(2848);
        GL11.glEnable(2881);
        GL11.glEnable(2832);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glHint(3154, 4354);
        GL11.glHint(3155, 4354);
        GL11.glHint(3153, 4354);
    }

    public static void endSmooth() {
        GL11.glDisable(2848);
        GL11.glDisable(2881);
        GL11.glEnable(2832);
    }

    static {
        depth = new ArrayList<Integer>();
    }
}